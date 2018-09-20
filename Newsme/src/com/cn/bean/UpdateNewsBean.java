package com.cn.bean;

import com.cn.dao.NewsDao;
import com.cn.daoImp.NewsDaoImp;
import com.cn.model.News;

public class UpdateNewsBean {
	
	public int updateNews(News news) {
		NewsDao  updatedao=new NewsDaoImp();
		return updatedao.updateNews(news);
	}

}
