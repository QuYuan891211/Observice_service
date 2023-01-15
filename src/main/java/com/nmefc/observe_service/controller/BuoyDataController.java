package com.nmefc.observe_service.controller;

import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.responseBean.CommonResultCode;
import com.nmefc.observe_service.bean.responseBean.LoadOneBuoyResult;
import com.nmefc.observe_service.service.BuoyService;
import com.nmefc.observe_service.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
     * 用户自定义时间查询单一浮标数据
     * @param start
     * @param end
     * @param name
     * @return
     */
    @GetMapping("/query")
    public LoadOneBuoyResult query(String start, String end, String name){
        LoadOneBuoyResult loadOneBuoyResult = new LoadOneBuoyResult();
        CommonResultCode commonResultCode = new CommonResultCode();
        if(null == start || null == end || null == name){
            return errorParameterMessage(loadOneBuoyResult,commonResultCode);
        }
        Date startTime;
        Date endTime;

        //传入参数为空时，返回错误信息
        try {
            startTime = TimeUtils.UTCToCST(start, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            endTime = TimeUtils.UTCToCST(end, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            Integer differ = TimeUtils.getDayDiffer(startTime,endTime);
            if(30 < differ){
                return errorDateRange(loadOneBuoyResult,commonResultCode);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List<BuoyData> buoyDataList = null;
        buoyDataList = buoyService.query(startTime, endTime, name);
        //数据库未查到时
        if (null == buoyDataList || buoyDataList.size() < 1){
            SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
//            String timeMessage = f.format(startTime) + "-" + f.format(endTime);
            String timeMessage = "所选时间";
            return nullDataMessage(loadOneBuoyResult,commonResultCode,timeMessage);
        }
        commonResultCode.setCode("100");
        commonResultCode.setMessage("查询成功");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        loadOneBuoyResult.setBuoyDataList(buoyDataList);
        return loadOneBuoyResult;
    }
    /**
     * 获取指定浮标，最近days天（days为传入参数）的浮标数据
     * @param name
     * @param days
     * @return
     */
    @GetMapping("/lastSingle")
    public LoadOneBuoyResult lastSingleData(Integer days, String name){
        LoadOneBuoyResult loadOneBuoyResult = new LoadOneBuoyResult();
        CommonResultCode commonResultCode = new CommonResultCode();
        //传入参数为空时，返回错误信息
        if(null == name || null == days){
           return errorParameterMessage(loadOneBuoyResult,commonResultCode);
        }
        if(30 < days){
            return errorDateRange(loadOneBuoyResult,commonResultCode);
        }
        List<BuoyData> buoyDataList = null;
        try {
            buoyDataList = buoyService.loadLastData(days,name);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //数据库未查到时
        if (null == buoyDataList || buoyDataList.size() < 1){
            return nullDataMessage(loadOneBuoyResult,commonResultCode, "最近" + days.toString() + "天");
        }

        commonResultCode.setCode("100");
        commonResultCode.setMessage("查询成功");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        loadOneBuoyResult.setBuoyDataList(buoyDataList);
        return loadOneBuoyResult;
    }

    /**
     * 获取全部浮标，最近days天（days为传入参数）的浮标数据
     * @param days
     * @return
     */
    @GetMapping("/lastAll")
    public LoadOneBuoyResult LastAllData(Integer days){
        LoadOneBuoyResult loadOneBuoyResult = new LoadOneBuoyResult();
        CommonResultCode commonResultCode = new CommonResultCode();
        //传入参数为空时，返回错误信息
        if(null == days){
            return errorParameterMessage(loadOneBuoyResult,commonResultCode);
        }
        if(30 < days){
            return errorDateRange(loadOneBuoyResult,commonResultCode);
        }
        List<BuoyData> buoyDataList = null;
        try {
            buoyDataList = buoyService.loadLastData(days,null);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //数据库未查到时
        if (null == buoyDataList || buoyDataList.size() < 1){
            return nullDataMessage(loadOneBuoyResult,commonResultCode, "最近" + days.toString() + "天");
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
    private LoadOneBuoyResult nullDataMessage(LoadOneBuoyResult loadOneBuoyResult, CommonResultCode commonResultCode, String time) {
        commonResultCode.setCode("500");
        commonResultCode.setMessage(time + "范围内，该点位观测数据未到报");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        return loadOneBuoyResult;
    }

    private LoadOneBuoyResult errorDateRange(LoadOneBuoyResult loadOneBuoyResult, CommonResultCode commonResultCode) {
        commonResultCode.setCode("500");
        commonResultCode.setMessage("暂不支持检索时间范围超过30天，请重新选择时间");
        loadOneBuoyResult.setCommonResultCode(commonResultCode);
        return loadOneBuoyResult;
    }

}
