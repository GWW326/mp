package com.govin.mp.user.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.govin.mp.user.dto.UserCardDto;
import com.govin.mp.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gww
 * @since 2020-08-14
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<UserCardDto> selectCardAndUser(Page page);
}
