package entities;

import java.util.ArrayList;

public class Store {
  private String name;
  private String phone;

  private ArrayList<Product> products = new ArrayList<>();

  public Store() {
    this.generateTestData();
  }

  public Store(String name, String phone) {
    this.generateTestData();
    this.name = name;
    this.phone = phone;
  }

  private void generateTestData() {
    products.add(new Product("Maçã", 5.0, 25));
    products.add(new ClothingProduct("Calça Legging", 79.99, 5, "83988325171", "Algodão"));
    products.add(new EletronicProduct("Samsung S23", 2900.0, 2, 24));
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
