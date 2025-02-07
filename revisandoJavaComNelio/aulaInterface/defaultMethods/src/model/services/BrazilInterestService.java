package model.services;

import model.interfaces.InterestService;

public class BrazilInterestService implements InterestService {

  private double interestRate;

  public BrazilInterestService(double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public double getInterestRate() {
    return interestRate;
  }
}