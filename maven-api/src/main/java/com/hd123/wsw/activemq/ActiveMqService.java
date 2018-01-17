package com.hd123.wsw.activemq;

public interface ActiveMqService {

  /**
   * 发送消息到队列 Queue队列：仅有一个订阅者会收到消息，消息一旦被处理就不会存在队列中
   * 
   * @param message
   * @return String
   */
  public String queueSender(String message);

  /**
   * 发送消息到主题 Topic主题 ：放入一个消息，所有订阅者都会收到 这个是主题目的地是一对多的
   * 
   * @param message
   * @return String
   */

  public String topicSender(String message);
}
