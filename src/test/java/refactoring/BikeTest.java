package refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BikeTest {

    @Test
    void testGetGearsCount() {
        Bike bike = new Bike("Schnell", 400.99, 2500, 3, 7);
        assertEquals(bike.getGearsCount(), 21);
    }
}
