package cn.edu.guet.insurance.service.impl;
import cn.edu.guet.insurance.bean.SearchModifyDTO;
import cn.edu.guet.insurance.common.ResponseData;
import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.insurance.bean.ModifyBasicInfo;
import cn.edu.guet.insurance.service.ModifyBasicInfoService;
import cn.edu.guet.insurance.mapper.ModifyBasicInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* @author 14594
* @description 针对表【modify_basic_info(modify_basic_info)】的数据库操作Service实现
* @createDate 2023-07-23 21:50:29
*/
@Service
public class ModifyBasicInfoServiceImpl extends ServiceImpl<ModifyBasicInfoMapper, ModifyBasicInfo>
    implements ModifyBasicInfoService {

    @Autowired
    ModifyBasicInfoMapper modifyBasicInfoMapper;

    @Override
    public IPage searchModify(SearchModifyDTO searchModifyDTO) {
        Page page = new Page();
        page.setSize(searchModifyDTO.getPageSize());
        page.setCurrent(searchModifyDTO.getCurrentPage());
        QueryWrapper<ModifyBasicInfo> qw = new QueryWrapper();
        if (searchModifyDTO.getPrefecture() != 0) {
            qw.eq("prefecture", searchModifyDTO.getPrefecture());
        }
        if (searchModifyDTO.getCounty() != 0) {
            qw.eq("county", searchModifyDTO.getCounty());
        }
        if (!StringUtils.isBlank(searchModifyDTO.getModifyProjectName())) {
            qw.like("modify_project_name", searchModifyDTO.getModifyProjectName());
        }
        if (CollectionUtil.isNotEmpty(searchModifyDTO.getOverWorkTime())) {
            qw.between("actual_completion_time", searchModifyDTO.getOverWorkTime().get(0), searchModifyDTO.getOverWorkTime().get(1));
        }
        IPage listResult = modifyBasicInfoMapper.selectPage(page, qw);

        return listResult;
    }

    @Override
    public ResponseData addChangeReform(ModifyBasicInfo modifyBasicInfo) {
        int insert = modifyBasicInfoMapper.insert(modifyBasicInfo);
        System.out.println("ssssssss:" + insert);

        if (insert > 0) {
            return ResponseData.ok("保存成功");
        } else {
            return ResponseData.fail("保存失败");
        }
    }

    @Override
    public ResponseData deleteModify(List<Integer> deleteId) {
        int delete = modifyBasicInfoMapper.deleteBatchIds(deleteId);
        if (delete>0){
            return ResponseData.ok("删除成功");
        }
        else {
            return ResponseData.fail("删除失败");
        }
    }
}






