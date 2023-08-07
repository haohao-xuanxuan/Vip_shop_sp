package cn.edu.guet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.bean.Entertainment;
import cn.edu.guet.service.EntertainmentService;
import cn.edu.guet.mapper.EntertainmentMapper;
import org.springframework.stereotype.Service;

/**
* @author 27258
* @description 针对表【entertainment】的数据库操作Service实现
* @createDate 2023-08-07 21:44:17
*/
@Service
public class EntertainmentServiceImpl extends ServiceImpl<EntertainmentMapper, Entertainment>
    implements EntertainmentService{

}




