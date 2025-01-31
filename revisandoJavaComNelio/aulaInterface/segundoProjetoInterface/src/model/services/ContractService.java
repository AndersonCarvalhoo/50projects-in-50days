package model.services;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

public class ContractService {

  private OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    Double installmentValue = contract.getTotalValue() / months;

    for (int i = 1; i <= months; i++) {
      Double installmentWithFee = installmentValue + onlinePaymentService.interest(installmentValue, i);
      installmentWithFee = installmentWithFee + onlinePaymentService.paymentFee(installmentWithFee);

      contract.addInstallments(new Installment(contract.getDate().plusMonths(i), installmentWithFee));
    }
  }
}
