package entities;

import entities.enums.Color;

public class Rectangule extends Shape {
  private Double width;
  private Double height;

  public Rectangule() {
    super();
  }

  public Rectangule(Color color, Double width, Double height) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public Double area() {
    return width * height;
  }
}
