package cn.edu.guet.insurance.service.impl;

import cn.edu.guet.insurance.common.ResponseData;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.guet.insurance.bean.PrefectureCounty;
import cn.edu.guet.insurance.service.PrefectureCountyService;
import cn.edu.guet.insurance.mapper.PrefectureCountyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
* @author 14594
* @description 针对表【prefecture_county(地州_区县)】的数据库操作Service实现
* @createDate 2023-07-24 15:11:01
*/
@Service
public class PrefectureCountyServiceImpl extends ServiceImpl<PrefectureCountyMapper, PrefectureCounty>
    implements PrefectureCountyService {

    @Autowired
    PrefectureCountyMapper prefectureCountyMapper;


    @Override
    public List<Integer> getCountyByPrefecture(int prefecture) {
        QueryWrapper qw = new QueryWrapper();
        if (prefecture!=-1){
            qw.eq("prefecture",prefecture);
        }
        List<Integer> countyList=prefectureCountyMapper.selectList(qw);
        return countyList;
    }




}



