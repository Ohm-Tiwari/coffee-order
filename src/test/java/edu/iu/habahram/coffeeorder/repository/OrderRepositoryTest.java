package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    OrderRepository orderRepository = new OrderRepository();

    @Test
    public void testAddDarkRoast() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlend() throws Exception {

        OrderData o = new OrderData("house blend", null);

        Receipt r = orderRepository.add(o);

        assertEquals(3, r.id());
        assertEquals(1.65F, r.cost());
        assertEquals("House blend", r.description());
    }

    @Test
    public void testAddEspresso() throws Exception {

        OrderData o = new OrderData("espresso", null);

        Receipt r = orderRepository.add(o);

        assertEquals(4, r.id());
        assertEquals(1.34F, r.cost());
        assertEquals("Espresso", r.description());
    }


    @Test
    public void testAddDecaf() throws Exception {

        OrderData o = new OrderData("decaf", null);

        Receipt r = orderRepository.add(o);

        assertEquals(2, r.id());
        assertEquals(1.28F, r.cost());
        assertEquals("Decaf", r.description());
    }

    @Test
    public void testAddDarkRoastMilk() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlendMilk() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddEspressoMilk() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddDecafMilk() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddDarkRoastMocha() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlendMocha() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddEspressoMocha() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddDecafMocha() throws Exception {

        OrderData o = new OrderData("decaf", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Decaf", r.description());
    }

    @Test
    public void testAddDarkRoastSoy() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlendSoy() throws Exception {

        OrderData o = new OrderData("house blend", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("House blend", r.description());
    }

    @Test
    public void testAddEspressoSoy() throws Exception {

        OrderData o = new OrderData("espresso", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Espresso", r.description());
    }

    @Test
    public void testAddDecafSoy() throws Exception {

        OrderData o = new OrderData("decaf", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Decaf", r.description());
    }

    @Test
    public void testAddDarkRoastWhip() throws Exception {

        OrderData o = new OrderData("dark roast", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlendWhip() throws Exception {

        OrderData o = new OrderData("house blend", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("House blend", r.description());
    }

    @Test
    public void testAddEspressoWhip() throws Exception {

        OrderData o = new OrderData("espresso", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Espresso", r.description());
    }

    @Test
    public void testAddDecafWhip() throws Exception {

        OrderData o = new OrderData("decaf", null);

        Receipt r = orderRepository.add(o);

        assertEquals(1, r.id());
        assertEquals(1.99F, r.cost());
        assertEquals("Decaf", r.description());
    }







}