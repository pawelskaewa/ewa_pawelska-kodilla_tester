package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    static List<Order> orders = new ArrayList<>();

    public static Order addOrder(Order order) {
        Order newOrder = new Order(order.getNumber());
        if (orders.size() == 0) {
            orders.add(newOrder);
        }

        for (int n = 0; n < orders.size(); n++)
            if (newOrder.equals(orders.get(n))) {
                return orders.get(n);
            } else {
                orders.add(newOrder);
                return newOrder;
            }
        return newOrder;
    }

    public static Order getOrder(String searchedOrder) throws OrderDoesntExistException {
        Order orderInQuestion = orders
                .stream()
                .filter(u -> u.getNumber().equals(searchedOrder))
                .findAny()
                .orElseThrow(() -> new OrderDoesntExistException());
        return orderInQuestion;
    }
}