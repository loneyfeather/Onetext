package com.cn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCutil{
	Connection conn=null;
	Statement stm=null;
	ResultSet rs=null;
	public JDBCutil() {
		GetConnection();
	}
//连接数据库
public void GetConnection() {
	try {
		String url="jdbc:mysql://localhost:3306/newspress";
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,"root","zhouguang1997");
		stm=conn.createStatement();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//执行sql语句
public ResultSet Query(String sql) {
	try {
		rs=stm.executeQuery(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rs;
}

public int update(String sql) {
	int i=-1;
	try {
		i=stm.executeUpdate(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
}

public void close() {
	try {
		if(rs!=null) {
			rs.close();
		}
		if(stm!=null) {
			stm.close();
		}
		if(conn!=null) {
			conn.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
