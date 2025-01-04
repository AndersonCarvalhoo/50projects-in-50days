import java.util.ArrayList;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramClasseAbstrata {
  public static void main(String[] args) {

    ArrayList<Account> list = new ArrayList<>();
    list.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
    list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
    list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

    Double sum = 0.0;
    for (Account account : list) {
      sum += account.getBalance();
      account.deposit(10.0);
      System.out.println(account.getBalance());
    }
    System.out.println("Soma total dos saldos das contas: " + sum);

  }
}
