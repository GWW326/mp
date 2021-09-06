package com.govin.mp.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 身份信息表
 * </p>
 *
 * @author gww
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 身份证
     */
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    /**
     * 用户名
     */
    private String userName;


}
