package com.nmefc.observe_service.bean.responseBean;

//import com.nmefc.observice_service.bean.responseBean.middleBean.LastSingleBuoyData;

import com.nmefc.observe_service.bean.BuoyData;

import java.util.List;

public class LoadOneBuoyResult {


    public List<BuoyData> getBuoyDataList() {
        return buoyDataList;
    }

    public void setBuoyDataList(List<BuoyData> buoyDataList) {
        this.buoyDataList = buoyDataList;
    }

    private List<BuoyData> buoyDataList;

    private CommonResultCode commonResultCode;

    public CommonResultCode getCommonResultCode() {
        return commonResultCode;
    }

    public void setCommonResultCode(CommonResultCode commonResultCode) {
        this.commonResultCode = commonResultCode;
    }


}
