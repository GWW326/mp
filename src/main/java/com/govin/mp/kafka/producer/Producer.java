package com.govin.mp.kafka.producer;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.govin.mp.imports.entity.CPicrecord;
import com.govin.mp.imports.service.ICPicrecordService;
import com.govin.mp.kafka.dto.CarInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/22 15:07
 */
@Component
public class Producer {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    @Qualifier("cPicrecordServiceImpl")
    private ICPicrecordService iCPicrecordService;
    private static Gson gson = new GsonBuilder().create();

    //发送消息方法
    public void send() {
        Message message = new Message();
        message.setId("KFK_"+System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        kafkaTemplate.send("test", gson.toJson(message));
    }
    //发送消息方法
    public void sendCarDatas() throws JsonProcessingException {
        List <CPicrecord> carList = getCarList();
       // kafkaTemplate.send("CAR_DATA_TOPIC", objectMapper.writeValueAsString(carInfoDTO))
        carList.forEach(s-> {
            try {
                kafkaTemplate.send("CAR_DATA_TOPIC", objectMapper.writeValueAsString(s));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });

    }
    public List<CPicrecord> getCarList(){
        //Executors.newWorkStealingPool();
        Page<CPicrecord> page = iCPicrecordService.page(new Page <>(1, 100));
        List <CPicrecord> result = page.getRecords();
        return result;
    }
}
