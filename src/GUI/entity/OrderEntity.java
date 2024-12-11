package GUI.entity;

import java.sql.Timestamp;

public class OrderEntity {
    private String orderNum;
    private String orderCustomer;
    private String orderProduct;
    private int amount;
    private String destination;
    private Timestamp orderDate;

    public String getOrderNum() {
        return orderNum;
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public int getAmount() {
        return amount;
    }

    public String getDestination() {
        return destination;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public void setOrderProduct(String orderProduct) {
        this.orderProduct = orderProduct;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
}
