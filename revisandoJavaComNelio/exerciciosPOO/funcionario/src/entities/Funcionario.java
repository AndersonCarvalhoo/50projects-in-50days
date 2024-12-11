package entities;

public class Funcionario {
  public String name;
  public Double grossSalary;
  public Double tax;

  public Double NetSalary() {
    return this.grossSalary - this.tax;
  }

  public void IncreaseSalary(Double percentage) {
    this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100));
  }

  public String toString() {
    return this.name + String.format(" R$%.2f", this.NetSalary());
  }
}
