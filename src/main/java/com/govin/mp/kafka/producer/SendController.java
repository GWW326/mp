package com.govin.mp.kafka.producer;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.govin.mp.kafka.dto.CarInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Xiaour
 * @Description:
 * @Date: 2018/5/22 15:13
 */
@RestController
@Api(tags = "车辆信息相关接口")
@RequestMapping("/kafka")
public class SendController {
    @Autowired
    private SolrTemplate template;
    @Autowired
    private Producer producer;

    @RequestMapping(value = "/send")
    public String send() {
        producer.send();
        return "{\"code\":0}";
    }
    @RequestMapping(value = "/sendCarData")
    @ApiOperation("发送消息的接口")
    public String sendCarData() {
        try {
            producer.sendCarDatas();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"code\":1}";
    }
    @RequestMapping(value = "/test")
    public String test() {
        producer.send();
        return "{\"code\":\"test\"}";
    }
    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("测试添加")
    public void save(){
        CarInfoDTO carInfoDTO = new CarInfoDTO();
        carInfoDTO.setId(123456L);
        carInfoDTO.setDevId(0L);
        carInfoDTO.setDevChnNum(0);
        carInfoDTO.setDevName("花园2");
        carInfoDTO.setDevChnName("西东2");
        carInfoDTO.setCarNum("NB1102");
        carInfoDTO.setCarNumType(0);
        carInfoDTO.setCarNumColor(0);
        carInfoDTO.setCarType(0);
        carInfoDTO.setCapDate(LocalDateTime.now());


        template.saveBean("c_picrecord_1",carInfoDTO);
        template.commit("c_picrecord_1");
    }
}
