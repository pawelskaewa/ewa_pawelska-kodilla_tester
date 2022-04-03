package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService() {
            @Override
            public void success(String address) {
                System.out.println("Package delivered to: " + address);
            }

            @Override
            public void fail(String address) {
                System.out.println("Package not delivered to: " + address);
            }
        };
        DeliveryService deliveryService = new DeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}