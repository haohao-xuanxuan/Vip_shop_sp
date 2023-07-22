package cn.edu.guet.insurance.controller;


import cn.edu.guet.insurance.bean.InsuranceList;
import cn.edu.guet.insurance.bean.InsuranceSummary;
import cn.edu.guet.insurance.bean.SearchSummaryDTO;
import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.service.InsuranceListService;
import cn.edu.guet.insurance.service.InsuranceSummaryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class InsuranceController {

    @Autowired
    private InsuranceListService insuranceListService;

    @Autowired
    private InsuranceSummaryService insuranceSummaryService;

    @Transactional

    @PostMapping("/insertInsuranceList")
    public ResponseData insertInsuranceList(@RequestBody InsuranceList insuranceList) {
        return insuranceListService.insertInsuranceList(insuranceList);
    }

    @PostMapping("/searchInsuranceSummary")
    public ResponseData searchInsuranceSummary(@RequestBody SearchSummaryDTO summaryDTO) {
        int year = Integer.parseInt(summaryDTO.getCurrentYear());
        System.out.println(year);
        return insuranceSummaryService.searchInsuranceSummary(summaryDTO);
    }
}
