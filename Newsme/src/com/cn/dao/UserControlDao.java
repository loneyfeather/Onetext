package com.cn.dao;

import java.util.List;

public interface UserControlDao<User> {
	public List<User> findUser(String key);//�û���ѯ
	public int updateUser(int id, String username, String password, String sex, String favourite, String note);//�޸��û���Ϣ
	public int deleteUser(String id);//ɾ���û�

	public int updateUP(String id, String newpassword);//�޸�����
	

}
