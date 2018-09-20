package com.cn.bean;

import com.cn.dao.UserDao;
import com.cn.daoImp.UserDaoImp;
import com.cn.model.User;

public class AddUserBean {

	public int addUser(User u) {
		UserDao userdao=new UserDaoImp();
		
		return userdao.addUser(u);
	}

}
