package entities;

public class Individual extends TaxPayer {
  private Double healthExpenditures;

  public Individual() {

  }

  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    Double taxInSalary = super.anualIncome < 20000.0 ? super.anualIncome * 15 / 100 : super.anualIncome * 25 / 100;
    Double deductedHealthTax = this.healthExpenditures > 0 ? this.healthExpenditures * 50 / 100 : 0;
    return taxInSalary - deductedHealthTax;
  }

  @Override
  public String toString() {
    return super.getName() + " R$" + this.tax();
  }
}
