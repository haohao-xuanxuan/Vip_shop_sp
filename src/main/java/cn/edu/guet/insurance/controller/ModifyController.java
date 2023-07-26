package cn.edu.guet.insurance.controller;

import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.service.ModifyBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyController {

    @Autowired
    private ModifyBasicInfoService modifyBasicInfoService;


    @PostMapping("/addModify")
    public ResponseData addModify(@RequestBody ModifyBasicInfo modifyBasicInfo){

        return modifyBasicInfoService.addChangeReform(modifyBasicInfo);
    }
}
