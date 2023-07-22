package cn.edu.guet.insurance.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

/**
 * 保险汇总
 * @TableName t_insurance_summary
 */
@TableName(value ="t_insurance_summary")
@Data
public class InsuranceSummary<integer> implements Serializable {
    /**
     * 地州
     */
    @TableField(value = "prefecture")
    private Integer prefecture;

    /**
     * 总数量
     */
    @TableField(value = "total")
    private Integer total;

    /**
     * 1月
     */
    @TableField(value = "January")
    private Integer january;

    /**
     * 2月
     */
    @TableField(value = "February")
    private Integer february;

    /**
     * 3月
     */
    @TableField(value = "March")
    private Integer march;

    /**
     * 4月
     */
    @TableField(value = "April")
    private Integer april;

    /**
     * 5月
     */
    @TableField(value = "May")
    private Integer may;

    /**
     * 6月
     */
    @TableField(value = "June")
    private Integer june;

    /**
     * 7月
     */
    @TableField(value = "July")
    private Integer july;

    /**
     * 8月
     */
    @TableField(value = "August")
    private Integer august;

    /**
     * 9月
     */
    @TableField(value = "September")
    private Integer september;

    /**
     * 10月
     */
    @TableField(value = "October")
    private Integer october;

    /**
     * 11月
     */
    @TableField(value = "November")
    private Integer november;

    /**
     * 12月
     */
    @TableField(value = "December")
    private Integer december;

    /**
     * 合计金额
     */
    @TableField(value = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 年份
     */
    @TableField(value = "year")
    private Integer year;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}