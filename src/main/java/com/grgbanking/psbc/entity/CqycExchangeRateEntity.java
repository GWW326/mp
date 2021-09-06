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
 * 外汇牌价
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_exchange_rate")
@ApiModel(value="CqycExchangeRateEntity对象", description="外汇牌价")
public class CqycExchangeRateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "货币代码")
    private String cur;

    @ApiModelProperty(value = "货币名称")
    private String curname;

    @ApiModelProperty(value = "现汇买入价")
    private String feBuyPrc;

    @ApiModelProperty(value = "现钞买入价")
    private String fcBuyPrc;

    @ApiModelProperty(value = "现汇卖出价")
    private String feSellPrc;

    @ApiModelProperty(value = "邮储银行折算价")
    private String fcSellPrc;

    @ApiModelProperty(value = "中位价格")
    private String midPrc;

    @ApiModelProperty(value = "发布日期")
    private Date effectDate;

    @ApiModelProperty(value = "发布时间")
    private Date effectTime;

    @ApiModelProperty(value = "日期")
    private Date bdsEtlJobDt;

    @ApiModelProperty(value = "排序码")
    private String numb;


}
