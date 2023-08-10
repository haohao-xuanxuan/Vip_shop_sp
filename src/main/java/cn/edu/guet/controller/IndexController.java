package cn.edu.guet.controller;


import cn.edu.guet.common.ResponseData;
import cn.edu.guet.service.IndexGoodsService;
import cn.edu.guet.service.IndexiShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexGoodsService indexGoodsService;

    @Autowired
    IndexiShowService indexiShowService;

    @GetMapping("/getIndexGoods")
    public ResponseData getIndexGoods(){
        return indexGoodsService.getIndexGoods();
    }

    @GetMapping("/getIndexShow")
    public ResponseData getIndexShow(){
        return indexiShowService.getIndexShow();
    }

}
