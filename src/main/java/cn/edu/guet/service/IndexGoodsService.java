package cn.edu.guet.service;

import cn.edu.guet.bean.IndexGoods;
import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 是我，阿浩啊
* @description 针对表【index_goods】的数据库操作Service
* @createDate 2023-08-08 21:08:15
*/
public interface IndexGoodsService   {
    ResponseData getIndexGoods();
}
