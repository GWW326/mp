package com.grgbanking.psbc.service;

import com.grgbanking.psbc.entity.CqycDepositerateEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.grgbanking.ibank.common.core.util.Resp;
/**
 * <p>
 * 存款利率 服务类
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
public interface CqycDepositerateService extends IService<CqycDepositerateEntity> {
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
 * @param cqycDepositerateEntity 信息
 * @return Resp
 */
 Resp add(CqycDepositerateEntity cqycDepositerateEntity);

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
 * @param cqycDepositerateEntity 信息
 * @return Resp
 */
 Resp updateData(CqycDepositerateEntity cqycDepositerateEntity);
}
