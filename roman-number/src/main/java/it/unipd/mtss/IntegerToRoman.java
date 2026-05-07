////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException(
                    "Il numero deve essere compreso tra 1 e 3"); 
        }

        String roman = "";
        for (int i = 0; i < number; i++) {
            roman += "I";
        }
        return roman;
}
}