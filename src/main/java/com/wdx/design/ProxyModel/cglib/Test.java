package com.wdx.design.ProxyModel.cglib;

public class Test {

  public static void main(String[] args) {
    Xiaoming xiaoming = (Xiaoming)new CglibMeipo().getInstance(Xiaoming.class);
    xiaoming.findLove();
  }

}
