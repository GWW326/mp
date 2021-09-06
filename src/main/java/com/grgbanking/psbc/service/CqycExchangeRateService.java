package com.grgbanking.psbc.service;

import com.grgbanking.psbc.entity.CqycExchangeRateEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grgbanking.ibank.common.core.util.Resp;
/**
 * <p>
 * 外汇牌价 服务类
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
public interface CqycExchangeRateService extends IService<CqycExchangeRateEntity> {
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
 * @param cqycExchangeRateEntity 信息
 * @return Resp
 */
 Resp add(CqycExchangeRateEntity cqycExchangeRateEntity);

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
 * @param cqycExchangeRateEntity 信息
 * @return Resp
 */
 Resp updateData(CqycExchangeRateEntity cqycExchangeRateEntity);
}
