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
        String actual = IntegerToRoman.convert(number);
        assertEquals("I", actual);
    }

    // sottrazione
    @Test
    public void convert_WithFour_ShouldReturnIV() {
        int number = 4;
        String actual = IntegerToRoman.convert(number);
        assertEquals("IV", actual);
    }

    //numero più lungo
    @Test
    public void convert_WithEight_ShouldReturnVIII() {
        int number = 8;
        String actual = IntegerToRoman.convert(number);
        assertEquals("VIII", actual);
    }

    //sottrazione
    @Test
    public void convert_WithNine_ShouldReturnIX() {
        int number = 9;
        String actual = IntegerToRoman.convert(number);
        assertEquals("IX", actual);
    }

    @Test
    public void convert_34_ShouldReturnLX() {
        String actual = IntegerToRoman.convert(34);
        assertEquals("XXXIV", actual);
    }

    @Test
    public void convert_40_ShouldReturnLX() {
        int number = 40;
        String actual = IntegerToRoman.convert(number);
        assertEquals("XL", actual);
    }

    @Test
    public void convert_96_ShouldReturnXCVI(){
        String actual = IntegerToRoman.convert(96);
        assertEquals("XCVI", actual);
    }

    @Test
    public void convert_99_ShouldReturnXCIX(){
        String actual = IntegerToRoman.convert(99);
        assertEquals("XCIX", actual);
    }

    //massimo numero
    @Test
    public void convert_maxValue() {
        int number = IntegerToRoman.upperLimit;
        String actual = IntegerToRoman.convert(number);
        assertEquals("C", actual);
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
        int number = IntegerToRoman.upperLimit + 1;
        IntegerToRoman.convert(number);
    }
}
