package cn.edu.guet.controller;

import cn.edu.guet.common.ResponseData;
import cn.edu.guet.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @Autowired
    private ProductListService productListService;

    @GetMapping("/productList")
    public ResponseData productList() {
        return productListService.getProductList();
    }
}
