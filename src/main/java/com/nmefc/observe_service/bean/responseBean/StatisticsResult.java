package com.nmefc.observe_service.bean.responseBean;


/**
 * @Description
 * @Date 2023/1/16 20:44
 * @Author Qu Yuan
 **/
public class StatisticsResult {
    private CommonResultCode commonResultCode;

    private Long num;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public CommonResultCode getCommonResultCode() {
        return commonResultCode;
    }

    public void setCommonResultCode(CommonResultCode commonResultCode) {
        this.commonResultCode = commonResultCode;
    }
}
