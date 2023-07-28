package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.bean.SearchModifyDTO;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import cn.edu.guet.insurance.common.ResponseData;

import java.util.List;

/**
* @author 14594
* @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service
* @createDate 2023-07-23 21:50:29
*/
public interface ModifyBasicInfoService extends IService<ModifyBasicInfo> {

    IPage searchModify(SearchModifyDTO searchModifyDTO);

    ResponseData addChangeReform(ModifyBasicInfo modifyBasicInfo);

    ResponseData deleteModify(List<Integer> deleteId);
}




