package com.example.sell.mapper;

import com.example.sell.domain.OrderMaster;
import com.example.sell.domain.OrderMasterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderMasterMapper {
    int countByExample(OrderMasterExample example);

    int deleteByExample(OrderMasterExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    List<OrderMaster> selectByExample(OrderMasterExample example);

    OrderMaster selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    int updateByExample(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);
}