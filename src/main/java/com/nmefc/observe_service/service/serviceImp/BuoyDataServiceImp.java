package com.nmefc.observe_service.service.serviceImp;

//import com.nmefc.observice_service.bean.responseBean.middleBean.LastSingleBuoyData;
import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.BuoyDataExample;
import com.nmefc.observe_service.mapper.BuoyDataMapper;
import com.nmefc.observe_service.service.BuoyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public List<BuoyData> loadLastData(Integer days,String name) throws ParseException {
        List<BuoyData> buoyDataArrayList = new ArrayList<>();
        //TODO：生产环境中需要注释：开发环境指定当前日期
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date end = dateFormat.parse("2023-01-06 13:43:21");
        //TODO：生产环境中需要取消此注释：获取当前日期
//        Date end = new Date();
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
        if(null != name){
            criteria.andSiteEqualTo(name);
        }
        criteria.andQueryTimeBetween(start,end);
        try{
            buoyDataArrayList = getDataByQuery(buoyDataExample);
        }catch (Exception e){
            throw e;
        }
        return buoyDataArrayList;
    }

    /**
     * 获取各个浮标最新的且有效波高有的数据
     * @param days
     * @param name
     * @return
     */
    @Override
    public List<BuoyData> loadLastDataWithZBGData(Integer days,String name) throws ParseException {
        List<BuoyData> buoyDataArrayList = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //TODO：生产环境中需要注释：开发环境指定当前日期
        Date end = dateFormat.parse("2023-01-06 13:43:21");
        //TODO：生产环境中需要取消此注释：获取当前日期
        //String datestr = dateFormat.format(new Date());
        //Date end = dateFormat.parse(datestr);
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
        if(null != name){
            criteria.andSiteEqualTo(name);
        }
        criteria.andQueryTimeBetween(start,end);
        criteria.andZbgIsNotNull();
        try{
            buoyDataArrayList = getDataByQuery(buoyDataExample);
        }catch (Exception e){
            throw e;
        }
        return buoyDataArrayList;
    }

    /**
     * 统计到报情况
     * @return
     * @throws ParseException
     */
    @Override
    public Long statisticsNow() throws ParseException {
        Long num;
//        Statistic statistic = new Statistic();
//        List<BuoyData> buoyDataArrayList = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        //TODO：生产环境中需要注释：开发环境指定当前日期
        Date end = dateFormat.parse("2023-01-06 13:43:21");
        //TODO：生产环境中需要取消此注释：获取当前日期
        //String datestr = dateFormat.format(new Date());
        //Date end = dateFormat.parse(datestr);

        //创建Calendar实例
        Calendar cal = Calendar.getInstance();
        //设置当前时间
        cal.setTime(end);
        cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 1);
        //获取days天前的日期：此时end为当前系统时间，start为days天前时间
        Date target = cal.getTime();
        BuoyDataExample buoyDataExample = new BuoyDataExample();
        BuoyDataExample.Criteria criteria =  buoyDataExample.createCriteria();
        criteria.andQueryTimeEqualTo(target);
        try{
            num = buoyDataMapper.countByExample(buoyDataExample);
        }catch (Exception e){
            throw e;
        }



        return num;
    }

    /**
     * 获取指定浮标的指定时间段的数据
     * @param start
     * @param end
     * @param name
     * @return
     */
    @Override
    public List<BuoyData> query(Date start, Date end, String name) {
        List<BuoyData> buoyDataArrayList = new ArrayList<>();
        BuoyDataExample buoyDataExample = new BuoyDataExample();
        BuoyDataExample.Criteria criteria =  buoyDataExample.createCriteria();
        criteria.andSiteEqualTo(name);
        criteria.andQueryTimeBetween(start,end);
        try{
            buoyDataArrayList = getDataByQuery(buoyDataExample);
        }catch (Exception e){
            throw e;
        }
        return buoyDataArrayList;
    }

    @Override
    public List<BuoyData> filterLastOneData(List<BuoyData> buoyDataList) {
        List<BuoyData> filterList = new ArrayList<BuoyData>();
        Collections.reverse(buoyDataList);
        //去重
        Set<BuoyData> set = new TreeSet<BuoyData>(new Comparator<BuoyData>(){
            @Override
            public int compare(BuoyData a, BuoyData b) {
                return a.getSite().compareTo(b.getSite());
            }
        });
        set.addAll(buoyDataList);
        filterList = new ArrayList<BuoyData>(set);
        filterList.sort(new Comparator<BuoyData>() {
            @Override
            public int compare(BuoyData buoyData1, BuoyData buoyData2) {
                String site1 = buoyData1.getSite();
                String site2 = buoyData2.getSite();
                return site1.compareTo(site2);
            }
        });
    return filterList;
    }


}
