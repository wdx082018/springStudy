package com.wdx.design.factory.func;

import com.wdx.design.factory.Benz;
import com.wdx.design.factory.Car;

public class BenzFactory implements Factory {

  public Car getCar() {
    return new Benz();
  }
}
