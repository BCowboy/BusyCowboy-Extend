/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2014，所有权利保留。
 * 
 * 项目名：	h4rest-rs
 * 文件名：	RSJsonObjectMapper.java
 * 模块说明：	
 * 修改历史：
 * 2014-12-9 - qinliming - 创建。
 */
package com.hd123.wsw.rs.utils;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 提供基于REST的个性化配置对象处理。
 * 
 * @author qinliming
 * 
 */
public class RSJsonObjectMapper extends ObjectMapper {

  public RSJsonObjectMapper() {
    super();
    this.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

}
