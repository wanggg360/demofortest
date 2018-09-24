package com.wg.spring4.dao;

import org.apache.ibatis.annotations.Param;

import com.wg.spring4.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int getMatchCount(@Param("userName") String userName, @Param("password") String password );
}