package com.hd123.wsw.api.service;

import com.hd123.wsw.api.entity.ApiUser;

public interface UserService {
  public String findUserById(Integer id);
  public void deleteUser(Integer id1,Integer id2);
  public String findUserAndOrder(Integer id,String sex);
  public void callProcedure();
  public String getUsers();
  public void saveUser(ApiUser apiUser);
}
