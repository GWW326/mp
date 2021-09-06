package com.govin.mp.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.govin.mp.kafka.dto.CarInfoDTO;
import com.govin.mp.kafka.producer.Producer;
import com.govin.mp.user.dto.UserCardDto;
import com.govin.mp.user.entity.Card;
import com.govin.mp.user.entity.User;
import com.govin.mp.user.mapper.UserMapper;
import com.govin.mp.user.service.ICardService;
import com.govin.mp.user.service.IUserService;
import org.apache.ibatis.javassist.ClassPath;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    @Qualifier("cardServiceImpl")
    private ICardService iCardService;
    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService iUserService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    ObjectMapper objectMapper;
    @Test
    public  void saveCard(){
        Card card = new Card();
        //card.setId(11111L);
        card.setUserName("zhansgan1");
        boolean save = iCardService.save(card);
        Long id = card.getId();
        System.out.println("id"+id);
    }
    @Test
    public void findAll(){
        QueryWrapper<User> query = Wrappers.<User>query();
        query.eq("name","Jack").or().eq("name","Sandy");
        Page<User> page = iUserService.page(new Page <>(1, 2),query);
        System.out.println("总页数"+page.getPages());
        System.out.println("总记录数"+page.getTotal());
        List<User> records = page.getRecords();
        records.forEach(s-> System.out.println(s.toString()));
    }
    @Test
    public void selectCardAndUser(){
        IPage <UserCardDto> page =
                userMapper.selectCardAndUser(new Page(2,2));
       // page.getRecords();
        page.getRecords().forEach(System.out::println);
    }
    @Test
    public void testProducer(){
        CarInfoDTO carInfoDTO = new CarInfoDTO();
        carInfoDTO.setCarNum("http://192.164.1.1:/dfd/dfdf");
        Object o = new CarInfoDTO(1L,2L);
        String s1 = null;
        try {
            s1 = objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        String s = "{\"id\":1,\"devId\":2}";
        System.out.println(s);
        try {
            CarInfoDTO carInfoDTO1 = objectMapper.readValue(s1, CarInfoDTO.class);
            System.out.println(carInfoDTO1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void interview(){
        int i= 0;

        for (foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');//ABCDBCD
        }

    }
    public Boolean foo(char a){
        System.out.print(a);
        return true;
    }
}
