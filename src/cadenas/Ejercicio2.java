/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 * Clase Ejercicio2 que solicita al usuario que introduzca una matrícula y
 * si esta es correcta muestra las letras por un lado y los dígitos por otro.
 * En el caso de que la matrícula no fuese correcta informará del error.
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        final String ENUNCIADO = "Introduzca una matrícula%n";
        final String ERROR = "La matrícula introducida no es correcta.%n";

        System.out.printf(ENUNCIADO);

        String matricula = Entrada.cadena();
        
        matricula = matricula.replaceAll(" ", "");
        
        Pattern pat = Pattern.compile("(^E)([\\d]{4})([B-Z&&[^EIOU]]{3}$)");
        Matcher mat = pat.matcher(matricula);
      

            if (mat.find()){
            System.out.printf("Letras: " + mat.group(1) + mat.group(3) + "%nNúmeros:" + mat.group(2) + "%n");
            }
            else {
                System.err.printf(ERROR);
            }
    
}
}