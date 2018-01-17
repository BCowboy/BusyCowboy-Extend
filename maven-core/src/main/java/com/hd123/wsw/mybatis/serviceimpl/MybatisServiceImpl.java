package com.hd123.wsw.mybatis.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.core.entity.User;
import com.hd123.wsw.core.utils.JSONUtil;
import com.hd123.wsw.mybatis.MybatisService;
import com.hd123.wsw.mybatis.mapper.UserMapper;
@Service
public class MybatisServiceImpl implements MybatisService {
  @Autowired
  private UserMapper mybatisDao;
  
  @Override
  public String query(Integer id) throws Exception {
    System.out.println("进入接口实现类……");
    User user = mybatisDao.queryById(id);
   //将查询出来的对象装换为json格式的字符串
    String json = JSONUtil.objectToJson(user); 
    return json;
  }

  @Override
  public String queryById(Integer id) throws Exception {
    System.out.println("进入接口实现类……");
    User user = mybatisDao.queryById(id);
   //将查询出来的对象装换为json格式的字符串
    String json = JSONUtil.objectToJson(user); 
    return json;
  }

  @Override
  public String getUsers() throws Exception {
    List<User> userList = mybatisDao.getUsers();
    String json = JSONUtil.listToJson(userList);
    return json;
  }

  @Override
  public void saveUsers(ApiUser apiUser) throws Exception {

  }

}
