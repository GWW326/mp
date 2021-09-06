package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.CqycAssetManagementEntity;
import com.grgbanking.psbc.dao.CqycAssetManagementDao;
import com.grgbanking.psbc.service.CqycAssetManagementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    * 资产管理 服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class CqycAssetManagementServiceImpl extends ServiceImpl<CqycAssetManagementDao, CqycAssetManagementEntity> implements CqycAssetManagementService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<CqycAssetManagementEntity> wherePage = new Page<>(page, pageCount);
    CqycAssetManagementEntity where = new CqycAssetManagementEntity();

    IPage<CqycAssetManagementEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(CqycAssetManagementEntity cqycAssetManagementEntity){
    baseMapper.insert(cqycAssetManagementEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(CqycAssetManagementEntity cqycAssetManagementEntity){
    baseMapper.updateById(cqycAssetManagementEntity);
    return Resp.ok("更新成功");
    }
    }
