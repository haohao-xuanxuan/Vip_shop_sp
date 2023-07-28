package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.InsuranceSummary;
import cn.edu.guet.insurance.bean.SearchSummaryDTO;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

/**
* @author 马嘉
* @description 针对表【t_insurance_summary(保险汇总)】的数据库操作Service
* @createDate 2023-07-23 17:26:15
*/
public interface InsuranceSummaryService  {

    void updateMonthlyCountAndTotalAmount(int prefecture, int month, int year, BigDecimal compensationAmount);

    ResponseData searchInsuranceSummary(SearchSummaryDTO summaryDTO);
}
