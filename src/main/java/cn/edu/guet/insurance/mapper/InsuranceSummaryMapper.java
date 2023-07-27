package cn.edu.guet.insurance.mapper;

import cn.edu.guet.insurance.bean.InsuranceSummary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author 马嘉
* @description 针对表【t_insurance_summary(保险汇总)】的数据库操作Mapper
* @createDate 2023-07-23 17:26:15
* @Entity cn.edu.guet.insurance.bean.InsuranceSummary
*/
@Mapper
public interface InsuranceSummaryMapper extends BaseMapper<InsuranceSummary> {

}




