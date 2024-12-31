
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class AppOrder {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sfc = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sfc.parse(scan.next());
        System.out.println("Enter order status data: ");
        System.out.print("Status: ");
        String status = scan.next();
        System.out.print("How many items to this order? ");
        int countIterator = scan.nextInt();

        Client client = new Client(name, email, birthDate);
        Order order = new Order(OrderStatus.valueOf(status), client);

        for (int i = 0; i < countIterator; i++) {
            scan.nextLine();
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.print("Product Name: ");
            String productName = scan.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = scan.nextInt();
            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(productQuantity, product);

            order.addItem(orderItem);
        }

        System.out.println(order);

        scan.close();
    }
}
