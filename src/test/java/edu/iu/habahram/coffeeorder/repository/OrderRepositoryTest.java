package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {

    @Test
    public void testAddDarkRoast() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlend() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData o = new OrderData("house blend", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.65F, r.cost());
        assertEquals("House blend", r.description());
    }

    @Test
    public void testAddEspresso() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData o = new OrderData("espresso", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.34F, r.cost());
        assertEquals("Espresso", r.description());
    }


    @Test
    public void testAddDecaf() throws Exception {
        OrderRepository orderRepository = new OrderRepository();

        OrderData o = new OrderData("decaf", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.28F, r.cost());
        assertEquals("Decaf", r.description());
    }

}