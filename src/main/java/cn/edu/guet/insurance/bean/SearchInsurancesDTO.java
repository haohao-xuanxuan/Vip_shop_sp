package cn.edu.guet.insurance.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchInsurancesDTO extends Page {

    /**
     * 页码
     */
    private int currentPage;

    /**
     * 每页记录数
     */
    private int pageSize;

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
     * 实际完成时间
     */
    @TableField(value = "actual_completion_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date actualCompletionTime;


    private List<String> overWorkTime;

}
