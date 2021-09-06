package com.grgbanking.psbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("player_record")
@ApiModel(value="PlayerRecordEntity对象", description="")
public class PlayerRecordEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "玩家昵称")
    private String playerName;

    @ApiModelProperty(value = "玩家分数")
    private Integer playerScore;

    @ApiModelProperty(value = "添加时间")
    private Date addDate;

    @ApiModelProperty(value = "添加人")
    private String addUserid;

    @ApiModelProperty(value = "修改日期")
    private Date modifyDate;

    @ApiModelProperty(value = "修改人")
    private String modifyUserid;


}
