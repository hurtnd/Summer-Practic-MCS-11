import org.junit.jupiter.api.Test;
import ru.ac.uniyar.esin.and.scherbakov.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    void one() {
        String actual = String.valueOf(Main.calc(1, '+',1));
        assertEquals("2", actual);
    }

    @Test
    void two() {
        String actual = String.valueOf(Main.calc(2, '-',1));
        assertEquals("1", actual);
    }

    @Test
    void three() {
        String actual = String.valueOf(Main.calc(2, '*',3));
        assertEquals("6", actual);
    }

    @Test
    void four() {
        String actual = String.valueOf(Main.calc(10, '/',2));
        assertEquals("5", actual);
    }

    @Test
    void five() {
        String actual = String.valueOf(Main.calc(20, '/',2));
        assertEquals("10", actual);
    }

    @Test
    void six() {
        String actual = String.valueOf(Main.calc(10, '*',10));
        assertEquals("100", actual);
    }

    @Test
    void seven() {
        String actual = String.valueOf(Main.calc(-1, '+',-1));
        assertEquals("-2", actual);
    }

    @Test
    void eight() {
        String actual = String.valueOf(Main.calc(-1, '-',-10));
        assertEquals("9", actual);
    }

    @Test
    void nine() {
        String actual = String.valueOf(Main.calc(7, '*',0));
        assertEquals("0", actual);
    }

    @Test
    void ten() {
        String actual = String.valueOf(Main.calc(7, '/',0));
        assertEquals("Деление на 0", actual);
    }
}
