////////////////////////////////////////////////////////////////////
// Simone Giuliano 2145591
// Stefano Sironi 2111037
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(final int number) {

        //errore nel caso in cui il valore sia fuori dal boundary
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException(
                    "Il numero deve essere compreso tra 1 e 6");
        }


        int[] values = {5, 4, 1};
        String[] symbols = {"V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int remaining = number;
        /*LOGICA:eseguo un ciclo for nel quale controllo se un valore è >= ad 
        uno dei simboli romani che ho per ora a disposizione (V, IV, I)
                (IV è trattato a parte perchè funziona per sottrazione). 
                Se il numero che ho è >= ad uno di questi, inserisco il numero 
                e poi sottraggo l'equivalente dal mio numero di partenza.
                Continuo il ciclo finchè il mio numero è > 0*/

        for (int i = 0; i < values.length; i++) {
            while (remaining >= values[i]) {
                roman.append(symbols[i]);
                remaining -= values[i];
            }
        }

        return roman.toString();
    }
}