package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(schema = "coffee", name = "order")
public final class OrderData {
    @Id
    private final String beverage;
    private final List<String> condiments;

    public OrderData(String beverage, List<String> condiments) {
        this.beverage = beverage;
        this.condiments = condiments;
    }

    public String getBeverage() {
        return beverage;
    }

    public List<String> getCondiments() {
        return condiments;
    }
}
