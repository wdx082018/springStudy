package com.wdx.design.prototype.Simple;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {

  private String name;

  private Integer age;

  public ArrayList<String> list = new ArrayList<String>();

  protected Object clone() throws CloneNotSupportedException {
    Student student = null;
    student = (Student)super.clone();
    student.list = (ArrayList)list.clone();
    return student;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
