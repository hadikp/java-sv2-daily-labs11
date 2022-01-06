package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User peter;

    @BeforeEach
    void init() {
         peter = new User("Péter", 200_000);
    }

    @Test
    void testUser() {
        System.out.println(peter.getMoney());
    }

}