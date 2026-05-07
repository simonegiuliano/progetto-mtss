////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    // RISULTATI CHE MI ASPETTO:

    @Test
    public void convert_WithMinimumValidValue_ShouldReturnI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void convert_WithThree_ShouldReturnIII() {
        int number = 3;
        String result = IntegerToRoman.convert(number);
        assertEquals("III", result);
    }

    @Test
    public void convert_WithFour_ShouldReturnIV() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    @Test
    public void convert_WithSix_ShouldReturnVI() {
        int number = 6;
        String result = IntegerToRoman.convert(number);
        assertEquals("VI", result);
    }

    //ERRORI 

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithZero_ShouldThrowException() {
        int number = 0;
        IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithNegativeNumber_ShouldThrowException() {
        int number = -1;
        IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithNumberGreaterThanSix_ShouldThrowException() {
        int number = 7;
        IntegerToRoman.convert(number);
    }
}