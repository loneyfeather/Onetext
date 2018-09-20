package com.cn.bean;

import com.cn.dao.UserControlDao;
import com.cn.daoImp.UserDaoImp;


public class FindUserBean {
	@SuppressWarnings("rawtypes")
	public java.util.List FindUser(String key){//”√List±®¥Ì
		UserControlDao usercontroldao=(UserControlDao) new UserDaoImp();
		return usercontroldao.findUser(key);
		
	}

}
