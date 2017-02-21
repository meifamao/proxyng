/*    */ package com.rtmp.controller;
/*    */ 
/*    */ import com.rtmp.service.LoginService;
/*    */ import java.util.jar.JarException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.ws.rs.DefaultValue;
/*    */ import javax.ws.rs.GET;
/*    */ import javax.ws.rs.Path;
/*    */ import javax.ws.rs.Produces;
/*    */ import javax.ws.rs.QueryParam;
/*    */ import javax.ws.rs.core.Context;
/*    */ import javax.ws.rs.core.Response;
/*    */ import javax.ws.rs.core.Response.ResponseBuilder;
/*    */ import javax.ws.rs.core.Response.Status;
/*    */ import org.apache.commons.httpclient.HttpException;
/*    */ import org.apache.commons.lang.StringUtils;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ 
/*    */ @Controller
/*    */ @Path("/login")
/*    */ public class LoginController
/*    */ {
/*    */ 
/*    */   @Autowired
/*    */   private LoginService loginService;
/*    */ 
/*    */   @GET
/*    */   @Path("/isExist")
/*    */   @Produces({"application/json"})
/*    */   public Response isExistPhone(@Context HttpServletRequest request, @DefaultValue("abc") @QueryParam("name") String name, @DefaultValue("abc") @QueryParam("password") String password)
/*    */     throws Exception
/*    */   {
/* 42 */     if ((!StringUtils.isEmpty(name)) && (!StringUtils.isEmpty(password))) {
/* 43 */       if ((name.equalsIgnoreCase("abc")) && (password.equalsIgnoreCase("abc"))) {
/* 44 */         return Response.status(Response.Status.OK).build();
/*    */       }
/* 46 */       if ((name.equalsIgnoreCase("cba")) && (password.equalsIgnoreCase("cba"))) {
/* 47 */         return Response.status(Response.Status.OK).build();
/*    */       }
/*    */ 
/* 50 */       throw new JarException(name + " " + " " + password);
/*    */     }
/*    */ 
/* 54 */     throw new HttpException("l4:  empty !");
/*    */   }
/*    */ }

/* Location:           C:\Users\meifamao\Desktop\nginx-rtmp\WEB-INF\classes\
 * Qualified Name:     com.rtmp.controller.LoginController
 * JD-Core Version:    0.6.2
 */