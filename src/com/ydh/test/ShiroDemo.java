package com.ydh.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory<SecurityManager> factory = new 
				IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("dailong", "1234562");
		try {
			subject.login(token);
			if(subject.isAuthenticated()){
				System.out.println("认证成功");
			}
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("认证失败");
		}
	}

}
