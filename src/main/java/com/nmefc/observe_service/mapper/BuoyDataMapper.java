package com.nmefc.observe_service.mapper;

import com.nmefc.observe_service.bean.BuoyData;
import com.nmefc.observe_service.bean.BuoyDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoyDataMapper {
    long countByExample(BuoyDataExample example);

    int deleteByExample(BuoyDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BuoyData record);

    int insertSelective(BuoyData record);

    List<BuoyData> selectByExample(BuoyDataExample example);

    BuoyData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BuoyData record, @Param("example") BuoyDataExample example);

    int updateByExample(@Param("record") BuoyData record, @Param("example") BuoyDataExample example);

    int updateByPrimaryKeySelective(BuoyData record);

    int updateByPrimaryKey(BuoyData record);
}