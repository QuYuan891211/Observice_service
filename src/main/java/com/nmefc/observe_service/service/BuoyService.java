package com.nmefc.observe_service.service;

//import com.nmefc.observice_service.bean.responseBean.middleBean.LastSingleBuoyData;

import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.BuoyDataExample;
import org.springframework.lang.Nullable;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Date 2023/1/3 21:10
 * @Author Qu Yuan
 **/
public interface BuoyService extends BaseService<BuoyData, BuoyDataExample> {
    /**
     * 获取浮标的指定最近天数据(指定或全部)
     * @param name
     * @return
     */
    List<BuoyData> loadLastData(Integer days, String name) throws ParseException;


//    List<BuoyData> loadAllBuoy(Integer days);

    /**
     * 获取指定日期的单个浮标数据
     * @param start
     * @param end
     * @param name
     * @return
     */
    List<BuoyData> query(Date start, Date end, String name);
}
