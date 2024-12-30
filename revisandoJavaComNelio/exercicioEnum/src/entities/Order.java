package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
  private Date moment;
  private OrderStatus status;

  private Client client;
  private ArrayList<OrderItem> orderItems = new ArrayList<>();

  public Order(Date moment, OrderStatus status, Client client) {
    this.moment = moment;
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

}
