package com.mruruc.closures.excercise;

public class Order {
    private double amount;
    private String status;
    private String buyer;

    // Constructors, getters and setters are omitted for brevity

    public Order(double amount, String status, String buyer) {
        this.amount = amount;
        this.status = status;
        this.buyer = buyer;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", status='" + status + '\'' +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}