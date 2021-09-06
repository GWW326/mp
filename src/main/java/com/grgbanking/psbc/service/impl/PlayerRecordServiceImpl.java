package com.grgbanking.psbc.service.impl;

import com.grgbanking.psbc.entity.PlayerRecordEntity;
import com.grgbanking.psbc.dao.PlayerRecordDao;
import com.grgbanking.psbc.service.PlayerRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.grgbanking.ibank.common.core.util.Resp;
/**
* <p>
    *  服务实现类
    * </p>
*
* @author gwwen
* @since 2021-09-06
*/
@Service
    public class PlayerRecordServiceImpl extends ServiceImpl<PlayerRecordDao, PlayerRecordEntity> implements PlayerRecordService {
   
    @Override
    public Resp findListByPage( Integer page, Integer pageCount){
    IPage<PlayerRecordEntity> wherePage = new Page<>(page, pageCount);
    PlayerRecordEntity where = new PlayerRecordEntity();

    IPage<PlayerRecordEntity> iPage = baseMapper.selectPage(wherePage, Wrappers.query(where));

    return Resp.ok(iPage.getRecords());
    }

    @Override
    public Resp add(PlayerRecordEntity playerRecordEntity){
    baseMapper.insert(playerRecordEntity);
    return Resp.ok("添加成功");
    }

    @Override
    public Resp delete(Long id){
    baseMapper.deleteById(id);
    return Resp.ok("删除成功");
    }

    @Override
    public Resp updateData(PlayerRecordEntity playerRecordEntity){
    baseMapper.updateById(playerRecordEntity);
    return Resp.ok("更新成功");
    }
    }
