package com.nmefc.observe_service.mapper;

import com.nmefc.observe_service.bean.ObserveConfig;
import com.nmefc.observe_service.bean.ObserveConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObserveConfigMapper {
    long countByExample(ObserveConfigExample example);

    int deleteByExample(ObserveConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ObserveConfig record);

    int insertSelective(ObserveConfig record);

    List<ObserveConfig> selectByExample(ObserveConfigExample example);

    ObserveConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ObserveConfig record, @Param("example") ObserveConfigExample example);

    int updateByExample(@Param("record") ObserveConfig record, @Param("example") ObserveConfigExample example);

    int updateByPrimaryKeySelective(ObserveConfig record);

    int updateByPrimaryKey(ObserveConfig record);
}