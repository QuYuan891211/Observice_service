package com.nmefc.observe_service.controller;

import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.responseBean.CommonResultCode;
import com.nmefc.observe_service.bean.responseBean.LoadOneBuoyResult;
import com.nmefc.observe_service.service.BuoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Date 2023/1/3 21:05
 * @Author Qu Yuan
 **/
@CrossOrigin
@RestController
@RequestMapping("/buoy")
public class BuoyDataController {
    @Autowired
    BuoyService buoyService;

    /**
     * 获取指定浮标，最近days天（days为传入参数）的浮标数据
     * @param name
     * @param days
     * @return
     */
    @GetMapping("/lastSingleData")
    public LoadOneBuoyResult LastSingleData(String name, Integer days){
        LoadOneBuoyResult loadOneBuoyResult = new LoadOneBuoyResult();
        CommonResultCode commonResultCode = new CommonResultCode();
        //传入参数为空时，返回错误信息
        if(null == name || null == days || days > 30){
           return errorParameterMessage(loadOneBuoyResult,commonResultCode);
        }

        List<BuoyData> buoyDataList = buoyService.loadOneBuoy(name,days);
        //数据库未查到时
        if (null == buoyDataList || buoyDataList.size() < 1){
            return nullParameterMessage(loadOneBuoyResult,commonResultCode);
        }

        commonResultCode.setCode("100");
        commonResultCode.setMessage("查询成功");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        loadOneBuoyResult.setBuoyDataList(buoyDataList);
        return loadOneBuoyResult;
    }
    private LoadOneBuoyResult errorParameterMessage(LoadOneBuoyResult loadOneBuoyResult, CommonResultCode commonResultCode) {
        commonResultCode.setCode("400");
        commonResultCode.setMessage("参数错误, 请联系系统管理员");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        return loadOneBuoyResult;
    }
    private LoadOneBuoyResult nullParameterMessage(LoadOneBuoyResult loadOneBuoyResult, CommonResultCode commonResultCode) {
        commonResultCode.setCode("500");
        commonResultCode.setMessage("所选时间范围无数据");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        return loadOneBuoyResult;
    }

}
