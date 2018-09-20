package com.cn.bean;

import com.cn.dao.NewsDao;
import com.cn.daoImp.NewsDaoImp;

public class DeleteNewsBean {
	public int deleteNews(String id) {
		NewsDao deletedao=new NewsDaoImp();
		return deletedao.deleteNews(id);
	}

}
