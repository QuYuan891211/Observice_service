package com.nmefc.observe_service.service;

import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.BuoyDataExample;

import java.util.List;

public interface BaseBuoyService {
    List<BuoyData> getDataByQuery(BuoyDataExample buoyDataExample);

//    List<BuoyData> loadOneBuoy(String name);
}
