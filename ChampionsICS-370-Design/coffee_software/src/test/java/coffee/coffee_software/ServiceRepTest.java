package coffee.coffee_software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceRepTest {

    @Test
    void maintenance() {
    }

    @Test
    void getRepId() {
        ServiceRep rep= new ServiceRep("Bob", "01");
        assertEquals("01",rep.getRepId());

    }

    @Test
    void setRepId() {
        ServiceRep rep = new ServiceRep("Bob","01");
        rep.setRepId("02");
        assertEquals("02",rep.getRepId());
    }

    @Test
    void getRepName() {
        ServiceRep rep= new ServiceRep("Joe", "01");
        assertEquals("Joe",rep.getRepName());

    }

    @Test
    void setRepName(){
        ServiceRep rep = new ServiceRep("Bob","01");
        rep.setRepName("Clark");
        assertEquals("Clark",rep.getRepName());
    }


}


