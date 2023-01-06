package com.nmefc.observe_service.service;

import com.nmefc.observe_service.bean.ObserveConfig;
import com.nmefc.observe_service.bean.ObserveConfigExample;

import java.util.List;

public interface ConfigService extends BaseService<ObserveConfig, ObserveConfigExample>{
//    List<> getDataByQuery(BuoyDataExample buoyDataExample);

//    List<BuoyData> loadOneBuoy(String name);

    List<ObserveConfig> getAll();
}
