package day04;

import java.time.LocalDate;

public interface Item {

    String  getName();
    int getPrice();
    LocalDate getExpirationDate();

}
