import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Produto product = new Produto();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data");

        System.out.print("Name: ");
        product.name = scan.next();
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scan.nextInt();

        System.out.println("\nProduct data: " + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantityAdd = scan.nextInt();
        product.addProducts(quantityAdd);
        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be remove in stock: ");
        int quantityRemove = scan.nextInt();
        product.removeProducts(quantityRemove);
        System.out.println("\nUpdated data: " + product);

        scan.close();
    }
}
