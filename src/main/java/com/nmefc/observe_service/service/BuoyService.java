package com.nmefc.observe_service.service;

//import com.nmefc.observice_service.bean.responseBean.middleBean.LastSingleBuoyData;

import com.nmefc.observe_service.bean.BuoyData;

import java.util.List;

/**
 * @Description
 * @Date 2023/1/3 21:10
 * @Author Qu Yuan
 **/
public interface BuoyService extends BaseBuoyService{
    /**
     * 获取最新单个浮标的数据（30天数据）
     * @param name
     * @return
     */
    List<BuoyData> loadOneBuoy(String name, Integer days);
}
