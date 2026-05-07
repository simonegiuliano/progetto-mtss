////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertMinRange() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertMaxRangeIssue2() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertZeroThrowsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNegativeThrowsException() {
        IntegerToRoman.convert(-5);
    }
}