import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void bikeCanTurnOnTest(){
        Bike honda = new Bike();
        boolean result = honda.turnOn();
        assertTrue(result);
    }

    @Test
    public void bikeCanTurnOffTest(){
        Bike honda = new Bike();
        boolean result = honda.turnOn();
        assertTrue(result);
        boolean result1 = honda.turnOn();

    }

}