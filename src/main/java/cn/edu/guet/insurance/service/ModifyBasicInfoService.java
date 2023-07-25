package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.common.ResponseData;

/**
* @author Administrator
* @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service
* @createDate 2023-07-25 16:47:08
*/
public interface ModifyBasicInfoService {


    ResponseData addChangeReform(ModifyBasicInfo modifyBasicInfo);
}
