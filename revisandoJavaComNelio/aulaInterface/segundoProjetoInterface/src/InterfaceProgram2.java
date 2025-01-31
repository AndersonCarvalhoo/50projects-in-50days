import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class InterfaceProgram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Account Number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Contract Date: ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Total value of contract: ");
        Double totalValue = sc.nextDouble();
        Contract contract = new Contract(number, contractDate, totalValue);

        System.out.println("How many months of contract?");
        int months = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println(contract.showInstallments());
        sc.close();
    }
}
