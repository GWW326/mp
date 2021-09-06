package com.grgbanking.psbc.service;

import com.grgbanking.psbc.entity.PlayerRecordEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grgbanking.ibank.common.core.util.Resp;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
public interface PlayerRecordService extends IService<PlayerRecordEntity> {
 /**
 * 查询分页数据
 *
 * @param projectId 项目id
 * @param page      页码
 * @param pageCount 每页条数
 * @return Resp
 */
 Resp findListByPage( Integer page, Integer pageCount);

 /**
 * 添加
 *
 * @param playerRecordEntity 信息
 * @return Resp
 */
 Resp add(PlayerRecordEntity playerRecordEntity);

 /**
 * 删除
 *
 * @param id 主键
 * @return Resp
 */
 Resp delete(Long id);

 /**
 * 修改信息
 *
 * @param playerRecordEntity 信息
 * @return Resp
 */
 Resp updateData(PlayerRecordEntity playerRecordEntity);
}
