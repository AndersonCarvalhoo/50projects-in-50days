package entities;

public class BusinessAccount extends Account {
  private Double loanLimit;

  public BusinessAccount() {
    super();
  }

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public void loan(Double amount) {
    if (amount <= loanLimit) {
      this.balance += amount;
    }
  }

  @Override
  public void withdraw(Double amount) {
    super.withdraw(amount);
    super.balance -= 2.0;
  }
}
