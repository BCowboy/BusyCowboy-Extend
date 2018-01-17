package com.hd123.wsw.server.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hd123.wsw.activemq.ActiveMqService;

/**
 * 
 * @author wushanwen
 * @description controller测试
 */
@Controller
@RequestMapping("/activemq")
public class ActivemqController {

  @Resource
  ActiveMqService activeMqService;

  /**
   * 发送消息到队列 Queue队列：仅有一个订阅者会收到消息，消息一旦被处理就不会存在队列中
   * 
   * @param message
   * @return String
   */
  @ResponseBody
  @RequestMapping("queueSender")
  public String queueSender(@RequestParam("message")
  String message) {
    return activeMqService.queueSender(message);
  }

  /**
   * 发送消息到主题 Topic主题 ：放入一个消息，所有订阅者都会收到 这个是主题目的地是一对多的
   * 
   * @param message
   * @return String
   */
  @ResponseBody
  @RequestMapping("topicSender")
  public String topicSender(@RequestParam("message")
  String message) {
    return activeMqService.topicSender(message);
  }

}
