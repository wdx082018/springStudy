package com.wdx.design.factory.abstr;

import com.wdx.design.factory.Audi;
import com.wdx.design.factory.Car;
import com.wdx.design.factory.func.Factory;

public class AudiFactory implements Factory {

  public Car getCar() {
    return new Audi();
  }
}
