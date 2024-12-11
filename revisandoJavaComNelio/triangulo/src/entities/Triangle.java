package entities;

public class Triangle {
  public Double a;
  public Double b;
  public Double c;

  public Double calcularArea() {
    Double p = (this.a + this.b + this.c) / 2;
    Double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));

    return area;
  }
}
