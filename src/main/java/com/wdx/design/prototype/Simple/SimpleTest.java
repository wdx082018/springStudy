package com.wdx.design.prototype.Simple;

public class SimpleTest {

  public static void main(String[] args) {
    Student student = new Student();
    student.setAge(18);
    student.setName("wdx");
    student.list.add("ha ha");

    try {
      Student newStudent = (Student)student.clone();
      System.out.println(newStudent.toString());
      System.out.println(student.list == newStudent.list);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }

}
