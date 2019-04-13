package com.wdx.design.factory.abstr;

import com.wdx.design.factory.Benz;
import com.wdx.design.factory.Car;
import com.wdx.design.factory.func.Factory;

public class BenzFactory implements Factory {

  public Car getCar() {
    return new Benz();
  }
}
