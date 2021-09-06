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
 * 资产管理
 * </p>
 *
 * @author gwwen
 * @since 2021-09-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cqyc_asset_management")
@ApiModel(value="CqycAssetManagementEntity对象", description="资产管理")
public class CqycAssetManagementEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    @ApiModelProperty(value = "产品代码")
    private String prodCode;

    @ApiModelProperty(value = "产品名称")
    private String prodName;

    @ApiModelProperty(value = "产品发行机构")
    private String corpName;

    @ApiModelProperty(value = "是否代销")
    private String isAgentSell;

    @ApiModelProperty(value = "产品类型")
    private String productType;

    @ApiModelProperty(value = "公募/私募")
    private String subProductType;

    @ApiModelProperty(value = "风险等级")
    private String riskLevel;

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
