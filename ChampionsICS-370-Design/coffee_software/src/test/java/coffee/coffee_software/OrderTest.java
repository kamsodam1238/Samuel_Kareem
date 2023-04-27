package coffee.coffee_software;
import coffee.coffee_beverage.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Beverage b1 = new Beverage(BeverageType.Latte, drinkAdd.Almond, drinkSize.Tall, brewOpt.Double);
    Order o1 = new Order(101, b1);

    @Test
    void getOrderId() {
        assertEquals(101,o1.getOrderId());
    }

    @Test
    void getTotal() {
        //Order total should be: 4 + 0.5 + 0.5 + 0.75 = 5.75
        assertEquals(5.75, o1.getTotal());
    }

    @Test
    void displayToString() {
        System.out.println(o1.toString());
    }
}