package com.govin.mp.user.service.impl;

import com.govin.mp.user.entity.User;
import com.govin.mp.user.mapper.UserMapper;
import com.govin.mp.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gww
 * @since 2020-08-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
