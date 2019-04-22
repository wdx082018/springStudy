package com.wdx.design.delegate;

public class Dispatcher implements IExector {

  IExector iExector;

  public Dispatcher(IExector iExector) {
    this.iExector = iExector;
  }

  public void doing() {
    this.iExector.doing();
  }
}
