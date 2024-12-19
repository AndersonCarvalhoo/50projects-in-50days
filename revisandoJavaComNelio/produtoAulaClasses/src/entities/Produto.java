package entities;

public class Produto {
  private String name;
  private Double price;
  private int quantity;

  public Produto(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Produto(String name, double price) {
    this.name = name;
    this.price = price;
    this.quantity = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

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
