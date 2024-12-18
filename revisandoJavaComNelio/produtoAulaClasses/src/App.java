import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data");

        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Price: ");
        Double price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();
        Produto product = new Produto(name, price, quantity);

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
