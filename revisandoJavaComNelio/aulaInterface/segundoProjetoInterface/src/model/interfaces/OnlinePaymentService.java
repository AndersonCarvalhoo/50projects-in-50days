package model.interfaces;

public interface OnlinePaymentService {
  public Double paymentFee(double amount);

  public Double interest(double amount, int month);
}
