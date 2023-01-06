package com.nmefc.observe_service.service.serviceImp;

import com.nmefc.observe_service.bean.ObserveConfig;
import com.nmefc.observe_service.bean.ObserveConfigExample;
import com.nmefc.observe_service.mapper.ObserveConfigMapper;
import com.nmefc.observe_service.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 获取基本信息
 * @Date 2023/1/6 14:43
 * @Author Qu Yuan
 **/
@Service("configService")
public class ConfigDataServiceImp implements ConfigService {
    @Autowired
    ObserveConfigMapper observeConfigMapper;
    @Override
    public List<ObserveConfig> getDataByQuery(ObserveConfigExample observeConfigExample) {
        return observeConfigMapper.selectByExample(observeConfigExample);
    }


    @Override
    public List<ObserveConfig> getAll() {
        ObserveConfigExample observeConfigExample = new ObserveConfigExample();
        return getDataByQuery(observeConfigExample);
    }
}
