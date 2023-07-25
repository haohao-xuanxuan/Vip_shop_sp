package cn.edu.guet.insurance.service.impl;

import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.mapper.ModifyBasicInfoMapper;
import cn.edu.guet.insurance.service.ModifyBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service实现
* @createDate 2023-07-25 16:47:08
*/
@Service
public class ModifyBasicInfoServiceImpl implements ModifyBasicInfoService{

    @Autowired
    private ModifyBasicInfoMapper modifyBasicInfoMapper;

    @Override
    public ResponseData addChangeReform(ModifyBasicInfo modifyBasicInfo) {
        int insert = modifyBasicInfoMapper.insert(modifyBasicInfo);
        System.out.println("ssssssss:"+insert);

        if(insert>0){
            return ResponseData.ok("保存成功");
        }else {
            return ResponseData.fail("保存失败");
        }

    }
}




