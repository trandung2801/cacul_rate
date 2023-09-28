import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorRateTest {

    @Test
    void testCaseR1() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorRate.calcul_rate(1, -1);
        });
    }

    @Test
    void testCaseR2() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(3, calculatorRate.calcul_rate(1, 1));
    }

    @Test
    void testCaseR3() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(3.5F, calculatorRate.calcul_rate(1, 900000000));
    }

    @Test
    void testCaseR4() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(4.5F, calculatorRate.calcul_rate(1, 900000001));
    }

    @Test
    void testCaseR5() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorRate.calcul_rate(1, 2000000001);
        });
    }

    @Test
    void testCaseR6() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorRate.calcul_rate(2, -1);
        });
    }

    @Test
    void testCaseR7() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(4, calculatorRate.calcul_rate(2, 1));
    }

    @Test
    void testCaseR8() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(5, calculatorRate.calcul_rate(2, 900000000));
    }

    @Test
    void testCaseR9() {
        CalculatorRate calculatorRate = new CalculatorRate();
        assertEquals(7, calculatorRate.calcul_rate(2, 900000001));
    }

    @Test
    void testCaseR10() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorRate.calcul_rate(2, 2000000001);
        });
    }

    @Test
    void testCaseR11() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorRate.calcul_rate(3, 9000000);
        });
    }
}