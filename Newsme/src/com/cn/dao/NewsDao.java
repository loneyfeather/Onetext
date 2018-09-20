package com.cn.dao;

import java.util.List;

import com.cn.model.News;

public interface NewsDao {
  public  int addNews(News news);//添加新闻
  public  List<News>    findNews(String key);//查询新闻
  public int deleteNews(String id);//删除新闻
  public int updateNews(News news);//修改新闻
}
