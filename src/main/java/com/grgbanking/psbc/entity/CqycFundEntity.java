package com.grgbanking.psbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 基金
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_fund")
@ApiModel(value="CqycFundEntity对象", description="基金")
public class CqycFundEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "基金代码")
    private String jjdm;

    @ApiModelProperty(value = "基金名称")
    private String jjmc;

    @ApiModelProperty(value = "基金公司")
    private String jjgs;

    @ApiModelProperty(value = "日涨幅")
    private String rzf;

    @ApiModelProperty(value = "周涨幅")
    private String zzf;

    @ApiModelProperty(value = "月涨幅")
    private String yzf;

    @ApiModelProperty(value = "季涨幅")
    private String jzf;

    @ApiModelProperty(value = "半年涨幅")
    private String bnzf;

    @ApiModelProperty(value = "年涨幅")
    private String nzf;

    @ApiModelProperty(value = "净值")
    private String jz;

    @ApiModelProperty(value = "净值日期")
    private String jzrq;

    @ApiModelProperty(value = "起购金额")
    private String qgje;

    @ApiModelProperty(value = "基金类型")
    private String jjlx;

    @ApiModelProperty(value = "成立日期")
    private String clrq;

    @ApiModelProperty(value = "风险等级")
    private String fxdj;

    @ApiModelProperty(value = "产品状态")
    private String cpzt;

    private String ishot;

    @ApiModelProperty(value = "查询时间")
    private String bdsEtlJobDt;

    @ApiModelProperty(value = "排序码")
    private String numb;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTs")
    private String createts;

    @ApiModelProperty(value = "修改时间")
    @TableField("updateTs")
    private String updatets;


}
