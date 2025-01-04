import java.util.ArrayList;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class AppExercicioFixacao {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number of tax payers: ");
    Integer quantityPayers = scan.nextInt();

    ArrayList<TaxPayer> list = new ArrayList<>();
    for (int i = 0; i < quantityPayers; i++) {
      System.out.println("Tax payer #" + (i + 1) + " data: ");
      System.out.print("Individual or Company (i/c)? ");
      char individualOrCompany = scan.next().toLowerCase().charAt(0);
      scan.nextLine();
      System.out.print("Name: ");
      String name = scan.nextLine();
      System.out.print("Anual income: ");
      Double anualIncome = scan.nextDouble();

      if (individualOrCompany == 'i') {
        System.out.print("Health Expenditures: ");
        Double healthExpenditures = scan.nextDouble();
        list.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.print("Number of Employees: ");
        Integer numberOfEmployees = scan.nextInt();
        list.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    System.out.println();
    System.out.println("TAXES PAID: ");

    Double sumTax = 0.0;
    for (TaxPayer payer : list) {
      sumTax += payer.tax();
      System.out.println(payer);
    }

    System.out.println();
    System.out.println("TOTAL TAXES: R$" + sumTax);
    scan.close();
  }
}
