package com.govin.mp.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.govin.mp.imports.service.ICPicrecordService;
import com.govin.mp.user.entity.User;
import com.govin.mp.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gww
 * @since 2020-08-14
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier(value = "cPicrecordServiceImpl")
    private ICPicrecordService iCPicrecordService;

    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService iUserService;
    @RequestMapping("/findOne")
    public User findOne(){
        User one = iUserService.getOne(Wrappers. <User>query().eq("name", "Tom"));
        return one;
    }

    /**
     * 无条件分页
     * @return
     */
    @RequestMapping("/findByPage")
    public List <User> findByPage(){
        QueryWrapper <User> query = Wrappers.<User>query();
        query.eq("name","Jack").or().eq("name","Sandy");
        Page <User> page = iUserService.page(new Page <>(1, 2),Wrappers.query());
        System.out.println("总页数"+page.getPages());
        System.out.println("总记录数"+page.getTotal());
        List <User> records = page.getRecords();
        records.forEach(s-> System.out.println(s.toString()));
        return records;
    }
}
