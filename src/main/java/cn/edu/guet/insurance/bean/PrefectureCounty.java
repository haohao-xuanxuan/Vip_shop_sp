package cn.edu.guet.insurance.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 地州_区县
 * @TableName prefecture_county
 */
@TableName(value ="prefecture_county")
public class PrefectureCounty implements Serializable {


    /**
     * id
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 地州
     */
    public Integer getPrefecture() {
        return prefecture;
    }

    /**
     * 地州
     */
    public void setPrefecture(Integer prefecture) {
        this.prefecture = prefecture;
    }

    /**
     * 区县
     */
    public Integer getCounty() {
        return county;
    }

    /**
     * 区县
     */
    public void setCounty(Integer county) {
        this.county = county;
    }
}