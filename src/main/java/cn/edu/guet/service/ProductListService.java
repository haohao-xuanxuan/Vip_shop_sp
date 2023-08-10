package cn.edu.guet.service;

import cn.edu.guet.bean.ProductList;
import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【product_list】的数据库操作Service
* @createDate 2023-08-09 17:25:57
*/
public interface ProductListService extends IService<ProductList> {

    ResponseData getProductList();
}
