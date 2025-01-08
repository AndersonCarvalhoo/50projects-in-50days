package entities;

public class ClothingProduct extends Product {
  private String size;
  private String material;

  public ClothingProduct(String name, Double price, int stock, String size, String material) {
    super(name, price, stock);
    this.size = size;
    this.material = material;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

}
