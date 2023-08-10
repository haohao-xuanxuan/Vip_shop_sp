package cn.edu.guet.mapper;

import cn.edu.guet.bean.ProductList;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【product_list】的数据库操作Mapper
* @createDate 2023-08-09 17:25:57
* @Entity cn.edu.guet.bean.ProductList
*/
@Mapper
public interface ProductListMapper extends BaseMapper<ProductList> {

}




