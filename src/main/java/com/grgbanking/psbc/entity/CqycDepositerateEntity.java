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
 * 存款利率
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_depositerate")
@ApiModel(value="CqycDepositerateEntity对象", description="存款利率")
public class CqycDepositerateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "项目")
    private String projectName;

    @ApiModelProperty(value = "调整前央行基准利率")
    private String cbankRateFront;

    @ApiModelProperty(value = "调整前我行挂牌利率")
    private String obankRateFront;

    @ApiModelProperty(value = "调整后央行基准利率")
    private String cbankRateBehind;

    @ApiModelProperty(value = "调整后我行挂牌利率")
    private String obankRateBehind;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "备用")
    private String param;

    @ApiModelProperty(value = "上传文件的uuid")
    private String uuid;


}
