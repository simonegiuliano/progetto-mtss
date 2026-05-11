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
        "________",
        "|  ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|",
    };


    public static String print(final int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(final String romanNumber) {
        StringBuilder result = new StringBuilder();

        // Ciclo sulle 6 righe dell' ASCII
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char c = romanNumber.charAt(i);
                // Selezione del pezzo di riga corretto in base al carattere
                if (c == 'I') {
                    result.append(RomanPrinter.iLetter[row]);
                } else if (c == 'V') {
                    result.append(RomanPrinter.vLetter[row]);
                } else if (c == 'X') {
                    result.append(RomanPrinter.xLetter[row]);
                } else if (c == 'L') {
                    result.append(RomanPrinter.lLetter[row]);
                } else if (c == 'C'){
                    result.append(RomanPrinter.cLetter[row]);
                }
                // Inserisco uno spazio
                if (i < romanNumber.length() - 1) {
                    result.append(" ");
                }
            }
            // Aggiungo l'andata a capo
            if (row < 5) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        System.out.println(
            RomanPrinter.printAsciiArt(IntegerToRoman.convert(49))
        );
    }
}
