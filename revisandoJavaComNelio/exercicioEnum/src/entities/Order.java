package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
  private Date moment;
  private OrderStatus status;

  private Client client;
  private ArrayList<OrderItem> orderItems = new ArrayList<>();

  public Order(OrderStatus status, Client client) {
    this.moment = new Date();
    this.status = status;
    this.client = client;
  }

  public Date getMoment() {
    return moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public ArrayList<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void addItem(OrderItem item) {
    this.orderItems.add(item);
  }

  public void removeItem(OrderItem item) {
    this.orderItems.remove(item);
  }

  public Double total() {
    Double total = 0.0;
    for (OrderItem item : orderItems) {
      Double subTotal = item.subTotal();
      total += subTotal;
    }
    return total;
  }

  public String toString() {
    SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdfBirthDay = new SimpleDateFormat("dd/MM/yyyy");
    StringBuilder sb = new StringBuilder();
    sb.append("ORDER SUMMARY\n")
        .append("Order moment: ").append(sdfMoment.format(this.getMoment())).append("\n")
        .append("Order status: ").append(this.getStatus()).append("\n")
        .append("Client: ").append(this.getClient().getName()).append(" ")
        .append("(" + sdfBirthDay.format(this.getClient().getBirthDate()) + ")").append(" - ")
        .append(this.getClient().getEmail()).append("\n")
        .append("Order items: ").append("\n");
    Double totalPrice = 0.0;
    for (OrderItem item : this.orderItems) {
      sb.append(
          item.product.getName() + ", " + "Quantity: " + item.getQuantity() + ", Subtotal: " + item.subTotal() + "\n");
      totalPrice += item.subTotal();
    }
    sb.append("Total Price: " + totalPrice);

    return sb.toString();

  }

}
