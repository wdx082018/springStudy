package com.wdx.design.singleton;

public class Singleton4 {

  private Singleton4() {

  }

  private static class LazyHolder {
    private static final Singleton4 singleton4 = new Singleton4();
  }

  public static final Singleton4 getInstance() {
    return LazyHolder.singleton4;
  }

}
