package at.fhtw.ImperialAPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestConverter {
        Converter converter = new Converter();
    @Test
    void trueCase(){
        assertEquals(25.4,converter.convertInchToCm(10));
    }

    @Test
    void falseCase(){
        assertNotEquals(27.4,converter.convertInchToCm(10));
    }


}
