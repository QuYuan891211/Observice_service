package com.nmefc.observe_service.service;

import java.util.List;

public interface BaseService<T,K> {
    List<T> getDataByQuery(K k);

//    List<BuoyData> loadOneBuoy(String name);
}
