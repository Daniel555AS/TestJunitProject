package upb.edu.co.testjunitproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoneyUtilTest {

    @Test
    public void moneyTest() {
        assertEquals("$1000.00", MoneyUtil.format(1000));
    } // public void moneyTest()

    @Test
    public void negativeMoneyTest() {
        assertEquals("-$1000.00", MoneyUtil.format(-1000));
    } // public void negativeMoneyTest()

    @Test
    public void symbolMoneyTest() {
        assertEquals("€1000.00", MoneyUtil.format(1000, "€"));
    } // public void symbolMoneyTest()

    @Test
    public void negativeSymbolMoneyTest() {
        assertEquals("-£1000.00", MoneyUtil.format(-1000, "£"));
    } // public void negativeSymbolMoneyTest()

    @Test
    public void notNullExceptionMoneyTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            MoneyUtil.format(1000, null);
        });
    } // public void notNullExceptionMoneyTest()

} // class MoneyUtilTest