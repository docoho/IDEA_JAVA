package com.itheima.mapper;

import com.itheima.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {

    List<Brand> selectAll();
    Brand selectByID(int id);

    /**
     * Selectbycondition
     * @return
     */
    /*List<Brand> selectByCondition(@Param("id")int id,
                                  @Param("name")String name,
                                  @Param("gender")String gender);*/
    //List<Brand>selectByCondition(Brand brand);
    List<Brand>selectByCondition(Map map);

    //single condition to select
    List<Brand>selectBySingleCondition(Brand brand);


    //add data
    void selectAddData(Brand brand);


    void updateAll(Brand brand);













}
