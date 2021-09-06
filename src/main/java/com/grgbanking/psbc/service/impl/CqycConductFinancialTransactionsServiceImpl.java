package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycConductFinancialTransactionsEntity;
import com.grgbanking.psbc.dao.CqycConductFinancialTransactionsDao;
import com.grgbanking.psbc.service.CqycConductFinancialTransactionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 理财产品 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycConductFinancialTransactionsServiceImpl extends ServiceImpl<CqycConductFinancialTransactionsDao, CqycConductFinancialTransactionsEntity> implements CqycConductFinancialTransactionsService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycConductFinancialTransactionsEntity> wherePage = new Page<>(page, pageCount);
    CqycConductFinancialTransactionsEntity where = new CqycConductFinancialTransactionsEntity();

    IPage<CqycConductFinancialTransactionsEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycConductFinancialTransactionsEntity cqycConductFinancialTransactionsEntity){
    baseMapper.insert(cqycConductFinancialTransactionsEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycConductFinancialTransactionsEntity cqycConductFinancialTransactionsEntity){
    baseMapper.updateById(cqycConductFinancialTransactionsEntity);
    return Resp.ok("更新成功");
    }
    }
