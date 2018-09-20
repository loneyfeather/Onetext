package com.cn.bean;

import com.cn.dao.UserControlDao;
import com.cn.daoImp.UserDaoImp;

public class DeleteUserBean {
	public int deleteUser(String id) {
		@SuppressWarnings("rawtypes")
		UserControlDao usercontroldao=(UserControlDao) new UserDaoImp();
		return usercontroldao.deleteUser(id);
	}

}
