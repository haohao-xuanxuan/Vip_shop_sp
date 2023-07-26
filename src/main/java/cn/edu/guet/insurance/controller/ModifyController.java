package cn.edu.guet.insurance.controller;

import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.bean.SearchModifyDTO;
import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.service.ModifyBasicInfoService;
import cn.edu.guet.insurance.service.PrefectureCountyService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ModifyController {

    @Autowired
    ModifyBasicInfoService modifyBasicInfoService;

    @Autowired
    PrefectureCountyService prefectureCountyService;

    @PostMapping("/searchModify")
    public ResponseData searchModify(@RequestBody SearchModifyDTO searchModifyDTO){
        IPage searchModify = modifyBasicInfoService.searchModify(searchModifyDTO);
        System.out.println("没有实力");
        return ResponseData.ok(searchModify);
    }

    @PostMapping("/getCountyByPrefecture")
    public ResponseData getCountyByPrefecture(@RequestBody SearchModifyDTO searchModifyDTO){
        int prefecture=searchModifyDTO.getPrefecture();
        List<Integer> countyList=prefectureCountyService.getCountyByPrefecture(prefecture);
        return ResponseData.ok(countyList);
    }

}
