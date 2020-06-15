package com.ydh.mapper;

import org.apache.ibatis.annotations.Select;

import com.ydh.pojo.User;

public interface UserMapper {

	@Select("select * from user where uname=#{uname}")
	User checkUser(String uname);
}
