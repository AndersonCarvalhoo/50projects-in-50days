package entities;

public class OutsourcedEmployee extends Employee {
  Double additionalCharge = 0.0;

  public OutsourcedEmployee() {
    super();
  }

  public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
  }

  public Double additionalCharge(Double additionalValue) {
    return super.payment() + (additionalValue * 1.1);
  }

  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  @Override
  public Double payment() {
    return super.payment() + (this.additionalCharge * 1.1);
  }
}
