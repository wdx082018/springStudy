package com.wdx.design.prototype.greatestsage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class TheGreatestSage extends Monkey implements Cloneable, Serializable {

  private GoldRingedStaff goldRingedStaff;

  public TheGreatestSage() {
    this.goldRingedStaff = new GoldRingedStaff();
    this.setHeight(150);
    this.setWidth(30);
    this.setBirthday(new Date());
  }

  public Object clone() {
    ByteArrayOutputStream byteArrayOutputStream = null;
    ObjectOutputStream objectOutputStream = null;
    ByteArrayInputStream byteArrayInputStream = null;
    ObjectInputStream objectInputStream = null;

    try {
      byteArrayOutputStream = new ByteArrayOutputStream();
      objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
      objectOutputStream.writeObject(this);

      byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
      objectInputStream = new ObjectInputStream(byteArrayInputStream);
      TheGreatestSage copy = (TheGreatestSage) objectInputStream.readObject();
      copy.setBirthday(new Date());
      return copy;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        byteArrayOutputStream.close();
        objectOutputStream.close();
        byteArrayInputStream.close();
        objectInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void change() throws CloneNotSupportedException {
    TheGreatestSage theGreatestSage = (TheGreatestSage) clone();
    //TheGreatestSage theGreatestSage = (TheGreatestSage) super.clone();
    System.out.println(this.getBirthday().getTime() + "----" + theGreatestSage.getBirthday().getTime());
    System.out.println(this == theGreatestSage);
    System.out.println(this.goldRingedStaff == theGreatestSage.goldRingedStaff);
  }

  public GoldRingedStaff getGoldRingedStaff() {
    return goldRingedStaff;
  }

  public void setGoldRingedStaff(GoldRingedStaff goldRingedStaff) {
    this.goldRingedStaff = goldRingedStaff;
  }
}
