package day04;

import java.time.LocalDate;

public class Service implements Item {

    private String name;
    private int price;
    private LocalDate expirationDate; //vásárlás ideje + 1 év

    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
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

    @Override
    public String toString() {
        return name + " ára: " + price +
                ", lejárati ideje: " + expirationDate;
    }
}
