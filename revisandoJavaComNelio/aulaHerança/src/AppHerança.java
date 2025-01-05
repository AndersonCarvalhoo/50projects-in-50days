import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AppHerança {
    public static void main(String[] args) throws Exception {

        // BusinessAccount bAcc = new BusinessAccount(1002, "Kezia", 0.0, 500.0);

        // UPCASTING
        // Account acc1 = bAcc;
        // Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING
        // BusinessAccount acc4 = (BusinessAccount) acc2;

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
        Account teste2 = new SavingsAccount(100, "teste", 1000., 500.);
        teste2.withdraw(200.0);
        Account teste = new BusinessAccount(203, "and", 1000.0, 500.0);
        teste.withdraw(200.0);
        System.out.println(teste2.getBalance());
        System.out.println(teste.getBalance());

    }
}
