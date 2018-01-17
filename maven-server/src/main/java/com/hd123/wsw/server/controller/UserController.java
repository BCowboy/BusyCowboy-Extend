package com.hd123.wsw.server.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hd123.wsw.api.entity.ApiUser;
import com.hd123.wsw.api.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource(name = "userServiceImpl")
  private UserService userService;

  @RequestMapping("/hello")
  @ResponseBody  
  public String hello(){  
      return "hello world!";  
  }  
  @ResponseBody
  @RequestMapping("/query/{id}")
  public String query(@PathVariable Integer id) throws Exception {
    return userService.findUserById(id);
  }
  @ResponseBody
  @RequestMapping("/query")
  public String queryById(@RequestParam Integer id) throws Exception {
    return userService.findUserById(id);
  }
  @ResponseBody
  @RequestMapping("/getUsers")
  public String getUsers() throws Exception {
    return userService.getUsers();
  }
  @ResponseBody
  @RequestMapping(value="/saveUsers",method=RequestMethod.POST)
  public void saveUsers(@RequestBody ApiUser apiUser) throws Exception {
    userService.saveUser(apiUser);
  }

}
