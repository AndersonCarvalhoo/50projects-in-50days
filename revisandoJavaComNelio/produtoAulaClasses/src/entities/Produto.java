package entities;

public class Produto {
  public String name;
  public Double price;
  public int quantity;

  public Double totalValueInStock() {
    return this.quantity * price;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    return this.name
        + ", R$"
        + String.format("%.2f", this.price)
        + ", "
        + this.quantity
        + " units, Total: R$"
        + String.format("%.2f", this.totalValueInStock());
  }

}
