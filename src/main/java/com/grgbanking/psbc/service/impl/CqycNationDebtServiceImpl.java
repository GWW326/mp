package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycNationDebtEntity;
import com.grgbanking.psbc.dao.CqycNationDebtDao;
import com.grgbanking.psbc.service.CqycNationDebtService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 国债 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycNationDebtServiceImpl extends ServiceImpl<CqycNationDebtDao, CqycNationDebtEntity> implements CqycNationDebtService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycNationDebtEntity> wherePage = new Page<>(page, pageCount);
    CqycNationDebtEntity where = new CqycNationDebtEntity();

    IPage<CqycNationDebtEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycNationDebtEntity cqycNationDebtEntity){
    baseMapper.insert(cqycNationDebtEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycNationDebtEntity cqycNationDebtEntity){
    baseMapper.updateById(cqycNationDebtEntity);
    return Resp.ok("更新成功");
    }
    }
