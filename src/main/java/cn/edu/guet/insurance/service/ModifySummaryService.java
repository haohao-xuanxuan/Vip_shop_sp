package cn.edu.guet.insurance.service;

import cn.edu.guet.insurance.bean.ModifySummary;
import cn.edu.guet.insurance.bean.SearchSummaryDTO;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
* @author 马嘉
* @description 针对表【t_modify_summary(迁改汇总)】的数据库操作Service
* @createDate 2023-07-28 17:52:46
*/
public interface ModifySummaryService  {
    void updateMonthlyCountAndTotalAmount(int prefecture, int month, int year, BigDecimal compensationAmount);
    ResponseData searchModifySummary(SearchSummaryDTO searchSummaryDTO);

}
