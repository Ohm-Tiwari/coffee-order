package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    OrderFileRepository orderRepository = new OrderFileRepository();

    @Test
    public void testAddDarkRoast() throws Exception {
//        OrderData o = new OrderData("dark roast", null);
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.99F, r.cost());
//        assertEquals("Dark roast", r.description());
    }

    @Test
    public void testAddHouseBlend() throws Exception {
//        OrderData o = new OrderData("house blend", null);
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.65F, r.cost());
//        assertEquals("House blend", r.description());
    }

    @Test
    public void testAddEspresso() throws Exception {
//
//        OrderData o = new OrderData("espresso", null);
//
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.34F, r.cost());
//        assertEquals("Espresso", r.description());
    }


    @Test
    public void testAddDecaf() throws Exception {
//
//        OrderData o = new OrderData("decaf", null);
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.28F, r.cost());
//        assertEquals("Decaf", r.description());
    }

    @Test
    public void testAddDarkRoastMilk() throws Exception {
//        OrderData o = new OrderData("dark roast", List.of("milk"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(2.39F, r.cost());
//        assertEquals("Dark roast, Milk", r.description());
    }

    @Test
    public void testAddHouseBlendMilk() throws Exception {
//        OrderData o = new OrderData("house blend", List.of("milk"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(2.05F, r.cost());
//        assertEquals("House blend, Milk", r.description());
    }

    @Test
    public void testAddEspressoMilk() throws Exception {
//        OrderData o = new OrderData("espresso", List.of("milk"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.74F, r.cost());
//        assertEquals("Espresso, Milk", r.description());
    }

    @Test
    public void testAddDecafMilk() throws Exception {
//        OrderData o = new OrderData("decaf", List.of("milk"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.68F, r.cost());
//        assertEquals("Decaf, Milk", r.description());
    }

    @Test
    public void testAddDarkRoastMocha() throws Exception {
//        OrderData o = new OrderData("dark roast", List.of("mocha"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(2.29F, r.cost());
//        assertEquals("Dark roast, Mocha", r.description());
    }

    @Test
    public void testAddHouseBlendMocha() throws Exception {
//        OrderData o = new OrderData("house blend", List.of("mocha"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.95F, r.cost());
//        assertEquals("House blend, Mocha", r.description());
    }

    @Test
    public void testAddEspressoMocha() throws Exception {
//        OrderData o = new OrderData("espresso", List.of("mocha"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.6400001F, r.cost());
//        assertEquals("Espresso, Mocha", r.description());
    }

    @Test
    public void testAddDecafMocha() throws Exception {
//        OrderData o = new OrderData("decaf", List.of("mocha"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.5799999F, r.cost());
//        assertEquals("Decaf, Mocha", r.description());
    }

    @Test
    public void testAddDarkRoastSoy() throws Exception {
//        OrderData o = new OrderData("dark roast", List.of("soy"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(2.26F, r.cost());
//        assertEquals("Dark roast, Soy", r.description());
    }

    @Test
    public void testAddHouseBlendSoy() throws Exception {
//        OrderData o = new OrderData("house blend", List.of("soy"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.92F, r.cost());
//        assertEquals("House blend, Soy", r.description());
    }

    @Test
    public void testAddEspressoSoy() throws Exception {
//        OrderData o = new OrderData("espresso", List.of("soy"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.61F, r.cost());
//        assertEquals("Espresso, Soy", r.description());
    }

    @Test
    public void testAddDecafSoy() throws Exception {
//        OrderData o = new OrderData("decaf", List.of("soy"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.55F, r.cost());
//        assertEquals("Decaf, Soy", r.description());
    }

    @Test
    public void testAddDarkRoastWhip() throws Exception {
//        OrderData o = new OrderData("dark roast", List.of("whip"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(2.24F, r.cost());
//        assertEquals("Dark roast, Whip", r.description());
    }

    @Test
    public void testAddHouseBlendWhip() throws Exception {
//        OrderData o = new OrderData("house blend", List.of("whip"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.90F, r.cost());
//        assertEquals("House blend, Whip", r.description());
    }

    @Test
    public void testAddEspressoWhip() throws Exception {
//        OrderData o = new OrderData("espresso", List.of("whip"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.59F, r.cost());
//        assertEquals("Espresso, Whip", r.description());
    }

    @Test
    public void testAddDecafWhip() throws Exception {
//        OrderData o = new OrderData("decaf", List.of("whip"));
//        Receipt r = orderRepository.add(o);
//
//        assertEquals(1.53F, r.cost());
//        assertEquals("Decaf, Whip", r.description());
    }
}