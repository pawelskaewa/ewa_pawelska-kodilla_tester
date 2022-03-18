package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse.addOrder(new Order("123"));
        Warehouse.addOrder(new Order("124"));
        Warehouse.addOrder(new Order("125"));

        try {
            Warehouse.getOrder("dfghj");
            System.out.println("The order exists in our system");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order doesn't exist in our system");
        }
    }
}