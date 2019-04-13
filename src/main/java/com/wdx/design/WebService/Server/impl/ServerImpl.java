package com.wdx.design.WebService.Server.impl;

import com.wdx.design.WebService.Server.IServer;

@javax.jws.WebService
public class ServerImpl implements IServer {

  public String SayHello(String name) {
    System.out.println("success!");
    return "hello, " + name;
  }
}
