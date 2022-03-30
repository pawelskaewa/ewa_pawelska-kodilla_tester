package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    public ArrayList<Order> listOfOrders = new ArrayList<Order>();

    public void addNewOrder(Order order) {
        if (order.getOrderValue() > 0)
            listOfOrders.add(order);
    }

    public List getListOfOrdersNoOlderThanTwoYears() {
        List<Order> ordersNoOlderThanTwoYears = new ArrayList<>();
        for (int n = 0; n < listOfOrders.size(); n++)
            if (listOfOrders.get(n).getOrderDate().isAfter(LocalDate.now().minusYears(2))) {
                ordersNoOlderThanTwoYears.add(listOfOrders.get(n));
            }
        return ordersNoOlderThanTwoYears;
    }

    public List getListOfOrdersInRange(double minOrderValue, double maxOrderValue) {
        List<Order> ordersInRange = new ArrayList<>();
        for (int n = 0; n < listOfOrders.size(); n++)
            if (listOfOrders.get(n).getOrderValue() >= minOrderValue & listOfOrders.get(n).getOrderValue() <= maxOrderValue) {
                ordersInRange.add(listOfOrders.get(n));
            }
        return ordersInRange;
    }

    public int getNumberOfOrders() {
        return listOfOrders.size();
    }

    public double getOrdersValue() {
        double sumOfOrdersValues = 0;
        for (int n = 0; n < listOfOrders.size(); n++)
            sumOfOrdersValues += listOfOrders.get(n).getOrderValue();
        return sumOfOrdersValues;
    }
}