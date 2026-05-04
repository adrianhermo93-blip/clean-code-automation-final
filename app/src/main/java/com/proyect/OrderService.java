package com.proyect;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<String> orders = new ArrayList<>();
    private String tempDiscount;
    private boolean debugMode = false;

    public void processOrder(String orderType, double price, int quantity) {
        System.out.println("Processing order...");
        if (debugMode) {
            System.out.println("Debug: orderType=" + orderType + " price=" + price + " quantity=" + quantity);
        }

        double total = price * quantity;

        if (orderType.equals("NORMAL")) {
            System.out.println("Normal order");
        } else if (orderType.equals("PRIORITY")) {
            System.out.println("Priority order");
        } else if (orderType.equals("INTERNATIONAL")) {
            System.out.println("International order");
        }

        if (total > 100) {
            tempDiscount = "10%";
            total = total * 0.9;
        }

        System.out.println("Total: " + total);

        if (quantity > 0) {
            orders.add(orderType + "-" + total);
        }

        if (quantity == 0) {
            System.out.println("Error: quantity is zero");
        }

        if (quantity < 0) {
            System.out.println("Error: negative quantity");
        }

        System.out.println("Order processed.");
    }

    public void printOrders() {
        for (String o : orders) {
            System.out.println(o);
        }
    }


    }
}
