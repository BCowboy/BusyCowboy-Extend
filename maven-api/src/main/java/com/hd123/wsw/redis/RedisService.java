package com.hd123.wsw.redis;

import com.hd123.wsw.api.entity.ApiUser;

public interface RedisService {
  public String setKey(String key, String value);

  public String getKey(String key);

  public void saveUser(ApiUser user);

  public ApiUser getUser(Integer id);
}
