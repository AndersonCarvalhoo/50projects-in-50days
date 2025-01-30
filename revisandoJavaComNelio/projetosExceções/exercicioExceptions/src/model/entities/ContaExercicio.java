package model.entities;

import model.exceptions.WithdrawException;

public class ContaExercicio {
  int number;
  String holder;
  Double balance = 0.0;
  Double withdrawLimit;

  public ContaExercicio(int number, String holder, Double balance, Double withdrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public Double getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }

  public void deposit(Double amount) {
    this.balance += amount;
  }

  public void withdraw(Double amount) throws WithdrawException {
    if (amount > balance) {
      throw new WithdrawException("You don't have enough balance");
    }
    if (amount > withdrawLimit) {
      throw new WithdrawException("Amount exceeding the withdrawal limit");
    }
    this.balance -= amount;
  }
}
