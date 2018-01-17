package com.hd123.wsw.rs.proxy;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.api.service.UserService;
import com.hd123.wsw.rs.webservice.UserWebService;

public class UserServiceProxy implements UserService{
  private UserWebService userWebService;
  
  public UserWebService getUserWebService() {
    return userWebService;
  }

  public void setUserWebService(UserWebService userWebService) {
    this.userWebService = userWebService;
  }

  @Override
  public String findUserById(Integer id) {
    // TODO Auto-generated method stub
    System.out.println("进入代理类……");
    String str = null;
    try {
       str=userWebService.query(id);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return str;
  }

  @Override
  public void deleteUser(Integer id1, Integer id2) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String findUserAndOrder(Integer id, String sex) {
    // TODO Auto-generated method stub
    String str = null;
    try {
      str = userWebService.queryunion(id, sex);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return str;
  }

  @Override
  public void callProcedure() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getUsers() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void saveUser(ApiUser apiUser) {
    // TODO Auto-generated method stub
    try {
      userWebService.saveUsers(apiUser);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
