package entities;

public class Company extends TaxPayer {
  private int numberOfEmployees;

  public Company() {
    super();
  }

  public Company(String name, Double anualIncome, int numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public Double tax() {
    Double totalTax = this.numberOfEmployees > 10 ? super.anualIncome * 14 / 100 : super.anualIncome * 16 / 100;
    return totalTax;
  }

  @Override
  public String toString() {
    return super.getName() + " R$" + this.tax();
  }

}
