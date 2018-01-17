package com.hd123.wsw.redis.serviceimpl;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.core.entity.User;
import com.hd123.wsw.redis.RedisService;
import com.hd123.wsw.redis.dao.RedisDao;

@Service
public class RedisServiceImpl implements RedisService {
  @Resource(name = "redisDao")
  private RedisDao redisDao;

  @Override
  public String setKey(String key, String value) {
    // TODO Auto-generated method stub
    return redisDao.setKeyAndValue(key, value);
  }

  @Override
  public String getKey(String key) {
    // TODO Auto-generated method stub
    return redisDao.getKey(key);
  }

  @Override
  public void saveUser(ApiUser user) {
    // TODO Auto-generated method stub
    User daoUser = new User();
    BeanUtils.copyProperties(user, daoUser);
    redisDao.save(daoUser);
  }

  @Override
  public ApiUser getUser(Integer id) {
    // TODO Auto-generated method stub
    User user = redisDao.getUser(id);
    ApiUser apiUser = new ApiUser();
    BeanUtils.copyProperties(user, apiUser);
    return apiUser;
  }

}
