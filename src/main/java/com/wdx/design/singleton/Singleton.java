package com.wdx.design.singleton;

public class Singleton {

  private Singleton(){

  }

  public static Singleton singleton = new Singleton();

  private Singleton getInstance() {
    return singleton;
  }

}
