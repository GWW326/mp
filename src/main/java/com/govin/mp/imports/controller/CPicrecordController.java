package com.govin.mp.imports.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.govin.mp.imports.entity.CPicrecord;
import com.govin.mp.imports.service.ICPicrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 车牌识别数据
 前端控制器
 * </p>
 *
 * @author gww
 * @since 2020-08-21
 */
@RestController
@RequestMapping("/search/c-picrecord")
public class CPicrecordController {
    @Autowired
    @Qualifier("cPicrecordServiceImpl")
    private ICPicrecordService iCPicrecordService;
   @RequestMapping("/page")
    public String findByPage(){
        Page <CPicrecord> page = iCPicrecordService.page(new Page <>(1, 10));
        List <CPicrecord> records = page.getRecords();
        ObjectMapper objectMapper = new ObjectMapper();
        String result = null;
        try {
            result = objectMapper.writeValueAsString(records);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
