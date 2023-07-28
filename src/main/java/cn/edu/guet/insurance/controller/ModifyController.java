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

    @PostMapping("/creatmodify")
    public ResponseData creatmodify(@RequestBody ModifyBasicInfo modifyBasicInfo) {
        return modifyBasicInfoService.creatmodify(modifyBasicInfo);
    }

    @PostMapping("/deleteModify")
    public ResponseData deleteModify(@RequestBody SearchModifyDTO searchModifyDTO) {
        System.out.println(searchModifyDTO.getDeleteId().size());
        return modifyBasicInfoService.deleteModify(searchModifyDTO);
    }

    @PostMapping("/updateModify")
    public ResponseData updateModify(@RequestBody ModifyBasicInfo modifyBasicInfo) {
        return modifyBasicInfoService.updateModify(modifyBasicInfo);
    }

    @PostMapping("/searchModify")
    public ResponseData searchModify(@RequestBody SearchModifyDTO searchModifyDTO){
        System.out.println(searchModifyDTO+"是：+++++++++");
        IPage searchModify = modifyBasicInfoService.searchModify(searchModifyDTO);
        return ResponseData.ok(searchModify);
    }

    @PostMapping("/getCountyByPrefecture")
    public ResponseData getCountyByPrefecture(@RequestBody SearchModifyDTO searchModifyDTO){
        int prefecture=searchModifyDTO.getPrefecture();
        List<Integer> countyList=prefectureCountyService.getCountyByPrefecture(prefecture);
        return ResponseData.ok(countyList);
    }

}
