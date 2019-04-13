package com.wdx.design.WebService.Client;


import com.wdx.design.WebService.Server.impl.ServerImpl;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class ClientServer {

  public static void main(String[] args) {

    /*ServerImpl server = new ServerImpl();
    String result = server.SayHello("wdx");
    System.out.println("result is " + result);*/

    /*JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
    Client client = factory.createClient("http://localhost:8800/webServer/service?wsdl");
    Object[] inputs = {"www"};
    Object[] result = null;
    try {
      result = client.invoke("SayHello", inputs);
      System.out.println("result is " + result[0]);
    } catch (Exception e) {
      e.printStackTrace();
    }*/

    JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
    Client client = factory.createClient("http://172.18.1.17/default/webCommonService?wsdl");
    Object[] inputs = {"1", "1523547900000"};
    Object[] result = null;
    try {
      result = client.invoke("invoke", inputs);
      System.out.println("result is " + result[0]);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
