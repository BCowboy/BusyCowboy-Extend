package com.hd123.wsw.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.redis.RedisService;

@Controller
@RequestMapping("/redis")
public class RedisController {
  @Autowired
  private RedisService redisService;

  @ResponseBody
  @RequestMapping("setKey")
  public String setKey(@RequestParam
  String key, @RequestParam
  String value) {
    return redisService.setKey(key, value);
  }

  @ResponseBody
  @RequestMapping("getKey")
  public String getKey(@RequestParam
  String key) {
    return redisService.getKey(key);
  }

  @ResponseBody
  @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
  public void saveUser(@RequestBody
  ApiUser user) {
    redisService.saveUser(user);
  }

  @ResponseBody
  @RequestMapping("getUser")
  public ApiUser getUser(@RequestParam
  Integer id) {

    return redisService.getUser(id);
  }

}
