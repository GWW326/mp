package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycExchangeRateEntity;
import com.grgbanking.psbc.dao.CqycExchangeRateDao;
import com.grgbanking.psbc.service.CqycExchangeRateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 外汇牌价 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycExchangeRateServiceImpl extends ServiceImpl<CqycExchangeRateDao, CqycExchangeRateEntity> implements CqycExchangeRateService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycExchangeRateEntity> wherePage = new Page<>(page, pageCount);
    CqycExchangeRateEntity where = new CqycExchangeRateEntity();

    IPage<CqycExchangeRateEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycExchangeRateEntity cqycExchangeRateEntity){
    baseMapper.insert(cqycExchangeRateEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycExchangeRateEntity cqycExchangeRateEntity){
    baseMapper.updateById(cqycExchangeRateEntity);
    return Resp.ok("更新成功");
    }
    }
