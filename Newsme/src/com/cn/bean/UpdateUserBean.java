package com.cn.bean;



import com.cn.dao.UserControlDao;
import com.cn.daoImp.UserDaoImp;
import com.cn.model.User;


public class UpdateUserBean {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int updateUser(int id, String username, String password, String sex, String favourite, String note) {
		UserControlDao s=new UserDaoImp();
		return s.updateUser(id,username,password,sex,favourite,note);
	}


}
