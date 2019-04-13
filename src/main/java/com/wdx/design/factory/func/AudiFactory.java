package com.wdx.design.factory.func;

import com.wdx.design.factory.Audi;
import com.wdx.design.factory.Car;

public class AudiFactory implements Factory {

  public Car getCar() {
    return new Audi();
  }
}
