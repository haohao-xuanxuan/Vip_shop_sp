package cn.edu.guet.insurance.service.impl;

import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.service.InsuranceSummaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.insurance.bean.InsuranceList;
import cn.edu.guet.insurance.service.InsuranceListService;
import cn.edu.guet.insurance.mapper.InsuranceListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 马嘉
 * @description 针对表【t_insurance_list(保险清单表;保险清单表)】的数据库操作Service实现
 * @createDate 2023-07-24 17:41:56
 */
@Service
public class InsuranceListServiceImpl extends ServiceImpl<InsuranceListMapper, InsuranceList>
        implements InsuranceListService {

    @Autowired
    private InsuranceListMapper insuranceListMapper;
    @Autowired
    private InsuranceSummaryService insuranceSummaryService;

    @Override
    public ResponseData insertInsuranceList(InsuranceList insuranceList) {

        insuranceListMapper.insert(insuranceList);

//月份
        Date date = insuranceList.getCaseOccurrenceTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1; // 注意要加1，因为月份值从0开始
//年份
        int year = calendar.get(Calendar.YEAR);

        int prefecture = insuranceList.getPrefecture();
//总金额
        BigDecimal compensationAmount = insuranceList.getCompensationReceivedAmount();

        insuranceSummaryService.updateMonthlyCountAndTotalAmount(prefecture, month,year,compensationAmount);

        return ResponseData.ok("保存成功!");
    }
}





