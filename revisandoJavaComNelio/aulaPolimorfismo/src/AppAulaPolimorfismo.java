import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class AppAulaPolimorfismo {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        Integer employeesQuantity = scan.nextInt();

        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < employeesQuantity; i++) {
            scan.nextLine();

            System.out.println("Employee #" + (i + 1) + " Data");
            System.out.print("Outsourced (y/n)? ");
            char outsourcedInput = scan.next().toLowerCase().charAt(0);

            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours: ");
            Integer hours = scan.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble();
            Employee employee;
            if (outsourcedInput == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = scan.nextDouble();
                employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                continue;
            }
            employee = new Employee(name, hours, valuePerHour);
            employees.add(employee);
        }

        System.out.println("PAYMENTS: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - " + employee.payment());
        }

        scan.close();

    }
}
