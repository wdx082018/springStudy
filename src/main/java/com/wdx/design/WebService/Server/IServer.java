package com.wdx.design.WebService.Server;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface IServer {

  @WebMethod
  String SayHello(String name);

}
