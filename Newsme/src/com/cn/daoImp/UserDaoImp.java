package com.cn.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cn.dao.UserControlDao;
import com.cn.dao.UserDao;
import com.cn.model.User;
import com.cn.util.JDBCutil;

public class UserDaoImp implements UserDao, UserControlDao {
	JDBCutil dbu=null;
	ResultSet rs=null;
	public UserDaoImp() {
		dbu= new JDBCutil();
	}
	/* ��¼  */
	@Override
	public User getUser(String name, String pass) {
		String sql="select * from user where username='"+name+"' and password='"+pass+"'";
		
		rs=dbu.Query(sql);
		
		User user=null;
		try {
			while(rs.next()) {
				user=new User();
				user.setId(rs.getInt("Id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setProfession(rs.getString("profession"));
				user.setSex(rs.getString("sex"));
				user.setType(rs.getString("type"));
				user.setNote(rs.getString("note"));
				user.setFavourite(rs.getString("favourite"));
			}
		} catch (SQLException e) {
			System.out.println(sql);
			e.printStackTrace();
		}
		
		return user;
	}
	
	/* ע��  */
	@Override
	public int addUser(User u){
		String sql="insert into user(username,password,sex,profession,favourite,note,type) values('"+u.getUsername()+"','"+u.getPassword()+"','"+u.getSex()+"','"+u.getProfession()+"','"+u.getFavourite()+"','"+u.getNote()+"','"+u.getType()+"')";
		int i=dbu.update(sql);
		
		return i;
	}
	
	//��ѯ�û�
		public List<User> findUser(String key){
			String str="";
			if(key!="") {
				str=" where u.username like '%"+key+"%'";
				
			}
			String sql="select * from user u"+str;
			ResultSet rs=dbu.Query(sql);
			List<User> list=new ArrayList<User>();
			
			User user=null;
			try {
				while(rs.next()) {
					user=new User();//����newһ��User�����²��ܵ���user�����set��������
					user.setId(rs.getInt("id"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setSex(rs.getString("sex"));
					user.setProfession(rs.getString("profession"));
					user.setFavourite(rs.getString("favourite"));
					user.setNote(rs.getString("note"));
					user.setType(rs.getString("type"));
					list.add(user);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 		return list;
			
		}
		
		//�޸� �û�������Ա������
		public int updateUser(int id, String username, String password, String sex, String favourite, String note) {
			String sql="update user set username='"+username+"',password='"+password+"',sex='"+sex+"',favourite='"+favourite+"',note='"+note+"' where id='"+id+"'";
			int i=-1;
			System.out.println(sql);
			i=dbu.update(sql);
			return i;
		}
		
		//ɾ���û�
		public int deleteUser(String id) {
			String sql="delete from user where id="+id;
			int i=-1;
			i=dbu.update(sql);
			return i;
		}
		
		//�޸��Լ������� UP=UserPassword
		public int updateUP(String id,String newpassword) {
			String sql="update user set password='"+newpassword+"' where id='"+id+"'";
			int i=-1;
			i=dbu.update(sql);
			return i;
		}
		
		
}






