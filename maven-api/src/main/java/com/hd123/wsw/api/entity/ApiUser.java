package com.hd123.wsw.api.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

//@XmlRootElement
public class ApiUser {
  private Integer id;
  private String username;
  private String sex;
  private String email;
  private Date birthday;
  private float salary;
  private BigDecimal account;
  private List<ApiUserOrder> orderList;

 // @XmlElement(required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  //@XmlElement(required = true)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  //@XmlElement(required = true)
  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
  //@XmlElement(required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  //@XmlElement(required = true)
  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
 // @XmlElement(required = true)
  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }
 // @XmlElement(required = true)
  public BigDecimal getAccount() {
    return account;
  }

  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  @XmlElement(required = false)
  public List<ApiUserOrder> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<ApiUserOrder> orderList) {
    this.orderList = orderList;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", email=" + email
        + ", birthday=" + birthday + ", salary=" + salary + ", account=" + account + ", orderList="
        + orderList + "]";
  }

}
