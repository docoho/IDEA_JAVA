package com.itheima.test;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Hello
 * @description:
 * @author: Docoho
 * @create: 2022-11-07 15:51
 **/
public class MybatisTest {
    @Test
    public void testSelect() throws IOException {

        //Param
        int id = 1 ;
        String name = "do";
        String gender = "F";
        String major = "PE";
        String address = "New york";
        /*name = "%" + name + "%";
        gender = "%" + gender + "%";*/

        //object
        Brand brand = new Brand(id,name,gender,address,major);


        //Map
        //Map map = new HashMap();
        //map.put("id",id);
        //map.put("name", name);
        //map.put("gender",gender);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectAll();
        //System.out.println(brands);
        //List<Brand> brands1=brandMapper.selectByCondition(id,name,gender);
        //List<Brand> brands1=brandMapper.selectByCondition(brand);
        //List<Brand> brands1 = brandMapper.selectByCondition(map);
        brandMapper.selectAddData(brand);
        //Integer id=brand.getId();
        //System.out.println(id);
        // sqlSession.commit();
        sqlSession.close();
    }



    @Test
    public void testUpdate() throws IOException {

        //Param
        int id = 1 ;
        String name = "do";
        String gender = "F";
        String major = "PE";
        String address = "New york";
        /*name = "%" + name + "%";
        gender = "%" + gender + "%";*/

        //object
        Brand brand = new Brand(id,name,gender,address,major);


        //Map
        //Map map = new HashMap();
        //map.put("id",id);
        //map.put("name", name);
        //map.put("gender",gender);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        //List<Brand> brands = brandMapper.selectAll();
        //System.out.println(brands);
        //List<Brand> brands1=brandMapper.selectByCondition(id,name,gender);
        //List<Brand> brands1=brandMapper.selectByCondition(brand);
        //List<Brand> brands1 = brandMapper.selectByCondition(map);
        brandMapper.updateAll(brand);
        /*Integer id=brand.getId();
        System.out.println(id);*/
        // sqlSession.commit();
        sqlSession.close();
    }
}
