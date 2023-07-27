package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.PrefectureCounty;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 14594
* @description 针对表【prefecture_county(地州_区县)】的数据库操作Service
* @createDate 2023-07-24 15:11:01
*/
public interface PrefectureCountyService extends IService<PrefectureCounty> {


    List<Integer> getCountyByPrefecture(int prefecture);

}
