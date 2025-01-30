
import java.util.Scanner;

import model.entities.ContaExercicio;
import model.exceptions.WithdrawException;

public class ProgramExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        try {
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();

            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double withdrawLimit = sc.nextDouble();

            ContaExercicio account = new ContaExercicio(number, holder, balance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");

            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println("New balance: " + account.getBalance());
        } catch (WithdrawException e) {
            System.out.println("Withdraw Error: " + e.getMessage());
        }

        sc.close();
    }
}
