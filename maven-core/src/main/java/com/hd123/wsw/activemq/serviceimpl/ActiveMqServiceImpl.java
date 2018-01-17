package com.hd123.wsw.activemq.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hd123.wsw.activemq.ActiveMqService;
import com.hd123.wsw.activemq.producer.queue.QueueSender;
import com.hd123.wsw.activemq.producer.topic.TopicSender;

@Service("activeMqService")
public class ActiveMqServiceImpl implements ActiveMqService {

  @Autowired
  QueueSender queueSender;
  @Autowired
  TopicSender topicSender;

  @Override
  public String queueSender(String message) {
    String opt = "";
    try {
      queueSender.send("test.queue", message);
      opt = "suc";
    } catch (Exception e) {
      opt = e.getCause().toString();
    }
    return opt;
  }

  @Override
  public String topicSender(String message) {
    String opt = "";
    try {
      topicSender.send("test.topic", message);
      opt = "suc";
    } catch (Exception e) {
      opt = e.getCause().toString();
    }
    return opt;
  }

}
