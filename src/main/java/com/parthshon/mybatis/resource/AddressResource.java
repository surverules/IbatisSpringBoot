package com.parthshon.mybatis.resource;


import com.parthshon.mybatis.mappers.AddressMapper;
import com.parthshon.mybatis.models.Address;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/rest/address")
@MapperScan("com.parthshon.mybatis.mappers")
public class AddressResource {

    private AddressMapper addressMapper;

    public  AddressResource(AddressMapper addressMapper){
        this.addressMapper = addressMapper;
    }
    @GetMapping(name = "/all")
    public List<Address> getall(){

        return addressMapper.getall();
    }
}
