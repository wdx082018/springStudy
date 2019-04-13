package com.wdx.design.factory.abstr;

import com.wdx.design.factory.Bmw;
import com.wdx.design.factory.Car;
import com.wdx.design.factory.func.Factory;

public class BmwFactory implements Factory {

  public Car getCar() {
    return new Bmw();
  }
}
