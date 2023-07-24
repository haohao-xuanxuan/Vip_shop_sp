package cn.edu.guet.insurance.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 保险清单表;保险清单表
 * @TableName t_insurance_list
 */
@TableName(value ="t_insurance_list")
@Data
public class InsuranceList implements Serializable {
    /**
     * 主键ID
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
     * 案件名称
     */
    @TableField(value = "case_name")
    private String caseName;

    /**
     * 保险案件发生时间
     */
    @TableField(value = "case_occurrence_time")
    private Date caseOccurrenceTime;

    /**
     * 网络层级
     */
    @TableField(value = "network_hierarchy")
    private Integer networkHierarchy;

    /**
     * 案件进展情况
     */
    @TableField(value = "case_progress_situation")
    private Integer caseProgressSituation;

    /**
     * 保险报案原因分类
     */
    @TableField(value = "reporting_reasons_engine")
    private Integer reportingReasonsEngine;

    /**
     * 现场报案人
     */
    @TableField(value = "case_reporter")
    private String caseReporter;

    /**
     * 自维人员负责人
     */
    @TableField(value = "maintenance_manager")
    private String maintenanceManager;

    /**
     * 预估损失金额（元）
     */
    @TableField(value = "estimated_loss_amount")
    private BigDecimal estimatedLossAmount;

    /**
     * 赔付类型
     */
    @TableField(value = "compensation_engine")
    private Integer compensationEngine;

    /**
     * 案件完结确认
     */
    @TableField(value = "case_completion_confirm")
    private Integer caseCompletionConfirm;

    /**
     * 保险报案内容或事件详细说明
     */
    @TableField(value = "insurance_content_description")
    private String insuranceContentDescription;

    /**
     * 赔付已到账金额（元）
     */
    @TableField(value = "compensation_received_amount")
    private BigDecimal compensationReceivedAmount;

    /**
     * 赔付到账具体时间
     */
    @TableField(value = "compensation_received_time")
    private Date compensationReceivedTime;

    /**
     * 赔付情况备注
     */
    @TableField(value = "compensation_situation_remark")
    private String compensationSituationRemark;

    /**
     * 保险公司台账登记名称
     */
    @TableField(value = "IC_ledger_registration_name")
    private String icLedgerRegistrationName;

    /**
     * 保险公司报案号
     */
    @TableField(value = "IC_insurance_report_no")
    private String icInsuranceReportNo;

    /**
     * 保险公司估损赔付金额（元）
     */
    @TableField(value = "IC_estimated_reparation_amount")
    private BigDecimal icEstimatedReparationAmount;

    /**
     * 赔付进度
     */
    @TableField(value = "compensation_progress")
    private Integer compensationProgress;

    /**
     * 保险备注
     */
    @TableField(value = "insurance_remarks")
    private String insuranceRemarks;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}