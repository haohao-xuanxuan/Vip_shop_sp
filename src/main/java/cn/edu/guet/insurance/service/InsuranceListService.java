package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.InsuranceList;
import cn.edu.guet.insurance.bean.InsuranceSummary;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 马嘉
* @description 针对表【t_insurance_list(保险清单表;保险清单表)】的数据库操作Service
* @createDate 2023-07-24 17:41:56
*/
public interface InsuranceListService extends IService<InsuranceList> {
    ResponseData insertInsuranceList(InsuranceList insuranceList);
}
