package com.ydh.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.ydh.pojo.User;
import com.ydh.service.UserService;
import com.ydh.service.impl.UserServiceImpl;

public class MyRealm extends AuthorizingRealm {

	@Override//授权
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override//身份认证 ctrl+T
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取需要验证的用户名
		String uname = (String) token.getPrincipal();
		//从数据库获取用户信息
		UserService uService = new UserServiceImpl();
		User user = uService.checkUser(uname);
		System.out.println(user);
		SimpleAuthenticationInfo info = new 
				SimpleAuthenticationInfo(uname, user.getUpass(), getName());
		return info;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "myrealm";
	}

}
