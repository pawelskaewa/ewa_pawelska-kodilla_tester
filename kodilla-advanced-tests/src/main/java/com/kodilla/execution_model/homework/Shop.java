package com.kodilla.execution_model.homework;

import java.util.ArrayList;

public class Shop {

    public ArrayList<Order> listOfOrders = new ArrayList<Order>();

    public void addNewOrder(Order order) {

    }

    public ArrayList getListOfOrdersNoOlderThanTwoYears() {
        return new ArrayList<>();
    }

    public ArrayList getListOfOrders_Range(double minOrderValue, double maxOrderValue) {
        return new ArrayList<>();
    }

    public int getNumberOfOrders() {
        return listOfOrders.size();
    }

    public double getOrdersValue(double ordersValue) {
        return ordersValue;
    }
}