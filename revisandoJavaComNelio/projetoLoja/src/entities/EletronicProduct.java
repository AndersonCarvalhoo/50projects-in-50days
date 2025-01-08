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

}
