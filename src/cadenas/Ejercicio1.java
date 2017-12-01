
package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 * Clase Ejercicio1 que solicita al usuario que introduzca una palabra y
 * devuelve si esta palabra es panvocálica o no.
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        final String ENUNCIADO = "Introduzca una palabra y pulse enter para saber si es panvocálica";

        System.out.printf(ENUNCIADO);
        String palabra = Entrada.cadena();

        Pattern pat = Pattern.compile("[.*a{1,}.*e{1,}.*i{1,}.*o{1,}.*u{1,}.*]");
        Matcher mat = pat.matcher(palabra);

        if (mat.find()) {
            System.out.printf("Es panvocálica");
        } else {
            System.out.printf("No es panvcálica");
        }
    }
    
}
