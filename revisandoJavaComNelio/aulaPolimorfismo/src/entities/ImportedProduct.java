package entities;

public class ImportedProduct extends Product {
  private Double customsFee;

  public ImportedProduct(String name, Double price, Double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
  }

  public Double getCustomsFee() {
    return customsFee;
  }

  public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
  }

  @Override
  public String priceTag() {
    return this.getName() + " R$" + this.getPrice() + " (Customs fee: R$ " + this.customsFee + ")";
  }

  public Double totalPrice() {
    return super.price + this.customsFee;
  }

  @Override
  public String toString() {
    return "ImportedProduct [customsFee=" + customsFee + ", price=" + price + ", getName()=" + getName() + "]";
  }
}
