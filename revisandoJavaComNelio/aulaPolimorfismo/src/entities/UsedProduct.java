package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
  private Date manufactureDate;

  public Date getManufactureDate() {
    return manufactureDate;
  }

  public UsedProduct(String name, Double price, Date manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  @Override
  public String priceTag() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return this.getName() + " (used) R$" + this.price + " (Manufacture Date: " + sdf.format(manufactureDate) + ")";
  }

}
