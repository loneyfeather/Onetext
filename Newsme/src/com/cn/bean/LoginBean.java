package com.cn.bean;

import com.cn.dao.UserDao;
import com.cn.daoImp.UserDaoImp;
import com.cn.model.User;

public class LoginBean {
	UserDao userdao=null;
	
	 public LoginBean() {
		userdao = new UserDaoImp(); 
	 }
	 
	 public User login(String username,String password) {
		 
		 User u =userdao.getUser(username, password);
		 
		 return u;
	 }
}
