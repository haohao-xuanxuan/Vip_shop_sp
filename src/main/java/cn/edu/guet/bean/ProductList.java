package cn.edu.guet.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName product_list
 */
@TableName(value ="product_list")
@Data
public class ProductList implements Serializable {
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
    @TableField(value = "titleTwo")
    private String titletwo;

    /**
     * 
     */
    @TableField(value = "titleThree")
    private String titlethree;

    /**
     * 
     */
    @TableField(value = "titleFour")
    private String titlefour;

    /**
     * 
     */
    @TableField(value = "priceOne")
    private Double priceone;

    /**
     * 
     */
    @TableField(value = "priceTwo")
    private Double pricetwo;

    /**
     * 
     */
    @TableField(value = "src2")
    private String src2;

    /**
     * 
     */
    @TableField(value = "type")
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}