package com.grgbanking.psbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 理财产品
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_conduct_financial_transactions")
@ApiModel(value="CqycConductFinancialTransactionsEntity对象", description="理财产品")
public class CqycConductFinancialTransactionsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "产品代号")
    private String seccode;

    @ApiModelProperty(value = "产品名称")
    private String fpname;

    @ApiModelProperty(value = "认购开始日")
    private Date subscriptionDate;

    @ApiModelProperty(value = "认购结束日")
    private Date closingDate;

    @ApiModelProperty(value = "投资开始日")
    private Date saleBeginDate;

    @ApiModelProperty(value = "生产结束日期")
    private Date prodEndDate;

    @ApiModelProperty(value = "风险等级")
    private String riskLevel;

    @ApiModelProperty(value = "递增金额")
    private String entruststartamt;

    @ApiModelProperty(value = "递增上限")
    private String entruststartamtInst;

    private String entruststartamtIntbank;

    @ApiModelProperty(value = "申赎规则")
    private String sfrule;

    private String curTypeProduct;

    private String netexpectProduct;

    private String expectedAnnualIncomeMax;

    private String expectedAnnualIncomeMin;

    private String latestnet;

    @ApiModelProperty(value = "预期型产品-预期年化收益率")
    private String expectedAnnualIncome;

    @ApiModelProperty(value = "净值型产品-当前净值")
    private String latestNet;

    @ApiModelProperty(value = "净值型产品-净值日期")
    private Date netDate;

    @ApiModelProperty(value = "货币型产品-七日年化")
    private String sevenAnnualYield;

    @ApiModelProperty(value = "货币型产品-万分收益")
    private String tenthousandProfit;

    @ApiModelProperty(value = "产品名称/代码")
    private String nameCode;

    @ApiModelProperty(value = "递增金额")
    private String increaseAmt;

    @ApiModelProperty(value = "收益类型")
    private String incomeType;

    @ApiModelProperty(value = "修改时间")
    @TableField("updateTs")
    private Date updatets;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTs")
    private Date createts;

    @ApiModelProperty(value = "产品说明")
    private String productInformation;

    @ApiModelProperty(value = "是否积分兑换产品")
    private String isPointsExchangeProduct;

    @ApiModelProperty(value = "是否VIP")
    private String isVip;

    @ApiModelProperty(value = "分红方式")
    private String dividendMethod;

    @ApiModelProperty(value = "产品状态")
    private String productStatus;

    @ApiModelProperty(value = "最低持有份额")
    private String minHoldShareIntbank;

    @ApiModelProperty(value = "最低持有份额")
    private String minHoldShareInst;

    @ApiModelProperty(value = "最低持有份额")
    private String minHoldShare;

    private String increaseamtIntBank;

    private String increaseamtInst;

    @ApiModelProperty(value = "投资结束日期")
    private Date saleEndDate;

    private String isShot;

    private String recommendnoun;

    @ApiModelProperty(value = "查询日期")
    private String bdsEtlJobDt;

    @ApiModelProperty(value = "排序码")
    private String num;


}
