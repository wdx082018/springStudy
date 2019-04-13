package com.wdx.design.factory.func;

import com.wdx.design.factory.Bmw;
import com.wdx.design.factory.Car;

public class BmwFactory implements Factory {

  public Car getCar() {
    return new Bmw();
  }
}
