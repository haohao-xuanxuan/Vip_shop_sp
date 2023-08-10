package cn.edu.guet.controller;

import cn.edu.guet.common.ResponseData;
import cn.edu.guet.mapper.EntertainmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EntertainmentController {

    @Autowired
    private EntertainmentMapper entertainmentMapper;


    @GetMapping("/entertainmentList")
    public ResponseData entertainmentList() {

        return ResponseData.ok(entertainmentMapper.selectList(null));
    }

}
