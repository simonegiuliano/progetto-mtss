////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    //costanti
    private static final String I =
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|";
    private static final String V =
        "__      __\n" +
        "\\ \\    / /\n" +
        " \\ \\  / / \n" +
        "  \\ \\/ /  \n" +
        "   \\  /   \n" +
        "    \\/    ";
    private static final String X =
        "__  __\n" +
        "\\ \\/ /\n" +
        " \\  / \n" +
        "  ><  \n" +
        " /  \\ \n" +
        "/_/\\_\\";
    private static final String L =
        " _      \n" +
        "| |     \n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        "|______|";

    @Test
    public void print_WithNumberOne_ShouldReturnAsciiI() {
        int number = 1;
        String result = RomanPrinter.print(number);
        assertEquals(I, result);
    }

    @Test
    public void print_WithNumberThree_ShouldReturnThreeAsciiI() {
        int number = 3;
        String expected =
            " _____   _____   _____ \n" +
            "|_   _| |_   _| |_   _|\n" +
            "  | |     | |     | |  \n" +
            "  | |     | |     | |  \n" +
            " _| |_   _| |_   _| |_ \n" +
            "|_____| |_____| |_____|";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void print_WithNumberFour_ShouldReturnAsciiIV() {
        // (Caso sottrattivo)
        int number = 4;
        String expected =
            " _____  __      __\n" +
            "|_   _| \\ \\    / /\n" +
            "  | |    \\ \\  / / \n" +
            "  | |     \\ \\/ /  \n" +
            " _| |_     \\  /   \n" +
            "|_____|     \\/    ";

        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }

    @Test
    public void print_WithNumberFive_ShouldReturnAsciiV() {
        int number = 5;
        String result = RomanPrinter.print(number);
        assertEquals(V, result);
    }

    @Test
    public void print_WithNumberNine_ShouldReturnAsciiIX() {
        int number = 9;
        String expected =
            " _____  __  __\n" +
            "|_   _| \\ \\/ /\n" +
            "  | |    \\  / \n" +
            "  | |     ><  \n" +
            " _| |_   /  \\ \n" +
            "|_____| /_/\\_\\";

        String result = RomanPrinter.print(number);
        assertEquals(expected, result);
    }

    @Test
    public void print_WithNumberTen_ShouldReturnAsciiX() {
        int number = 10;
        String result = RomanPrinter.print(number);
        assertEquals(X, result);
    }

    @Test
    public void print_50_ShouldReturnAsciiL() {
        String result = RomanPrinter.print(50);
        assertEquals(L, result);
    }

    //FUORI BOUNDARY
    @Test(expected = IllegalArgumentException.class)
    public void print_WithInputOutOfRange_ShouldThrowException() {
        int number = 0;
        RomanPrinter.print(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void print_WithInputOverMax() {
        int number = IntegerToRoman.upperLimit + 1;
        RomanPrinter.print(number);
    }
}
