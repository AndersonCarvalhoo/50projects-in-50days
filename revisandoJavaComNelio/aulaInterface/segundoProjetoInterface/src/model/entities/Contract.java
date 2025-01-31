package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
  private int number;
  private LocalDate date;
  private Double totalValue = 0.0;

  private ArrayList<Installment> installments = new ArrayList<>();

  public Contract(int number, LocalDate date, Double totalValue) {
    this.number = number;
    this.date = date;
    this.totalValue = totalValue;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public ArrayList<Installment> getInstallments() {
    return installments;
  }

  public void addInstallments(Installment installment) {
    this.installments.add(installment);
  }

  public LocalDate getDate() {
    return date;
  }

  public Double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Double totalValue) {
    this.totalValue = totalValue;
  }

  public String showInstallments() {
    String installmentsString = "";
    for (Installment installment : installments) {
      installmentsString += installment.toString() + "\n";
    }
    return installmentsString;
  }

}
