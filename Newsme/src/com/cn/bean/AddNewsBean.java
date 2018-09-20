package com.cn.bean;

import com.cn.dao.NewsDao;
import com.cn.daoImp.NewsDaoImp;
import com.cn.model.News;

public class AddNewsBean {
	
	public int addNews(News news) {
		NewsDao  newsdao=new NewsDaoImp();
		return newsdao.addNews(news);
	}

}
