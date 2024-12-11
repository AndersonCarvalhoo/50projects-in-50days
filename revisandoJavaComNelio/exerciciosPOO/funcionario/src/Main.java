import java.util.Scanner;

import entities.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = scan.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = scan.nextDouble();

        System.out.println("\nEmployee: " + funcionario);

        System.out.print("\nWich percentage to increase salary? ");
        funcionario.IncreaseSalary(scan.nextDouble());

        System.out.println("\nUpdated Data: " + funcionario);

        scan.close();
    }
}
