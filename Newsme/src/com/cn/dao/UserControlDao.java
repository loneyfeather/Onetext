package com.cn.dao;

import java.util.List;

public interface UserControlDao<User> {
	public List<User> findUser(String key);//用户查询
	public int updateUser(int id, String username, String password, String sex, String favourite, String note);//修改用户信息
	public int deleteUser(String id);//删除用户

	public int updateUP(String id, String newpassword);//修改密码
	

}
