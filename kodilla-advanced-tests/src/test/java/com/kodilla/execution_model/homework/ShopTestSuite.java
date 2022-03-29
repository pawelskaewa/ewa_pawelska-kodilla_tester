//package com.kodilla.execution_model.homework;
//
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class ShopTestSuite {
//
//    Order firstOrder = new Order(125, LocalDate.of(2022, 03, 20), "annanowak");
//    Order secondOrder = new Order(100, LocalDate.of(2022, 03, 21), "annanowak");
//    Order thirdOrder = new Order(200, LocalDate.of(2022, 03, 22), "robertkowalski");
//    Order forthOrder = new Order(200, LocalDate.of(2019, 03, 22), "robertkowalski");
//    Order minusValueOrder = new Order(-200, LocalDate.of(2019, 03, 22), "robertkowalski");
//    Shop shop = new Shop();
//
//    @Test
//    public void shouldAddItemsToList() {
//        shop.addNewOrder(firstOrder);
//        assertEquals(1, shop.getNumberOfOrders());
//    }
//
//    @Test
//    public void shouldNotAddOrderWithMinusValueToList() {
//        shop.addNewOrder(minusValueOrder);
//        assertEquals(0, shop.getNumberOfOrders());
//    }
//
//    @Test
//    public void shouldReturnListOfOrdersNoOlderThanTwoYears() {
//        shop.addNewOrder(firstOrder);
//        shop.addNewOrder(forthOrder);
//        assertEquals(1, shop.getListOfOrdersNoOlderThanTwoYears().size());
//    }
//
//    @Test
//    public void shouldReturnListOfOrdersNoOlderThanTwoYears2() {
//        shop.addNewOrder(firstOrder);
//        shop.addNewOrder(forthOrder);
//        ArrayList<Order> listOfOrdersNoOlderThanTwoYears = shop.getListOfOrdersNoOlderThanTwoYears();
//        assertEquals(125, listOfOrdersNoOlderThanTwoYears.get(0).getOrderValue());
//    }
//
//    @Test
//    public void shouldReturnListOfOrdersInGivenRange() {
//        shop.addNewOrder(firstOrder);
//        shop.addNewOrder(secondOrder);
//        shop.addNewOrder(thirdOrder);
//        shop.addNewOrder(forthOrder);
//        assertEquals(2, shop.getListOfOrders_Range(100, 126).size());
//    }
//
//    @Test
//    public void shouldReturnNumberOfOrders() {
//        shop.addNewOrder(firstOrder);
//        shop.addNewOrder(secondOrder);
//        shop.addNewOrder(thirdOrder);
//        shop.addNewOrder(forthOrder);
//        assertEquals(4, shop.getNumberOfOrders());
//    }
//
//    @Test
//    public void shouldReturnCorrectValueOfOrders() {
//        shop.addNewOrder(firstOrder);
//        shop.addNewOrder(secondOrder);
//        shop.addNewOrder(thirdOrder);
//        shop.addNewOrder(forthOrder);
////        assertEquals(625, shop.getOrdersValue());
//    }
//}