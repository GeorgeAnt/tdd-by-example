package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

    }

    @Test
    void testEqualityDollar() {
        Money five = Money.dollar(5);
        assertEquals(five, Money.dollar(5));
        assertNotEquals(five, Money.dollar(8));
        assertNotEquals(five, Money.franc(5));
    }

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        Money five = Money.franc(5);
        assertEquals(five, Money.franc(5));
        assertNotEquals(five, Money.franc(8));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
