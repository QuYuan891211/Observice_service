package com.nmefc.observe_service.service.serviceImp;

//import com.nmefc.observice_service.bean.responseBean.middleBean.LastSingleBuoyData;
import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.BuoyDataExample;
import com.nmefc.observe_service.mapper.BuoyDataMapper;
import com.nmefc.observe_service.service.BuoyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@org.springframework.stereotype.Service("buoyDataService")
public class BuoyDataServiceImp implements BuoyService {
    @Autowired
    BuoyDataMapper buoyDataMapper;
    @Override
    public List<BuoyData> getDataByQuery(BuoyDataExample buoyDataExample) {
        return buoyDataMapper.selectByExample(buoyDataExample);
    }


    @Override
    public List<BuoyData> loadOneBuoy(String name, Integer days) {
        List<BuoyData> buoyDataArrayList = new ArrayList<>();
        //获取当前日期
        Date end = new Date();
        //创建Calendar实例
        Calendar cal = Calendar.getInstance();
        //设置当前时间
        cal.setTime(end);
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) - days);
        //获取days天前的日期：此时end为当前系统时间，start为days天前时间
        Date start = cal.getTime();


        BuoyDataExample buoyDataExample = new BuoyDataExample();
        BuoyDataExample.Criteria criteria =  buoyDataExample.createCriteria();
        //检索浮标名称等于传入的name，并且时间在传入时间前days天的数据
        criteria.andSiteEqualTo(name).andQueryTimeBetween(start,end);
        try{
            buoyDataArrayList = getDataByQuery(buoyDataExample);
        }catch (Exception e){
            throw e;
        }
        return buoyDataArrayList;
    }
}
