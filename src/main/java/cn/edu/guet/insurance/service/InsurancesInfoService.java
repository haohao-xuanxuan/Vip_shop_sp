package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.InsuranceList;
import cn.edu.guet.insurance.bean.SearchInsurancesDTO;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
* @author huanglusong
* @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service
* @createDate 2023-07-22 21:05:27
*/
public interface InsurancesInfoService {

    ResponseData createInsurances(InsuranceList insuranceList);

    ResponseData deleteInsurances(SearchInsurancesDTO insurancesDTO);

    ResponseData updateInsurances(InsuranceList insuranceList);

    IPage searchInsurances(SearchInsurancesDTO modifyDTO);


}
