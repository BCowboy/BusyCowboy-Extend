package com.hd123.wsw.rs.webTest;


import java.math.BigDecimal;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.api.service.UserService;

public class UserWebServiceProxyTest {
 /* private UserService userService;
  private  ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:rs-proxy.xml");

  @Before
  public void init() {
    userService = appCtx.getBean("userServiceProxy", UserService.class);
  }
  @Test
  public void queryTest() throws Exception{
    String str = userService.findUserById(810);
    System.out.println(str);
  }
  @Test
  public void saveTest() throws Exception{
  ApiUser apiUser = new ApiUser();
    apiUser.setAccount(new BigDecimal(5));
    Date sqlDate = new Date(new java.util.Date().getTime());
    apiUser.setBirthday(sqlDate);
    apiUser.setEmail("5");
    apiUser.setSalary(55);
    apiUser.setSex("5");
    apiUser.setUsername("5");
    userService.saveUser(apiUser);
  }
  @Test
  public void queryUnionTest() throws Exception{
    String str = userService.findUserAndOrder(810, "8");
    System.out.println(str);
  }*/
}
