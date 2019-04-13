package com.wdx.design.factory.abstr;

import com.wdx.design.factory.Car;

public class DefaultFactory extends AbstractFactory {

  private AudiFactory audiFactory = new AudiFactory();

  protected Car getCar() {
    return audiFactory.getCar();
  }
}
