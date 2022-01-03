package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testUser() {
        NormalUser normalUser = new NormalUser("hadikp@freemail.hu", "aegt55");
        System.out.println(normalUser.getUserEmail());
        System.out.println(normalUser.getPassword());
    }

}