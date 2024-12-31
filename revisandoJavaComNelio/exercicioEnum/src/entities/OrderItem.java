package entities;

public class OrderItem {
  private Integer quantity;
  private Double price = 0.0;

  Product product;

  public OrderItem(Integer quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Double subTotal() {
    Double subTotal = this.product.getPrice() * this.quantity;
    this.price = subTotal;
    return subTotal;
  }
}
