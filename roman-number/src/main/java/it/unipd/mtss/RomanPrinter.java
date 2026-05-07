////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(final int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(final String romanNumber) {
        // Rappresentazione ASCII delle lettere
        final String[] iLetter = {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        };

        final String[] vLetter = {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        };

        StringBuilder result = new StringBuilder();

        // Ciclo sulle 6 righe dell' ASCII
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char c = romanNumber.charAt(i);
                
                // Selezione del pezzo di riga corretto in base al carattere
                if (c == 'I') {
                    result.append(iLetter[row]);
                } else if (c == 'V') {
                    result.append(vLetter[row]);
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
}