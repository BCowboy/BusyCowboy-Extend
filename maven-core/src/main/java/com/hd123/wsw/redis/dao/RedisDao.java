package com.hd123.wsw.redis.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import com.hd123.wsw.core.entity.User;

@Repository
public class RedisDao {
  @Autowired
  RedisTemplate redisTemplate;
  @Resource(name = "redisTemplate")
  ValueOperations<Object, Object> valOps;

  public String setKeyAndValue(String key, String value) {
    valOps.set(key, value);
    return "Set Ok";
  }

  public String getKey(String key) {
    return valOps.get(key).toString();
  }

  public void save(User user) {
    System.out.println(valOps.getClass());
    valOps.set(user.getId(), user);
  }

  public User getUser(Integer id) {
    return (User) valOps.get(id);
  }
}
