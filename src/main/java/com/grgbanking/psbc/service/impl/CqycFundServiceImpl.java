package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycFundEntity;
import com.grgbanking.psbc.dao.CqycFundDao;
import com.grgbanking.psbc.service.CqycFundService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 基金 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycFundServiceImpl extends ServiceImpl<CqycFundDao, CqycFundEntity> implements CqycFundService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycFundEntity> wherePage = new Page<>(page, pageCount);
    CqycFundEntity where = new CqycFundEntity();

    IPage<CqycFundEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycFundEntity cqycFundEntity){
    baseMapper.insert(cqycFundEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycFundEntity cqycFundEntity){
    baseMapper.updateById(cqycFundEntity);
    return Resp.ok("更新成功");
    }
    }
