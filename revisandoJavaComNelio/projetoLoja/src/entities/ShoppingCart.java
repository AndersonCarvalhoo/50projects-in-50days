package entities;

import java.util.ArrayList;

public class ShoppingCart {

  private ArrayList<Product> products = new ArrayList<>();

  public void addProductToCart(Product product, int quantity) {
    if (quantity > product.getStock()) {
      System.out.println("No momento temos apenas " + product.getStock() + " no estoque");
    } else {
      products.add(product);
      product.removeStock();
    }
  }

  public void showShoppingCart() {
    Double totalValue = 0.0;
    if (products.size() == 0) {
      System.out.println("O carrinho está vazio: ");
    }
    System.out.println("Produtos no carrinho: ");
    for (Product product : products) {
      System.out.println(product);
      totalValue += product.getPrice();
    }
    System.out.println("Total: " + totalValue);
  }

  public void finishPurchase() {
    System.out.println("Compra finaliada com sucesso!");
    products.clear();
  }
}
