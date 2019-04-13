package com.wdx.design.WebService.Server;

import com.wdx.design.WebService.Server.impl.ServerImpl;
import javax.xml.ws.Endpoint;

public class ServerPublish {

  public static void main(String[] args) {
    String address = "http://localhost:8880/webServer/service";
    Endpoint.publish(address, new ServerImpl());
    System.out.println("publish success");
  }

}
