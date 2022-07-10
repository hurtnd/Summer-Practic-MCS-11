package FractionalCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionalCalculatorTests {
    @Test
    void one(){
        String actual = FractionalCalculator.calc("12", "/", "3");
        assertEquals("`12/3", actual);
    }

    @Test
    void two(){
        String actual = FractionalCalculator.calc("1/4", "*", "1/4");
        assertEquals("`1/16", actual);
    }

    @Test
    void three(){
        String actual = FractionalCalculator.calc("2/7", "+", "5/12");
        assertEquals("`59/84", actual);
    }
}
