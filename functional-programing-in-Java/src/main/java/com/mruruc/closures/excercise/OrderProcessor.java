package com.mruruc.closures.excercise;

import java.util.Arrays;
import java.util.List;

public class OrderProcessor {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(150.0, "COMPLETED", "John"),
                new Order(200.0, "PENDING", "John"),
                new Order(320.0, "COMPLETED", "Alice"),
                new Order(50.0, "COMPLETED", "John"),
                new Order(290.0, "CANCELLED", "Alice")
        );

        double limit = 200.0;
        String buyer = "John";

        double totalAmount = calculateTotalForBuyer(orders, "COMPLETED", buyer);

        if (totalAmount > limit) {
            notifyBuyer(buyer, totalAmount);
        }
    }

    public static double calculateTotalForBuyer(List<Order> orders, String status, String buyer) {
        return orders.stream()
                .filter(order -> status.equals(order.getStatus()))
                .filter(order -> buyer.equals(order.getBuyer()))
                .mapToDouble(Order::getAmount)
                .sum();
    }

    public static void notifyBuyer(String buyer, double amount) {
        // The lambda expression here acts as a closure, having access to the 'buyer' variable.
        Runnable notification =
                () -> System.out.println("Notification to " + buyer + ": Your total purchases amount to $" + amount);

        // In a real-world scenario, this might be an asynchronous operation or some other complex notification mechanism.
        new Thread(notification).start();
    }
}
