package coffee.coffee_software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer c1 = new Customer("Mary", 1);

    @Test
    void getName() {
        assertEquals("Mary", c1.getName());
    }

    @Test
    void setName() {
        c1.setName("Marie");
        assertEquals("Marie", c1.getName());
    }

    @Test
    void getCustomerId() {
        assertEquals(1, c1.getCustomerId());
    }

    @Test
    void setCustomerId() {
        c1.setCustomerId(2);
        assertNotEquals(1,c1.getCustomerId());
    }

    @Test
    void getSavedPayMethod() {
        Customer c1 = new Customer("Mary", 01, "Credit");
        assertEquals("Credit", c1.getSavedPayMethod());
    }

    @Test
    void setSavedPayMethod() {
        c1.setSavedPayMethod("Google Pay");
        assertEquals("Google Pay", c1.getSavedPayMethod());
    }

    @Test
    void addOrder() {
    }
}