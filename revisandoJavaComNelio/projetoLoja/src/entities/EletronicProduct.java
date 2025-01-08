package entities;

public class EletronicProduct extends Product {
  private int guarantee;

  public EletronicProduct() {
    super();
  }

  public EletronicProduct(String name, Double price, int stock, int guarantee) {
    super(name, price, stock);
    this.guarantee = guarantee;
  }

  public int getGuarantee() {
    return guarantee;
  }

  public void setGuarantee(int guarantee) {
    this.guarantee = guarantee;
  }

  @Override
  public String toString() {
    return "Product [name=" + super.getName() + ", price=" + super.getPrice() + ", stock=" + super.getStock()
        + ", guarantee=" + this.getGuarantee() + "]";
  }

}
