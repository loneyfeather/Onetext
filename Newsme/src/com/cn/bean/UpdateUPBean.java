
package com.cn.bean;

import com.cn.dao.UserControlDao;
import com.cn.daoImp.UserDaoImp;

public class UpdateUPBean {

	public int updateUP(String id, String newpassword) {
		@SuppressWarnings("rawtypes")
		UserControlDao usercontroldao= new UserDaoImp();
		return usercontroldao.updateUP(id,newpassword);
	}

}
