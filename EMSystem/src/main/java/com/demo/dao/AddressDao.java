package com.demo.dao;

import com.demo.entity.Address;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressDao {
    /**
     * 根据id查询地址
     * @param id
     * @return
     */
    @Select("select * from address where id=#{id}")
    public Address findById(Integer id);
}
