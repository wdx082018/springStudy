package com.wdx.design.ProxyModel.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒婆
 */
public class Meipo implements InvocationHandler {

  private Person person;

  //获取被代理人的信息
  public Object getInstance(Person person) throws Exception {
    this.person = person;
    Class clazz = person.getClass();
    return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("我是媒婆，你的性别是" + this.person.getSex() + "，得给你找个母牛");
    this.person.findLove();
    return null;
  }
}
