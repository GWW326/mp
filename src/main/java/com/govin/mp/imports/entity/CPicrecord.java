package com.govin.mp.imports.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 车牌识别数据

 * </p>
 *
 * @author gww
 * @since 2020-08-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor()
public class CPicrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 设备编码
     */
    @TableField("DEV_ID")
    private Long devId;

    /**
     * 通道序号
     */
    @TableField("DEV_CHN_NUM")
    private Integer devChnNum;

    /**
     * 设备名称
     */
    @TableField("DEV_NAME")
    private String devName;

    /**
     * 通道名称
     */
    @TableField("DEV_CHN_NAME")
    private String devChnName;

    /**
     * 车牌号
     */
    @TableField("CAR_NUM")
    private String carNum;

    /**
     * 车牌类型
     */
    @TableField("CAR_NUM_TYPE")
    private Integer carNumType;

    /**
     * 车牌颜色
     */
    @TableField("CAR_NUM_COLOR")
    private Integer carNumColor;

    /**
     * 车速
     */
    @TableField("CAR_SPEED")
    private Integer carSpeed;

    /**
     * 车型
     */
    @TableField("CAR_TYPE")
    private Integer carType;

    /**
     * 车身颜色
     */
    @TableField("CAR_COLOR")
    private Integer carColor;

    /**
     * 行车方向
     */
    @TableField("CAR_DIRECT")
    private Integer carDirect;

    /**
     * 车长
     */
    @TableField("CAR_LENGTH")
    private Integer carLength;

    /**
     * 车道号
     */
    @TableField("WAY_NUM")
    private Integer wayNum;

    /**
     * 时间戳（绝对日期时间）
     */
    @TableField("CAP_TIME_STAMP")
    private Integer capTimeStamp;

    /**
     * 抓图日期,精确到秒
     */
    @TableField("CAP_DATE")
    private LocalDateTime capDate;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG_URL")
    private String carImgUrl;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG1_URL")
    private String carImg1Url;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG2_URL")
    private String carImg2Url;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG3_URL")
    private String carImg3Url;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG4_URL")
    private String carImg4Url;

    /**
     * 图片存放路径
     */
    @TableField("CAR_IMG5_URL")
    private String carImg5Url;

    /**
     * 车牌X
     */
    @TableField("CAR_NUM_X")
    private Integer carNumX;

    /**
     * 车牌Y
     */
    @TableField("CAR_NUM_Y")
    private Integer carNumY;

    /**
     * 车牌W
     */
    @TableField("CAR_NUM_W")
    private Integer carNumW;

    /**
     * 车牌H
     */
    @TableField("CAR_NUM_H")
    private Integer carNumH;

    /**
     * 车标类型ID
     */
    @TableField("CAR_LOGO_TYPE")
    private Integer carLogoType;

    /**
     * 车标子品牌
     */
    @TableField("CAR_LOGO_CHILDTYPE")
    private Integer carLogoChildtype;

    @TableField("CAR_LOGO_YEAR")
    private String carLogoYear;

    @TableField("PASSENGER_SEATBELT")
    private Integer passengerSeatbelt;

    /**
     * 安全带区域json字符串
     */
    @TableField("SEATBELT_AREA")
    private String seatbeltArea;

    /**
     * 是否系安全带
     */
    @TableField("DRIVER_SEATBELT")
    private Integer driverSeatbelt;

    /**
     * 是否在打电话
     */
    @TableField("DRIVER_PHONEING")
    private Integer driverPhoneing;

    /**
     * 打电话区域
     */
    @TableField("PHONE_AREA")
    private String phoneArea;

    /**
     * 车内标识物区域
     */
    @TableField("VEHICLE_MARK_AREA")
    private String vehicleMarkArea;

    /**
     * 纸巾盒
     */
    @TableField("PAPER_MARK")
    private Integer paperMark;

    /**
     * 挂饰
     */
    @TableField("DROP_MARK")
    private Integer dropMark;

    /**
     * 遮阳板
     */
    @TableField("SUN_MARK")
    private Integer sunMark;

    /**
     * 年检标签
     */
    @TableField("ANNUALTAG_MARK")
    private Integer annualtagMark;

    /**
     * 车牌可信度
     */
    @TableField("CAR_NUM_CORRELATIVE")
    private String carNumCorrelative;

    /**
     * 前后拍 前拍：0  后拍：1
     */
    @TableField("CAP_TYPE")
    private Integer capType;

    /**
     * 车牌可信度
     */
    @TableField("CAR_NUM_CONFIDENCE")
    private Integer carNumConfidence;

    /**
     * 车标可信度
     */
    @TableField("CAR_LOGO_CONFIDENCE")
    private Integer carLogoConfidence;

    /**
     * 是否在抽烟
     */
    @TableField("DRIVER_SMOKING")
    private Integer driverSmoking;

    @TableField("DRIVER_TIRED")
    private Integer driverTired;

    @TableField("DRIVER_VISOR")
    private Integer driverVisor;

    /**
     * 设备编码
     */
    @TableField("DEV_CODE")
    private String devCode;

    /**
     * 通道ID
     */
    @TableField("DEV_CHN_ID")
    private Long devChnId;

    /**
     * 卡口ID（组织ID)
     */
    @TableField("ORG_ID")
    private Long orgId;

    /**
     * 卡口编码（组织编码）
     */
    @TableField("ORG_CODE")
    private String orgCode;

    /**
     * 卡口名称（组织名称）
     */
    @TableField("ORG_NAME")
    private String orgName;

    /**
     * 经度
     */
    @TableField("LONGITUDE")
    private String longitude;

    /**
     * 纬度
     */
    @TableField("LATITUDE")
    private String latitude;

    /**
     * 是否分析 0:未分析 1:已分析 2:分析失败
     */
    @TableField("IS_ANALYZE")
    private Integer isAnalyze;

    /**
     * 分析次数
     */
    @TableField("ANALYZE_COUNT")
    private Integer analyzeCount;

    /**
     * 分析时间
     */
    @TableField("ANALYZE_TIME")
    private Long analyzeTime;

    @TableField("GROUPID")
    private String groupid;

    @TableField("OBJ_BASE64_FEATURES")
    private String objBase64Features;

    /**
     * 转义字段
     */
    @TableField("ESCAPE_FIELDS")
    private String escapeFields;

    /**
     * 车辆车顶 1是,0否
     */
    @TableField("CAR_ROOF")
    private Integer carRoof;

    /**
     * 车灯 1是,0否
     */
    @TableField("CAR_LIGHT")
    private Integer carLight;

    /**
     * 出入城标识（0:无,1:入城,2:出城）
     */
    @TableField("PASS_FLAG")
    private Integer passFlag;

    /**
     * 黄标车字段  1:是,0:否
     */
    @TableField("YELLOWMARK")
    private Integer yellowmark;

    /**
     * 危险品车字段  1:是,0:否
     */
    @TableField("VEHICLE_DANGER")
    private Integer vehicleDanger;

    /**
     * 临时车牌字段  1:是,0:否
     */
    @TableField("TEMPORARY_PLATE")
    private Integer temporaryPlate;

    /**
     * 天窗站人字段  1:是,0:否
     */
    @TableField("SKYLIGHT_STATION")
    private Integer skylightStation;

    /**
     * 副驾驶遮阳板字段  1:有,0:无
     */
    @TableField("COPILOT_SUN_MARK")
    private Integer copilotSunMark;

    /**
     * 是否遮污牌  1:有,0:无
     */
    @TableField("COVER_CARNUM")
    private Integer coverCarnum;

    /**
     * 卡口国标编码
     */
    @TableField("ORG_GB_CODE")
    private String orgGbCode;

    /**
     * 通道国标编码
     */
    @TableField("CHN_GB_CODE")
    private String chnGbCode;

    /**
     * ���η�����������
     */
    @TableField("ANALYZED_PLATE_TYPE")
    private Integer analyzedPlateType;


}
