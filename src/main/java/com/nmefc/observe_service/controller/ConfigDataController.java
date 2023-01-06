package com.nmefc.observe_service.controller;

import com.nmefc.observe_service.bean.ObserveConfig;
import com.nmefc.observe_service.bean.responseBean.CommonResultCode;
import com.nmefc.observe_service.bean.responseBean.ConfigResult;
import com.nmefc.observe_service.service.ConfigService;
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
@RequestMapping("/config")
public class ConfigDataController {
    @Autowired
    ConfigService configService;

    /**
     * 获取基础信息数据
     * @param
     * @param
     * @return
     */
    @GetMapping("/all")
    public ConfigResult getAllConfig(){
        ConfigResult configResult = new ConfigResult();
        CommonResultCode commonResultCode = new CommonResultCode();

        List<ObserveConfig> observeConfigList = configService.getAll();
        //数据库未查到时
        if (null == observeConfigList || observeConfigList.size() < 1){
            return nullParameterMessage(configResult,commonResultCode);
        }
        commonResultCode.setCode("100");
        commonResultCode.setMessage("查询成功");
        configResult.setCommonResultCode(commonResultCode);
        configResult.setObserveConfigList(observeConfigList);
        return configResult;
    }
    private ConfigResult nullParameterMessage(ConfigResult configResult, CommonResultCode commonResultCode) {
        commonResultCode.setCode("500");
        commonResultCode.setMessage("所选时间范围无数据");
        configResult.setCommonResultCode(commonResultCode);
        return configResult;
    }

}
