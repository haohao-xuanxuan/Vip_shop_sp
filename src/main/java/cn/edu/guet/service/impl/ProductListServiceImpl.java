package cn.edu.guet.service.impl;

import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.bean.ProductList;
import cn.edu.guet.service.ProductListService;
import cn.edu.guet.mapper.ProductListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【product_list】的数据库操作Service实现
* @createDate 2023-08-09 17:25:57
*/
@Service
public class ProductListServiceImpl extends ServiceImpl<ProductListMapper, ProductList>
    implements ProductListService{

    @Autowired
    private ProductListMapper productListMapper;

    @Override
    public ResponseData getProductList() {
        List<ProductList> productLists = productListMapper.selectList(null);
        return ResponseData.ok(productLists);
    }
}




