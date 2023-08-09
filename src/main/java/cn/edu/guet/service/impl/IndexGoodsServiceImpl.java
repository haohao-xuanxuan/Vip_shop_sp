package cn.edu.guet.service.impl;

import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.bean.IndexGoods;
import cn.edu.guet.service.IndexGoodsService;
import cn.edu.guet.mapper.IndexGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 是我，阿浩啊
* @description 针对表【index_goods】的数据库操作Service实现
* @createDate 2023-08-08 21:08:15
*/
@Service
public class IndexGoodsServiceImpl  implements IndexGoodsService{

    @Autowired
    IndexGoodsMapper indexGoodsMapper;

    @Override
    public ResponseData getIndexGoods() {
        return ResponseData.ok(indexGoodsMapper.selectList(null));
    }
}




