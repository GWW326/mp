package com.govin.mp.imports.service.impl;

import com.govin.mp.imports.entity.CPicrecord;
import com.govin.mp.imports.mapper.CPicrecordMapper;
import com.govin.mp.imports.service.ICPicrecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车牌识别数据
 服务实现类
 * </p>
 *
 * @author gww
 * @since 2020-08-21
 */
@Service("cPicrecordServiceImpl")
public class CPicrecordServiceImpl extends ServiceImpl<CPicrecordMapper, CPicrecord> implements ICPicrecordService {

}
