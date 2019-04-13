package com.wdx.design.factory.simple;

import com.wdx.design.factory.Audi;
import com.wdx.design.factory.Benz;
import com.wdx.design.factory.Bmw;
import com.wdx.design.factory.Car;

public class SimpleFactory {

  public Car getCar(String name) {
    if ("BMW".equalsIgnoreCase(name)) {
      return new Bmw();
    } else if ("AUDI".equalsIgnoreCase(name)) {
      return new Audi();
    } else if ("BENZ".equalsIgnoreCase(name)) {
      return new Benz();
    } else {
      System.out.println("error!");
      return null;
    }
  }

}
