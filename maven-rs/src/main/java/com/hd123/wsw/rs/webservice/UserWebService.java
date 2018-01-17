package com.hd123.wsw.rs.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hd123.wsw.api.entity.ApiUser;

@Path(value = "/user")
@Produces(MediaType.APPLICATION_JSON+";charset=utf-8" )
@Consumes(MediaType.APPLICATION_JSON+";charset=utf-8" )
public interface UserWebService {
  /**
   * 根据id查询用户
   * @param id
   * @return
   * @throws Exception
   */
  @GET
  @Path(value = "/queryUser")
  public String query(@QueryParam("id")
  Integer id) throws Exception;
  /**
   * 删除用户
   * @param id1
   * @param id2
   * @throws Exception
   */
  @GET
  @Path(value = "/delete/{id1}+{id2}")
  public void delete(@PathParam("id1")
  Integer id1, @PathParam("id2")
  Integer id2) throws Exception;
  /**
   * 根据id和性别联合查询用户
   * @param id
   * @param sex
   * @return
   * @throws Exception
   */
  @GET
  @Path(value = "/queryUnion/{id}+{sex}")
  public String queryunion(@PathParam("id")
  Integer id, @PathParam("sex")
  String sex) throws Exception;
  /**
   * 调用存储过程
   * @throws Exception
   */
  @GET
  @Path(value = "/callProcedure")
  public void callProcedure() throws Exception;
  /**
   * 获取所有用户
   * @return
   * @throws Exception
   */
  @GET
  @Path(value = "/getUsers")
  public String getusers() throws Exception;
  /**
   * 增加用户
   * @return    
   * @throws Exception
   */
  @POST
  @Path(value = "/saveUser")
  public void saveUsers(ApiUser apiUser) throws Exception;
}
