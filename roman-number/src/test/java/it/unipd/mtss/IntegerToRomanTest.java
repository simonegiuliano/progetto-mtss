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

    //numero più lungo in cifre romane
    @Test
    public void convert_WithEightHundredEightyEight_ShouldReturnDCCCLXXXVIII() {
        int number = 888;
        String actual = IntegerToRoman.convert(number);
        assertEquals("DCCCLXXXVIII", actual);
    }

    // test per sottrazione
    @Test
    public void convert_WithFour_ShouldReturnIV() {
        int number = 4;
        String actual = IntegerToRoman.convert(number);
        assertEquals("IV", actual);
    }

    
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
    public void convert_400_ShouldReturnCD() {
        int number = 400;
        String actual = IntegerToRoman.convert(number);
        assertEquals("CD", actual);
    }

    @Test
    public void convert_900_ShouldReturnCM() {
        int number = 900;
        String actual = IntegerToRoman.convert(number);
        assertEquals("CM", actual);
    }

    // concatenazione
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

    @Test
    public void convert_333_ShouldReturnCCCXXXIII(){
        String actual = IntegerToRoman.convert(333);
        assertEquals("CCCXXXIII", actual);
    }

    @Test
    public void convert_499_ShouldReturnCDXCIX(){
        String actual = IntegerToRoman.convert(499);
        assertEquals("CDXCIX", actual);
    }

    @Test
    public void convert_990_ShouldReturnCMXC() {
        int number = 990;
        String actual = IntegerToRoman.convert(number);
        assertEquals("CMXC", actual);
    }

    @Test
    public void convert_883_ShouldReturnDCCCLXXXIII() {
        int number = 883;
        String actual = IntegerToRoman.convert(number);
        assertEquals("DCCCLXXXIII", actual);
    }

    @Test
    public void convert_999_ShouldReturnCMXCIX() {
        int number = 999;
        String actual = IntegerToRoman.convert(number);
        assertEquals("CMXCIX", actual);
    }

    //massimo numero
    @Test
    public void convert_maxValue() {
        int number = IntegerToRoman.upperLimit;
        String actual = IntegerToRoman.convert(number);
        assertEquals("M", actual);
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
