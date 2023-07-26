package cn.edu.guet.insurance.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * modify_basic_info
 * @TableName modify_basic_info
 */
@TableName(value ="modify_basic_info")
@Data
public class ModifyBasicInfo implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 地州
     */
    @TableField(value = "prefecture")
    private Integer prefecture;

    /**
     * 区县
     */
    @TableField(value = "county")
    private Integer county;

    /**
     * 市政迁改项目名称
     */
    @TableField(value = "modify_project_name")
    private String modifyProjectName;

    /**
     * 预计管线维修总费用（不含税）万元
     */
    @TableField(value = "estimated_maintain_total_cost")
    private BigDecimal estimatedMaintainTotalCost;

    /**
     * 预计开工时间
     */
    @TableField(value = "expected_begin_time")
    private Date expectedBeginTime;

    /**
     * 预计完工时间
     */
    @TableField(value = "expected_completion_time")
    private Date expectedCompletionTime;

    /**
     * 政府接口人
     */
    @TableField(value = "government_interfacer")
    private String governmentInterfacer;

    /**
     * 政府接口人联系方式
     */
    @TableField(value = "government_interfacer_cif")
    private String governmentInterfacerCif;

    /**
     * 我方接口人
     */
    @TableField(value = "our_interfacer")
    private String ourInterfacer;

    /**
     * 我方接口人联系方式
     */
    @TableField(value = "our_interfacer_cif")
    private String ourInterfacerCif;

    /**
     * 签谈进展
     */
    @TableField(value = "discuss_schedule")
    private String discussSchedule;

    /**
     * 实际完成时间
     */
    @TableField(value = "actual_completion_time")
    private Date actualCompletionTime;

    /**
     * 通过赔补解决的费用（不含税）万元
     */
    @TableField(value = "compensation_costs")
    private BigDecimal compensationCosts;

    /**
     * 无法通过赔补解决需要通过管线维修解决的费用（不含税）万元
     */
    @TableField(value = "wire_maintain_costs")
    private BigDecimal wireMaintainCosts;

    /**
     * 赔补对应的其他费用支出预算名称
     */
    @TableField(value = "other_budget_name")
    private String otherBudgetName;

    /**
     * 赔补对应的其他费用支出预算编号：
     */
    @TableField(value = "other_budget_id")
    private String otherBudgetId;

    /**
     * 管线维修费预算名称
     */
    @TableField(value = "maintain_budget_name")
    private String maintainBudgetName;

    /**
     * 赔补进度
     */
    @TableField(value = "compensation_schedule")
    private Integer compensationSchedule;

    /**
     * 赔补比例
     */
    @TableField(value = "compensation_rate")
    private Integer compensationRate;

    /**
     * 项目简介
     */
    @TableField(value = "item_describe")
    private String itemDescribe;

    /**
     * 无法通过赔补解决的原因分析
     */
    @TableField(value = "unresolved_result_analysis")
    private String unresolvedResultAnalysis;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}