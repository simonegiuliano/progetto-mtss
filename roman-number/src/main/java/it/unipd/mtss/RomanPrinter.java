////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    private static final String[] iLetter = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|",
    };
    private static final String[] vLetter = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    ",
    };
    private static final String[] xLetter = {
        "__  __",
        "\\ \\/ /",
        " \\  / ",
        "  ><  ",
        " /  \\ ",
        "/_/\\_\\",
    };
    private static final String[] lLetter = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|",
    };
    private static final String[] cLetter = {
        "  _____ ",
        " / ____|",
        "| |     ", 
        "| |     ", 
        "| |____ ", 
        " \\_____|",
    };

    private static final String[] dLetter = {
        " ____   ",
        "|  __ \\",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ ",
    };
    private static final String[] mLetter = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|",
    };


    public static String print(final int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(final String romanNumber) {
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char c = romanNumber.charAt(i);
        
                String[] letterArray = getLetterArray(c);
                if (letterArray != null) {
                    result.append(letterArray[row]);
                }

                if (i < romanNumber.length() - 1) {
                    result.append(" ");
                }
            }
            if (row < 5) {
                result.append("\n");
            }
        } 

        return result.toString(); 
    }
    
    /**
     * CAMBIO DI PARADIGMA:
     * dato che il codice precedente avrebbe ecceduto nella cyclomatic 
     * complexity, al posto di una setie di if else è stato inserito uno switch.
     */
    private static String[] getLetterArray(final char c) {
    return switch (c) {
        case 'I' -> RomanPrinter.iLetter;
        case 'V' -> RomanPrinter.vLetter;
        case 'X' -> RomanPrinter.xLetter;
        case 'L' -> RomanPrinter.lLetter;
        case 'C' -> RomanPrinter.cLetter;
        case 'D' -> RomanPrinter.dLetter;
        case 'M' -> RomanPrinter.mLetter;
        default -> null;
    };
}
    

    public static void main(String args[]) {
        System.out.println(
            RomanPrinter.printAsciiArt(IntegerToRoman.convert(49))
        );
    }
}
