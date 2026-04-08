package com.sslibrary.cv_project.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User_dao {

    @Insert("INSERT INTO info (name,email,inquiry)" + "VALUES (#{name}, #{email}, #{inquiry})")
    int insert(String name, String email, String inquiry);

}
