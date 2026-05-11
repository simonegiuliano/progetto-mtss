////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RomanPrinterTest {
    private static final String I =     /*costanti */
        " _____ \n" +"|_   _|\n" +
        "  | |  \n" +"  | |  \n" +
        " _| |_ \n" +"|_____|";
    private static final String V =
    "__      __\n" +"\\ \\    / /\n" +
    " \\ \\  / / \n" +"  \\ \\/ /  \n" +
    "   \\  /   \n" +"    \\/    ";
    private static final String X =
        "__  __\n" +"\\ \\/ /\n" +
        " \\  / \n" +"  ><  \n" +
        " /  \\ \n" +"/_/\\_\\";
    private static final String L =
        " _      \n" +"| |     \n" +
        "| |     \n" +"| |     \n" +
        "| |____ \n" +"|______|";
    private static final String C =
        "  _____ \n" +" / ____|\n" +
        "| |     \n" +"| |     \n" +
        "| |____ \n" +" \\_____|";
    private static final String D =
        " ____   \n" + "|  __ \\\n" +
        "| |  | |\n" +"| |  | |\n" +
        "| |__| |\n" +"|_____/ ";
    private static final String M =
        " __  __ \n" +"|  \\/  |\n" +
        "| \\  / |\n" +"| |\\/| |\n" +
        "| |  | |\n" +"|_|  |_|";
    @Test
    public void print_WithNumberOne_ShouldReturnAsciiI() {
        int number = 1;
        String actual = RomanPrinter.print(number);
        assertEquals(I, actual);
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
        String actual = RomanPrinter.print(number);
        assertEquals(expected, actual);
    }
    @Test
    public void print_WithNumberFour_ShouldReturnAsciiIV() {
        int number = 4;
        String expected =
            " _____  __      __\n" +
            "|_   _| \\ \\    / /\n" +
            "  | |    \\ \\  / / \n" +
            "  | |     \\ \\/ /  \n" +
            " _| |_     \\  /   \n" +
            "|_____|     \\/    ";
        String actual = RomanPrinter.print(number);
        assertEquals(expected, actual);
    }
    @Test
    public void print_WithNumberFive_ShouldReturnAsciiV() {
        int number = 5;
        String actual = RomanPrinter.print(number);
        assertEquals(V, actual);
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
        String actual = RomanPrinter.print(number);
        assertEquals(expected, actual);
    }
    @Test
    public void print_WithNumberTen_ShouldReturnAsciiX() {
        int number = 10;
        String actual = RomanPrinter.print(number);
        assertEquals(X, actual);
    }
    @Test
    public void print_50_ShouldReturnAsciiL() {
        String actual = RomanPrinter.print(50);
        assertEquals(L, actual);
    }
    @Test
    public void print_100_ShouldReturnAsciiC() {
        String actual = RomanPrinter.print(100);
        assertEquals(C, actual);
    }
    @Test
    public void print_500_ShouldReturnAsciiD() {
        String actual = RomanPrinter.print(500);
        assertEquals(D, actual);
    }
    @Test
    public void print_1000_ShouldReturnAsciiM() {
        String actual = RomanPrinter.print(1000);
        assertEquals(M, actual);
    }
    @Test
    public void print94_ShouldReturnXCIV() {
        String expected =
            "__  __   _____   _____  __      __\n" +
            "\\ \\/ /  / ____| |_   _| \\ \\    / /\n" +
            " \\  /  | |        | |    \\ \\  / / \n" +
            "  ><   | |        | |     \\ \\/ /  \n" +
            " /  \\  | |____   _| |_     \\  /   \n" +
            "/_/\\_\\  \\_____| |_____|     \\/    ";

        assertEquals(expected, RomanPrinter.print(94));
    }
    @Test
    public void print99_ShouldReturnXCIX() {
        String expected =
            "__  __   _____   _____  __  __\n" +
            "\\ \\/ /  / ____| |_   _| \\ \\/ /\n" +
            " \\  /  | |        | |    \\  / \n" +
            "  ><   | |        | |     ><  \n" +
            " /  \\  | |____   _| |_   /  \\ \n" +
            "/_/\\_\\  \\_____| |_____| /_/\\_\\";

        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    public void print444_ShouldReturnCDXLIV() {
    String expected =
        "  _____   ____    __  __  _        _____  __      __\n" +
        " / ____| |  __ \\ \\ \\/ / | |      |_   _| \\ \\    / /\n" +
        "| |      | |  | |  \\  /  | |        | |    \\ \\  / / \n" +
        "| |      | |  | |   ><   | |        | |     \\ \\/ /  \n" +
        "| |____  | |__| |  /  \\  | |____   _| |_     \\  /   \n" +
        " \\_____| |_____/  /_/\\_\\ |______| |_____|     \\/    ";

    assertEquals(expected, RomanPrinter.print(444));
    }
    @Test
    public void print499_ShouldReturnCDXCIX() {
    String expected =
        "  _____   ____    __  __   _____   _____  __  __\n" +
        " / ____| |  __ \\ \\ \\/ /  / ____| |_   _| \\ \\/ /\n" +
        "| |      | |  | |  \\  /  | |        | |    \\  / \n" +
        "| |      | |  | |   ><   | |        | |     ><  \n" +
        "| |____  | |__| |  /  \\  | |____   _| |_   /  \\ \n" +
        " \\_____| |_____/  /_/\\_\\  \\_____| |_____| /_/\\_\\";

    assertEquals(expected, RomanPrinter.print(499));
    }
    @Test
    public void print944_ShouldReturnCMXLIV() {
        String expected =
            "  _____   __  __  __  __  _        _____  __      __\n" +
            " / ____| |  \\/  | \\ \\/ / | |      |_   _| \\ \\    / /\n" +
            "| |      | \\  / |  \\  /  | |        | |    \\ \\  / / \n" +
            "| |      | |\\/| |   ><   | |        | |     \\ \\/ /  \n" +
            "| |____  | |  | |  /  \\  | |____   _| |_     \\  /   \n" +
            " \\_____| |_|  |_| /_/\\_\\ |______| |_____|     \\/    ";

        assertEquals(expected, RomanPrinter.print(944));
    }
    @Test(expected = IllegalArgumentException.class)    //FUORI BOUNDARY
    public void print_WithInputOutOfRange_ShouldThrowException() {
        int number = 0;
        RomanPrinter.print(number);
    }
    @Test(expected = IllegalArgumentException.class)
    public void print_WithInputOverMax() {
        int number = IntegerToRoman.upperLimit + 1;
        RomanPrinter.print(number);
    }
    @Test(expected = IllegalArgumentException.class)
    public void print_WithInputUnderMin() {
        int number = -1;
        RomanPrinter.print(number);
    }
}