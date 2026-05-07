////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] iLetter = {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        };

        StringBuilder result = new StringBuilder();

        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char c = romanNumber.charAt(i);
                if (c == 'I') {
                    result.append(iLetter[row]);
                    // Inserisco uno spazio se non è l'ultima lettera
                    if (i < romanNumber.length() - 1) {
                        result.append(" ");
                    }
                }
            }
            if (row < 5) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}