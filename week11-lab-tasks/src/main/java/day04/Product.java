package day04;

import java.time.LocalDate;

public class Product implements Item {

    private String name;
    private int price;
    private LocalDate expirationDate; //vásárlás ideje + 3 hónap + kiterjesztett garancia vehető

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String  getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }

}
