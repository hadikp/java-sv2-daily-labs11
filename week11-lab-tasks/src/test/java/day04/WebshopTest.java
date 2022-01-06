package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WebshopTest {

    Webshop webshop;

    @BeforeEach
    void init() {
        webshop = new Webshop(Arrays.asList(
                new User("Péter", 200_000),
                new User("Enikő", 210_000),
                new User("Roland", 100_000)), Arrays.asList(
                    new Product("szappan", 500),
                    new Service("masszázs", 5000),
                    new Product("fogkefe", 200),
                    new Service("fürdetés", 2000),
                    new Product("banán", 1000)
                ));
    }

    @Test
    void testItemsAndUsers() {
        assertEquals(5, webshop.getItems().size());
        webshop.printItems();
        //System.out.println(webshop.getUsers());
    }



}