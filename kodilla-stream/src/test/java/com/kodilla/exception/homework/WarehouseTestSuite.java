package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInTheSystem() throws OrderDoesntExistException {
        Order order = new Order("123");
        Warehouse.addOrder(order);
        assertEquals(Warehouse.getOrder("123").getNumber(), "123");
    }

    @Test
    public void testIsOrderInTheSystem_withException() {
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.getOrder("12"));
    }
}