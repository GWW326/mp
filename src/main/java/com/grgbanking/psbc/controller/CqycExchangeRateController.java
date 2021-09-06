package com.grgbanking.psbc.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.grgbanking.psbc.service.CqycExchangeRateService;
import com.grgbanking.psbc.entity.CqycExchangeRateEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.grgbanking.ibank.common.core.util.Resp;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 外汇牌价 前端控制器
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@RestController
@RequestMapping("/psbc/cqyc-exchange-rate-entity")
public class CqycExchangeRateController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    private CqycExchangeRateService qycExchangeRateService;

    @ApiOperation(value = "查询分页数据")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "page", value = "页码"),
    @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @RequestMapping
    public Resp findListByPage(@RequestParam Integer page,
    @RequestParam Integer pageCount){
    try {
    return Resp.ok(qycExchangeRateService.findListByPage( page, pageCount));
    } catch (Exception e) {
    log.error(e.getMessage(), e);
    return Resp.error(e.toString());
    }
    }

    @ApiOperation(value = "新增数据")
    @PostMapping()
    public Resp add(@RequestBody CqycExchangeRateEntity cqycExchangeRateEntity){
    try {
    return Resp.ok(qycExchangeRateService.add(cqycExchangeRateEntity));
    } catch (Exception e) {
    log.error(e.getMessage(), e);
    return Resp.error(e.toString());
    }
    }

    @ApiOperation(value = "删除数据")
    @DeleteMapping("{id}")
    public Resp delete(@RequestParam("id") Long id){
    try {
    return Resp.ok(qycExchangeRateService.delete(id));
    } catch (Exception e) {
    log.error(e.getMessage(), e);
    return Resp.error(e.toString());
    }
    }

    @ApiOperation(value = "更新数据")
    @PutMapping()
    public Resp update(@RequestBody CqycExchangeRateEntity cqycExchangeRateEntity){
    try {
    return Resp.ok(qycExchangeRateService.updateData(cqycExchangeRateEntity));
    } catch (Exception e) {
    log.error(e.getMessage(), e);
    return Resp.error(e.toString());
    }
    }
}
