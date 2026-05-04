package com.proyect;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private static final String ORDER_INTERNATIONAL = "INTERNATIONAL";
    private static final String ORDER_NORMAL = "NORMAL";
    private static final String ORDER_PRIORITY = "PRIORITY";
    private static final double DISCOUNT_THRESHOLD = 100;
    private static final double DISCOUNT_RATE = 0.9;

    private List<String> orders = new ArrayList<>();
    private String tempDiscount;
    private boolean debugMode = false;

    public void processOrder(String orderType, double price, int quantity) {
        System.out.println("Processing order...");

        printDebugInfo(orderType, price, quantity);

        validateQuantity(quantity);

        double total = price * quantity;

        printOrderType(orderType);

        total = applyDiscount(total);

        System.out.println("Total: " + total);

        addOrderIfValid(orderType, total, quantity);

        System.out.println("Order processed.");
    }

    public void printOrders() {
        for (String o : orders) {
            System.out.println(o);
        }
    }

    private void validateQuantity(int quantity) {
        if (quantity == 0) {
            System.out.println("Error: quantity is zero");
        }

        if (quantity < 0) {
            System.out.println("Error: negative quantity");
        }
    }

    private void printOrderType(String orderType) {
        if (orderType.equals(ORDER_NORMAL)) {
            System.out.println("Normal order");
        } else if (orderType.equals(ORDER_PRIORITY)) {
            System.out.println("Priority order");
        } else if (orderType.equals(ORDER_INTERNATIONAL)) {
            System.out.println("International order");
        }
    }

    private double applyDiscount(double total) {
        if (total > DISCOUNT_THRESHOLD) {
            tempDiscount = "10%";
            return total * DISCOUNT_RATE;
        }
        return total;
    }

    private void addOrderIfValid(String orderType, double total, int quantity) {
        if (quantity > 0) {
            orders.add(orderType + "-" + total);
        }
    }

    private void printDebugInfo(String orderType, double price, int quantity) {
        if (debugMode) {
            System.out.println("Debug: orderType=" + orderType + " price=" + price + " quantity=" + quantity);
        }
    }
}