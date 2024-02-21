package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.*;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderRepository {
    private static final AtomicInteger idGen = new AtomicInteger(1);
    public Receipt add(OrderData order) throws Exception {
        Beverage beverage = null;
        switch (order.beverage().toLowerCase()) {
            case "dark roast":
                beverage = new DarkRoast();
                break;
            case "house blend":
                beverage = new HouseBlend();
                break;
            case "espresso":
                beverage = new Espresso();
                break;
            case "decaf":
                beverage = new Decaf();
                break;
        }
        if (beverage == null) {
            throw new Exception("Beverage type '%s' is not valid!".formatted(order.beverage()));
        }
        for(String condiment : order.condiments()) {
            switch (condiment.toLowerCase()) {
                case "milk":
                   beverage = new Milk(beverage);
                   break;
                case "mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "soy":
                    beverage = new Soy(beverage);
                    break;
                case "whip":
                    beverage = new Whip(beverage);
                    break;

                default:
                    throw new Exception("Condiment type '%s' is not valid".formatted(condiment));
            }
        }
        int rId = idGen.getAndIncrement();

        Receipt receipt = new Receipt(rId, beverage.getDescription(), beverage.cost());
        return receipt;
    }
}
