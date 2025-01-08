package entities;

public class Product {
  private String name;
  private Double price;
  private int stock;

  public String getName() {
    return name;
  }

  public Product() {

  }

  public Product(String name, Double price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void addStock(int quantity) {
    this.stock += quantity;
  }

  public void addStock() {
    this.stock++;
  }

  public void removeStock() {
    this.stock--;
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
  }

}
