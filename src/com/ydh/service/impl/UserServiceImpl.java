package com.ydh.service.impl;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ydh.mapper.UserMapper;
import com.ydh.pojo.User;
import com.ydh.service.UserService;

public class UserServiceImpl implements UserService {

	public static SqlSessionFactory build;
	static{
		try {
			build = new SqlSessionFactoryBuilder().
					build(Resources.getResourceAsReader("mybatis.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public User checkUser(String uname) {
		SqlSession session = build.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		return mapper.checkUser(uname);
	}

}
