package com.cn.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cn.dao.NewsDao;
import com.cn.model.News;
import com.cn.util.JDBCutil;

public class NewsDaoImp implements NewsDao{
	JDBCutil dbu=null;
	public NewsDaoImp() {
		dbu=new JDBCutil();
	}
	//添加新闻
	@Override
	public int addNews(News news) {
		String sql="insert into news(title,content,pubtime,userid)values('"+news.getTitle()+"','"+news.getContent()+"','"+news.getPubtime()+"',"+news.getUserid()+")";
		System.out.println(sql);
		return dbu.update(sql);
	
	}
	//删除新闻
	public int deleteNews(String id) {
		String sql="delete  from news where id="+id;
		int i=-1;
		i=dbu.update(sql);
		return i;
	}
	//修改新闻
	public int updateNews(News news) {
		String sql="update news set title='"+news.getTitle()+"',content='"+news.getContent()+"' where id="+news.getId();
		int i=-1;
		i=dbu.update(sql);
		return i;
	}
	//查询新闻 
	@Override
	public List<News> findNews(String key) {
		String str="";
		if(key!="") {
			str="AND n.title like '%"+key+"%'";
		}
		String sql="SELECT  u.username,n.* from  user u,news n where u.id=n.userid "+str;
		ResultSet rs=dbu.Query(sql);
		List<News> list=new ArrayList<News>();		
		try {
			while(rs.next()) {
				News news=new News();
				news.setId(rs.getInt("Id"));
				news.setContent(rs.getString("content"));
				news.setPubtime(rs.getString("pubtime"));
				news.setTitle(rs.getString("title"));
				news.setUserid(rs.getInt("userid"));
				news.setUsername(rs.getString("username"));
				list.add(news);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

}
