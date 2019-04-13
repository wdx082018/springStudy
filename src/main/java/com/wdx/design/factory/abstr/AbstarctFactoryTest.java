package com.wdx.design.factory.abstr;

public class AbstarctFactoryTest {

  public static void main(String[] args) {
    DefaultFactory defaultFactory = new DefaultFactory();
    System.out.println(defaultFactory.getCar().getName());
  }

}
