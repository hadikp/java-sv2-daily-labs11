package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testNormalUser() {
        NormalUser normalUser = new NormalUser("hadikp@freemail.hu", "aegt55");
        assertEquals("hadikp@freemail.hu", normalUser.getUserEmail());
        assertEquals("A kért jelszó: ******", normalUser.getPassword());
    }

    @Test
    void testAdminUser(){
        AdminUser adminUser = new AdminUser("hadikp@freemail.hu", "12345");
        assertEquals("*****", adminUser.getPassword());
    }

}