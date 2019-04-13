package com.wdx.design.ProxyModel.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibMeipo implements MethodInterceptor {


  public Object getInstance(Class clazz) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(this);

    return enhancer.create();
  }

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    methodProxy.invokeSuper(o, objects);
    return null;
  }
}
