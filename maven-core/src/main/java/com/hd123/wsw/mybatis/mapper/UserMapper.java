package com.hd123.wsw.mybatis.mapper;

import java.util.List;

import com.hd123.wsw.core.entity.User;

public interface UserMapper {

  public User queryById(Integer id) throws Exception;

  public List<User> getUsers() throws Exception;

  public void saveUsers(User user) throws Exception;
}
