package com.wdx.design.ProxyModel.jdk.createProxy;

import com.wdx.design.ProxyModel.jdk.Person;
import java.lang.reflect.Method;

public class WdxMeipo implements WdxInvocationHandler {

  private Person person;

  //获取被代理人的信息
  public Object getInstance(Person person) throws Exception {
    this.person = person;
    Class clazz = person.getClass();
    System.out.println(clazz);
    return WdxProxy.newProxyInstance(new WdxClassLoader(), clazz.getInterfaces(), this);
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return null;
  }
}
