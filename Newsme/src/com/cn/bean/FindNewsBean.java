package com.cn.bean;

import java.util.List;

import com.cn.dao.NewsDao;
import com.cn.daoImp.NewsDaoImp;
import com.cn.model.News;

public class FindNewsBean {

	public List<News>FindNews(String key) {
		NewsDao newsdao=new NewsDaoImp();
		return newsdao.findNews(key);
		
	}

}
