package com.wdx.design.ProxyModel.jdk.createProxy;

import java.lang.reflect.Method;

public interface WdxInvocationHandler {

  public Object invoke(Object proxy, Method method, Object[] args)
      throws Throwable;
}
