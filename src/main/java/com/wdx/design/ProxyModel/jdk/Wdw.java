package com.wdx.design.ProxyModel.jdk;

public class Wdw implements Person {

  private String name = "wang da wei";

  private String sex = "male";

  public void findLove() {
    System.out.println("我叫" + this.name + ",我的性别是" + this.sex +
        ",我的择偶条件是：");
    System.out.println("白富美");
    System.out.println("大波浪");
    System.out.println("母的");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
