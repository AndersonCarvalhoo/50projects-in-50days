package model.services;

import model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

  @Override
  public Double paymentFee(double amount) {
    return amount * 0.02;
  }

  @Override
  public Double interest(double amount, int month) {
    return amount * month / 100;
  }

}
