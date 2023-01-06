package com.nmefc.observe_service.bean.responseBean;

import com.nmefc.observe_service.bean.ObserveConfig;

import java.util.List;

/**
 * @Description
 * @Date 2023/1/6 15:10
 * @Author Qu Yuan
 **/
public class ConfigResult {
    public List<ObserveConfig> getObserveConfigList() {
        return observeConfigList;
    }

    public void setObserveConfigList(List<ObserveConfig> observeConfigList) {
        this.observeConfigList = observeConfigList;
    }

    public CommonResultCode getCommonResultCode() {
        return commonResultCode;
    }

    public void setCommonResultCode(CommonResultCode commonResultCode) {
        this.commonResultCode = commonResultCode;
    }

    private List<ObserveConfig> observeConfigList;

    private CommonResultCode commonResultCode;
}
