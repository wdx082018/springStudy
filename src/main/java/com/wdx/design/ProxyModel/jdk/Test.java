package com.wdx.design.ProxyModel.jdk;

import com.wdx.design.ProxyModel.jdk.createProxy.WdxMeipo;

public class Test {

  public static void main(String[] args) {
    //new Wdw().findLove();
    try {
      /*Person person = (Person)new Meipo().getInstance(new Wdw());
      person.findLove();
      byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{person.getClass()});
      FileOutputStream fos = new FileOutputStream("F:/$Proxy0.class");
      fos.write(bytes);
      fos.close();*/


      Person person = (Person)new WdxMeipo().getInstance(new Wdw());
      System.out.println(person.getClass().getName());
      person.findLove();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
