package com.wdx.design.prototype.greatestsage;

import java.io.Serializable;

public class GoldRingedStaff implements Serializable {

  private float height = 100;

  private float width = 10;

  public void grow() {
    this.height *= 2;
    this.width *= 2;
  }

  public void shrink() {
    this.height /= 2;
    this.width /= 2;
  }

}
