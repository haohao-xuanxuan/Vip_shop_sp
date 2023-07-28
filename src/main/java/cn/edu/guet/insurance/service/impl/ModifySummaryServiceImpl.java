package cn.edu.guet.insurance.service.impl;

import cn.edu.guet.insurance.bean.SearchSummaryDTO;
import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.insurance.bean.ModifySummary;
import cn.edu.guet.insurance.service.ModifySummaryService;
import cn.edu.guet.insurance.mapper.ModifySummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
* @author 马嘉
* @description 针对表【t_modify_summary(迁改汇总)】的数据库操作Service实现
* @createDate 2023-07-28 17:52:46
*/
@Service
public class ModifySummaryServiceImpl extends ServiceImpl<ModifySummaryMapper, ModifySummary>
    implements ModifySummaryService {

    @Autowired
    private ModifySummaryMapper modifySummaryMapper;

    @Override
    public void updateMonthlyCountAndTotalAmount(int prefecture, int month, int year, BigDecimal compensationAmount) {

        // 查询指定地州和年份的记录
        QueryWrapper<ModifySummary> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("prefecture", prefecture)
                .eq("year", year);
        ModifySummary summary = modifySummaryMapper.selectOne(queryWrapper);

        if (summary == null) { // 数据库中不存在记录，
            summary = new ModifySummary();
            summary.setPrefecture(prefecture);
            summary.setTotal(1); // 设置总数量为1，因为是新增记录
            summary.setTotalAmount(compensationAmount);
            summary.setYear(year);
            switch (month) {
                case 1:
                    if (summary.getJanuary() == null) {
                        summary.setJanuary(0);
                    }
                    summary.setJanuary(summary.getJanuary() + 1);
                    break;
                case 2:
                    if (summary.getFebruary() == null) {
                        summary.setFebruary(0);
                    }
                    summary.setFebruary(summary.getFebruary() + 1);
                    break;
                case 3:
                    if (summary.getMarch() == null) {
                        summary.setMarch(0);
                    }
                    summary.setMarch(summary.getMarch() + 1);
                    break;
                case 4:
                    if (summary.getApril() == null) {
                        summary.setApril(0);
                    }
                    summary.setApril(summary.getApril() + 1);
                    break;
                case 5:
                    if (summary.getMay() == null) {
                        summary.setMay(0);
                    }
                    summary.setMay(summary.getMay() + 1);
                    break;
                case 6:
                    if (summary.getJune() == null) {
                        summary.setJune(0);
                    }
                    summary.setJune(summary.getJune() + 1);
                    break;
                case 7:
                    if (summary.getJuly() == null) {
                        summary.setJuly(0);
                    }
                    summary.setJuly(summary.getJuly() + 1);
                    break;
                case 8:
                    if (summary.getAugust() == null) {
                        summary.setAugust(0);
                    }
                    summary.setAugust(summary.getAugust() + 1);
                    break;
                case 9:
                    if (summary.getSeptember() == null) {
                        summary.setSeptember(0);
                    }
                    summary.setSeptember(summary.getSeptember() + 1);
                    break;
                case 10:
                    if (summary.getOctober() == null) {
                        summary.setOctober(0);
                    }
                    summary.setOctober(summary.getOctober() + 1);
                    break;
                case 11:
                    if (summary.getNovember() == null) {
                        summary.setNovember(0);
                    }
                    summary.setNovember(summary.getNovember() + 1);
                    break;
                case 12:
                    if (summary.getDecember() == null) {
                        summary.setDecember(0);
                    }
                    summary.setDecember(summary.getDecember() + 1);
                    break;
                default:
                    break;
            }
            modifySummaryMapper.insert(summary);
        } else { // 数据库中存在记录，执行更新操作
//             如果记录已存在，需要更新总数量和总金额
            summary.setTotal(summary.getTotal() + 1); // 增加总数量1
            BigDecimal newTotalAmount = summary.getTotalAmount().add(compensationAmount);
            summary.setTotalAmount(newTotalAmount);
//            根据月份更新对应的数量
            switch (month) {
                case 1:
                    if (summary.getJanuary() == null) {
                        summary.setJanuary(0);
                    }
                    summary.setJanuary(summary.getJanuary() + 1);
                    break;
                case 2:
                    if (summary.getFebruary() == null) {
                        summary.setFebruary(0);
                    }
                    summary.setFebruary(summary.getFebruary() + 1);
                    break;
                case 3:
                    if (summary.getMarch() == null) {
                        summary.setMarch(0);
                    }
                    summary.setMarch(summary.getMarch() + 1);
                    break;
                case 4:
                    if (summary.getApril() == null) {
                        summary.setApril(0);
                    }
                    summary.setApril(summary.getApril() + 1);
                    break;
                case 5:
                    if (summary.getMay() == null) {
                        summary.setMay(0);
                    }
                    summary.setMay(summary.getMay() + 1);
                    break;
                case 6:
                    if (summary.getJune() == null) {
                        summary.setJune(0);
                    }
                    summary.setJune(summary.getJune() + 1);
                    break;
                case 7:
                    if (summary.getJuly() == null) {
                        summary.setJuly(0);
                    }
                    summary.setJuly(summary.getJuly() + 1);
                    break;
                case 8:
                    if (summary.getAugust() == null) {
                        summary.setAugust(0);
                    }
                    summary.setAugust(summary.getAugust() + 1);
                    break;
                case 9:
                    if (summary.getSeptember() == null) {
                        summary.setSeptember(0);
                    }
                    summary.setSeptember(summary.getSeptember() + 1);
                    break;
                case 10:
                    if (summary.getOctober() == null) {
                        summary.setOctober(0);
                    }
                    summary.setOctober(summary.getOctober() + 1);
                    break;
                case 11:
                    if (summary.getNovember() == null) {
                        summary.setNovember(0);
                    }
                    summary.setNovember(summary.getNovember() + 1);
                    break;
                case 12:
                    if (summary.getDecember() == null) {
                        summary.setDecember(0);
                    }
                    summary.setDecember(summary.getDecember() + 1);
                    break;
                default:
                    break;
            }
            modifySummaryMapper.update(summary, queryWrapper);
        }


    }

    @Override
    public ResponseData searchModifySummary(SearchSummaryDTO searchSummaryDTO) {
        QueryWrapper<ModifySummary> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("year", searchSummaryDTO.getCurrentYear());
        List<ModifySummary> resultList = modifySummaryMapper.selectList(queryWrapper);
        return ResponseData.ok(resultList);
    }




}




