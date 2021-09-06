package com.govin.mp.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.govin.mp.imports.entity.CPicrecord;
import com.govin.mp.kafka.dto.CarInfoDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/22 15:03
 */
@Component
public class Consumer {

    @Autowired
    private SolrTemplate solrTemplate;
    private static Gson gson = new GsonBuilder().create();
    @Autowired
    private ObjectMapper objectMapper;
    @KafkaListener(topics = "test")
    public void listen(ConsumerRecord<?, ?> record){

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();
            System.out.println("---->"+record);
            System.out.println("---->"+message);

        }

    }
    @KafkaListener(topics = "CAR_DATA_TOPIC")
    public void listenCarData(ConsumerRecord<String, String> record) throws JsonProcessingException {
        String json= record.value();
        String key = record.key();
        int partition = record.partition();
        System.out.println("partition--"+partition);
          long offset = record.offset();
        System.out.println("offset--"+offset +"key-"+key);


        CarInfoDTO carInfoDTO = objectMapper.readValue(json, CarInfoDTO.class);
        System.out.println("插入的---"+carInfoDTO);
        try {
            solrTemplate.saveBean("c_picrecord_1",carInfoDTO);
            solrTemplate.commit("c_picrecord_1");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private CarInfoDTO setCarInfo(Map map) {
        CarInfoDTO carInfoDTO = new CarInfoDTO();
        carInfoDTO.setId((Long)map.get("id"));
        carInfoDTO.setCarNum((String)map.get("carNum"));
        carInfoDTO.setCarNumColor((Integer) map.get("carNumColor"));
        return carInfoDTO;
    }
}
