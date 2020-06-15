package com.ydh.pojo;

import java.util.Date;

public class User {

	//所有属性私有化
	private int id;
	private String name;
	private String uname;
	private String upass;
	private String phone;
	private String mail;
	private Date audate;
	private int roleuid;
	
	//所有属性必须有get和set方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getAudate() {
		return audate;
	}
	public void setAudate(Date audate) {
		this.audate = audate;
	}
	public int getRoleuid() {
		return roleuid;
	}
	public void setRoleuid(int roleuid) {
		this.roleuid = roleuid;
	}
	
	//toString，打印信息
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", uname=" + uname + ", upass=" + upass + ", phone=" + phone
				+ ", mail=" + mail + ", audate=" + audate + ", roleuid=" + roleuid + "]";
	}
	
	
}
