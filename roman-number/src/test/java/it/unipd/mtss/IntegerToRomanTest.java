////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    // RISULTATI CHE MI ASPETTO:

    //primo numero
    @Test
    public void convert_WithMinimumValidValue_ShouldReturnI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }
    // sottrazione
    @Test
    public void convert_WithFour_ShouldReturnIV() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    //numero più lungo
    @Test
    public void convert_WithEight_ShouldReturnVIII() {
        int number = 8;
        String result = IntegerToRoman.convert(number);
        assertEquals("VIII", result);
    }

    //sottrazione
    @Test
    public void convert_WithNine_ShouldReturnIX() {
        int number = 9;
        String result = IntegerToRoman.convert(number);
        assertEquals("IX", result);
    }
    //massimo numero
    @Test
    public void convert_WithMinimumValidValue_ShouldReturnX() {
        int number = 10;
        String result = IntegerToRoman.convert(number);
        assertEquals("X", result);
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
        int number = 11;
        IntegerToRoman.convert(number);
    }
}