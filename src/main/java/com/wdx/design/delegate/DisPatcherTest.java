package com.wdx.design.delegate;

public class DisPatcherTest {

  public static void main(String[] args) {
    Dispatcher dispatcher = new Dispatcher(new ExectorA());
    dispatcher.doing();
  }

}
