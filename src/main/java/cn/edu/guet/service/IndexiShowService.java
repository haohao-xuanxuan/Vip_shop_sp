package cn.edu.guet.service;

import cn.edu.guet.bean.IndexiShow;
import cn.edu.guet.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 是我，阿浩啊
* @description 针对表【indexi_show】的数据库操作Service
* @createDate 2023-08-09 16:35:13
*/
public interface IndexiShowService extends IService<IndexiShow> {
    ResponseData getIndexShow();
}
