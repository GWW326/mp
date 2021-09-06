package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycLendingrateEntity;
import com.grgbanking.psbc.dao.CqycLendingrateDao;
import com.grgbanking.psbc.service.CqycLendingrateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 贷款利率 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycLendingrateServiceImpl extends ServiceImpl<CqycLendingrateDao, CqycLendingrateEntity> implements CqycLendingrateService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycLendingrateEntity> wherePage = new Page<>(page, pageCount);
    CqycLendingrateEntity where = new CqycLendingrateEntity();

    IPage<CqycLendingrateEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycLendingrateEntity cqycLendingrateEntity){
    baseMapper.insert(cqycLendingrateEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycLendingrateEntity cqycLendingrateEntity){
    baseMapper.updateById(cqycLendingrateEntity);
    return Resp.ok("更新成功");
    }
    }
