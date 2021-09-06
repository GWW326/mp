package com.govin.mp.kafka.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CarInfoDTO implements Serializable {


    public CarInfoDTO( ) {
    }

    public CarInfoDTO(Long id, Long devId) {
        this.id = id;
        this.devId = devId;
    }

    private Long id;

    /**
     * 设备编码
     */
    @Field
    private Long devId;

    /**
     * 通道序号
     */
    @Field
    private Integer devChnNum;

    /**
     * 设备名称
     */
    private String devName;

    /**
     * 通道名称
     */
    @Field
    private String devChnName;

    /**
     * 车牌号
     */
    @Field
    private String carNum;

    /**
     * 车牌类型
     */
    private Integer carNumType;

    /**
     * 车牌颜色
     */
    @Field
    private Integer carNumColor;


    /**
     * 车型
     */
    @Field
    private Integer carType;
    @Field
    private LocalDateTime capDate;
}
