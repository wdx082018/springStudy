package com.wdx.design.factory.simple;

import com.wdx.design.factory.Car;

public class SimpleFactoryTest {

  public static void main(String[] args) {
    Car car = new SimpleFactory().getCar("BENZ");
    System.out.println(car.getName());
  }

}
