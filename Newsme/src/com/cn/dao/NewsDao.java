package com.cn.dao;

import java.util.List;

import com.cn.model.News;

public interface NewsDao {
  public  int addNews(News news);//�������
  public  List<News>    findNews(String key);//��ѯ����
  public int deleteNews(String id);//ɾ������
  public int updateNews(News news);//�޸�����
}
