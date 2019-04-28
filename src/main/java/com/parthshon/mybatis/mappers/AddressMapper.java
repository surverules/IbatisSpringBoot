package com.parthshon.mybatis.mappers;


import com.parthshon.mybatis.models.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Select("select * from address")
    public List<Address> getall();
}
