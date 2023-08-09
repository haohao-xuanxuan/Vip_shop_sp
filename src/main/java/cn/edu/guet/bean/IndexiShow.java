package cn.edu.guet.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName indexi_show
 */
@TableName(value ="indexi_show")
@Data
public class IndexiShow implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "src")
    private String src;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}