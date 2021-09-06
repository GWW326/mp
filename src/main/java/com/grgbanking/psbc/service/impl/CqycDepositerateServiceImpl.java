package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycDepositerateEntity;
import com.grgbanking.psbc.dao.CqycDepositerateDao;
import com.grgbanking.psbc.service.CqycDepositerateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 存款利率 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycDepositerateServiceImpl extends ServiceImpl<CqycDepositerateDao, CqycDepositerateEntity> implements CqycDepositerateService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycDepositerateEntity> wherePage = new Page<>(page, pageCount);
    CqycDepositerateEntity where = new CqycDepositerateEntity();

    IPage<CqycDepositerateEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycDepositerateEntity cqycDepositerateEntity){
    baseMapper.insert(cqycDepositerateEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycDepositerateEntity cqycDepositerateEntity){
    baseMapper.updateById(cqycDepositerateEntity);
    return Resp.ok("更新成功");
    }
    }
