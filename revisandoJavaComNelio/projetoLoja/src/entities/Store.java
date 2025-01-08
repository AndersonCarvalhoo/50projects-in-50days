package entities;

import java.util.ArrayList;

public class Store {
  private String name;
  private String phone;

  ArrayList<Product> products = new ArrayList<>();

  public Store(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void addProduct(Product product) {
    this.products.add(product);
  }

}
