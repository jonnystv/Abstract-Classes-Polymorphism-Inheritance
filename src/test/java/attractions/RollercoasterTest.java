package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10, 1.40, 50.00);
        visitor2 = new Visitor(13, 1.40, 50.00);
        visitor3 = new Visitor(13, 1.50, 50.00);
        visitor4 = new Visitor(18, 2.05, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0 );
    }

    @Test
    public void tallPersonDoublePrice() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.0);
    }

    @Test
    public void notTallPersonNormalPrice() {
        assertEquals(8.4, rollerCoaster.priceFor(visitor3), 0.0);
    }

    @Test
    public void canRideRollerCosterIfTallOldEnough() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }

}
