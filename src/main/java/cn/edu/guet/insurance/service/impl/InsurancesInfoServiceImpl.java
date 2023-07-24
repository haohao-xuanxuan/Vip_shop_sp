package cn.edu.guet.insurance.service.impl;


import cn.edu.guet.insurance.bean.InsuranceList;
import cn.edu.guet.insurance.bean.SearchInsurancesDTO;
import cn.edu.guet.insurance.common.ResponseData;
import cn.edu.guet.insurance.mapper.InsuranceListMapper;
import cn.edu.guet.insurance.service.InsurancesInfoService;
import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huanglusong
 * @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service实现
 * @createDate 2023-07-22 21:05:27
 */
@Service
public class InsurancesInfoServiceImpl implements InsurancesInfoService {

    @Autowired
    private InsuranceListMapper infoMapper;

    @Override
    public ResponseData createInsurances(InsuranceList insuranceList) {

        infoMapper.insert(insuranceList);
        return ResponseData.ok("保存成功！");
    }

    @Override
    public IPage searchInsurances(SearchInsurancesDTO insurancesDTO) {
        Page page = new Page();
        page.setSize(insurancesDTO.getPageSize());
        page.setCurrent(insurancesDTO.getCurrentPage());
        QueryWrapper<InsuranceList> qw = new QueryWrapper();
        if (insurancesDTO.getPrefecture() != 0) {
            qw.eq("prefecture", insurancesDTO.getPrefecture());
        }
        if (insurancesDTO.getCounty() != 0) {
            qw.eq("county", insurancesDTO.getCounty());
        }
        if (!StringUtils.isBlank(insurancesDTO.getModifyProjectName())){
            qw.like("modify_project_name", insurancesDTO.getModifyProjectName());
        }
        if (CollectionUtil.isNotEmpty(insurancesDTO.getOverWorkTime())){
            qw.between("actual_completion_time",insurancesDTO.getOverWorkTime().get(0),insurancesDTO.getOverWorkTime().get(1));
        }
        IPage listResult = infoMapper.selectPage(page, qw);
        return listResult;
    }


    @Override
    public ResponseData deleteInsurances(List<Long> ids) {
        int delete = infoMapper.deleteBatchIds(ids);
        if (delete>0){
            return ResponseData.ok("删除成功");
        }
        else {
            return ResponseData.fail("删除失败");
        }
    }

    @Override
    public ResponseData updateInsurances(InsuranceList insuranceList) {
        int update = infoMapper.updateById(insuranceList);
        if (update>0){
            return ResponseData.ok("更新成功");
        }
        else {
            return ResponseData.fail("更新失败");
        }
    }
}




