import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class AppExercicioPolimorfismo {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of products: ");
    int n = scan.nextInt();

    ArrayList<Product> products = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.println("Product #" + (i + 1) + " data: ");
      System.out.print("Common, used or imported (c/u/i)? ");
      char commonOrUsedOrImported = scan.next().toLowerCase().charAt(0);
      scan.nextLine();
      System.out.print("Name: ");
      String name = scan.nextLine();
      System.out.print("Price: ");
      Double price = scan.nextDouble();

      Product product;
      if (commonOrUsedOrImported == 'i') {
        System.out.print("Customs fee: ");
        Double customsFee = scan.nextDouble();
        product = new ImportedProduct(name, price, customsFee);
      } else if (commonOrUsedOrImported == 'u') {
        System.out.print("Manufacture date (DD/MM/YYYY): ");
        Date manufactureDate = sdf.parse(scan.next());
        product = new UsedProduct(name, price, manufactureDate);
      } else {
        product = new Product(name, price);
      }
      products.add(product);
    }
    for (Product product : products) {
      System.out.println(product.priceTag());
    }

  }
}
