package com.grgbanking.psbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 贷款利率
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_lendingrate")
@ApiModel(value="CqycLendingrateEntity对象", description="贷款利率")
public class CqycLendingrateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "项目")
    private String projectName;

    @ApiModelProperty(value = "调整前央行基准利率")
    private String cbankRateFront;

    @ApiModelProperty(value = "调整后央行基准利率")
    private String cbankRateBehind;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "上传文件的uuid")
    private String uuid;


}
