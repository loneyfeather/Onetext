package com.cn.dao;

import com.cn.model.User;

public interface UserDao {
	public User getUser(String name,String pass);
	public int addUser(User u);
}
