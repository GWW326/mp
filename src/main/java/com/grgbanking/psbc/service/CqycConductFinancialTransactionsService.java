package com.grgbanking.psbc.service;

import com.grgbanking.psbc.entity.CqycConductFinancialTransactionsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grgbanking.ibank.common.core.util.Resp;
/**
 * <p>
 * 理财产品 服务类
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
public interface CqycConductFinancialTransactionsService extends IService<CqycConductFinancialTransactionsEntity> {
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
 * @param cqycConductFinancialTransactionsEntity 信息
 * @return Resp
 */
 Resp add(CqycConductFinancialTransactionsEntity cqycConductFinancialTransactionsEntity);

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
 * @param cqycConductFinancialTransactionsEntity 信息
 * @return Resp
 */
 Resp updateData(CqycConductFinancialTransactionsEntity cqycConductFinancialTransactionsEntity);
}
