////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    // -----------------------------------------------------------
    // Funzionamento che mi aspetto
    // -----------------------------------------------------------

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

    @Test
    public void convert_34_ShouldReturnLX() {
        String result = IntegerToRoman.convert(34);
        assertEquals("XXXIV", result);
    }

    @Test
    public void convert_40_ShouldReturnLX() {
        int number = 40;
        String result = IntegerToRoman.convert(number);
        assertEquals("XL", result);
    }

    //massimo numero
    @Test
    public void convert_maxValue() {
        int number = IntegerToRoman.upperLimit;
        String result = IntegerToRoman.convert(number);
        assertEquals("L", result);
    }

    // -----------------------------------------------------------
    // Controlli su sanificazione input
    // -----------------------------------------------------------

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
    public void convert_overLimit_ShouldThrowException() {
        int number = 51;
        IntegerToRoman.convert(number);
    }
}
