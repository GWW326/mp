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
 * 国债
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_nation_debt")
@ApiModel(value="CqycNationDebtEntity对象", description="国债")
public class CqycNationDebtEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "债券代码")
    private String code;

    @ApiModelProperty(value = "债券简称")
    private String name;

    @ApiModelProperty(value = "票面年利率")
    private String pmnll;

    @ApiModelProperty(value = "发行开始日")
    private String startdate;

    @ApiModelProperty(value = "发行结束日")
    private String enddate;

    private String natdebttype;

    @ApiModelProperty(value = "查询日期")
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
