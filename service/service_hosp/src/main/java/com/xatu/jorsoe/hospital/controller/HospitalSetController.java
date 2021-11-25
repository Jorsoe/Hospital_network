package com.xatu.jorsoe.hospital.controller;

import com.xatu.jorsoe.hospital.model.hosp.HospitalSet;
import com.xatu.jorsoe.hospital.service.HospitalSetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Renke
 * @DateTime: 2021/11/25 14:13
 * @Description: TODO 医院配置Web
 */

@Api(tags = "医院配置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    @ApiOperation(value = "获取所有医院设置信息")
    @GetMapping("findAll")
    public List<HospitalSet> getHospitalSet(){
        List<HospitalSet> list = hospitalSetService.list();
        return list;
    }

    @ApiOperation(value = "逻辑删除医院配置")
    @DeleteMapping("{id}")
    public boolean removeHospital(@PathVariable Long id){
        boolean flag = hospitalSetService.removeById(id);
        return flag;
    }
}