package com.govin.mp.user.service.impl;

import com.govin.mp.user.entity.Card;
import com.govin.mp.user.mapper.CardMapper;
import com.govin.mp.user.service.ICardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 身份信息表 服务实现类
 * </p>
 *
 * @author gww
 * @since 2020-08-14
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card> implements ICardService {

}
