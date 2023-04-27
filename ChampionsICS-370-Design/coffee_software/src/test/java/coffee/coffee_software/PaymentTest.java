package coffee.coffee_software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    Payment pay = new Payment ("404 ","credit", 4.50);
    @Test
    void getAmount() {
        assertEquals(4.50,pay.getAmount());
    }

    @Test
    void getPaymentMethod() {
        pay.setPaymentMethod("Apple Pay");
        assertEquals("Apple Pay",pay.getPaymentMethod());
    }

    @Test
    void getStatus() {
        pay.setStatus("Approved");
      assertEquals("Approved",pay.getStatus());
    }

    @Test
    void getDate() {
    }

    @Test
    void getPaymentId() {
        pay.setPaymentId("901");
        assertEquals("901",pay.getPaymentId());
    }

    @Test
    void complete(){
        pay.complete();
        assertEquals("Approved", pay.getStatus());
    }

    @Test
    void cancel(){
        pay.cancel();
        assertEquals("Cancelled", pay.getStatus());
    }
}