package com.hd123.wsw.mybatis;

import com.hd123.wsw.api.entity.ApiUser;

public interface MybatisService {
  public String query(Integer id) throws Exception;
  public String queryById(Integer id) throws Exception;
  public String getUsers() throws Exception;
  public void saveUsers(ApiUser apiUser) throws Exception;
}
