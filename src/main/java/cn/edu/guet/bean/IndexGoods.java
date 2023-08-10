package cn.edu.guet.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName index_goods
 */
@TableName(value ="index_goods")
@Data
public class IndexGoods implements Serializable {
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

    /**
     * 
     */
    @TableField(value = "type")
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}