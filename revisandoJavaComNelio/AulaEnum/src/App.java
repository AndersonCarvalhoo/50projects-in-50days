import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("ENTREGUE");

        OrderStatus os2 = OrderStatus.ENTREGUE;

        System.out.println(os1);
        System.out.println(os2);

    }
}
