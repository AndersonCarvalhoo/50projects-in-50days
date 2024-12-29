import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramWorker {
  public static void main(String[] args) throws ParseException {
    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter Departament's Name: ");
    String departamentName = scan.nextLine();
    Departament departament = new Departament(departamentName);

    System.out.println("Enter Worker Data: ");
    System.out.print("Name: ");
    String workerName = scan.nextLine();
    System.out.print("Level: ");
    String level = scan.nextLine();
    System.out.print("Base salary: ");
    Double baseSalary = scan.nextDouble();
    System.out.print("How many contracts to this worker? ");
    int contractIterator = scan.nextInt();

    scan.nextLine();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(level.toUpperCase()), baseSalary, departament);
    for (int i = 0; i < contractIterator; i++) {
      System.out.println("Enter contract #" + (i + 1) + " data: ");
      System.out.print("Date (DD/MM/YYYY): ");
      Date dateContract = sdf.parse(scan.next());
      scan.nextLine();
      System.out.print("Value per hour: ");
      Double valuePerHour = scan.nextDouble();
      System.out.print("Duration (hours): ");
      Integer hours = scan.nextInt();

      HourContract contract = new HourContract(dateContract, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println("Enter month and year to calculate income (MM/YYYY): ");
    String dateIncome = scan.next();
    int monthIncome = Integer.parseInt(dateIncome.substring(0, 2));
    int yearIncome = Integer.parseInt(dateIncome.substring(3));

    scan.close();

    System.out.println("Name: " + worker.getName());
    System.out.println("Departament: " + worker.getDepartament().getName());
    System.out.println("Income for " + dateIncome + ": " + worker.income(yearIncome, monthIncome));
  }
}
