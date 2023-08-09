package cn.edu.guet.service.impl;

import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.bean.IndexiShow;
import cn.edu.guet.service.IndexiShowService;
import cn.edu.guet.mapper.IndexiShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 是我，阿浩啊
* @description 针对表【indexi_show】的数据库操作Service实现
* @createDate 2023-08-09 16:35:13
*/
@Service
public class IndexiShowServiceImpl extends ServiceImpl<IndexiShowMapper, IndexiShow>
    implements IndexiShowService{

    @Autowired
    IndexiShowMapper indexiShowMapper;

    @Override
    public ResponseData getIndexShow() {
        List<IndexiShow> indexiShowList = indexiShowMapper.selectList(null);
        return ResponseData.ok(indexiShowList);
    }
}




