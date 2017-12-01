
package arrays;

import utilidades.Entrada;

/**
 * Clase Principal que solicita al usuario la introducción de un número de triángulos a generar, para devolver el 
 * valor de la media de los perímetros de todos los triángulos creados, cuantos triángulos están en la media 
 * o por encima y cuantos por debajo. También devolverá los valores de del triángulo de mayor perímetro y del que menor perímetro tenga.
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Principal {
    public static void main(String[] args) {
        final String ENUNCIADO = "Introduzca el número de triángulos que desee crear";
        Punto verticeA;
        Punto verticeB;
        Punto verticeC;
        double perimetroTotal = 0;
        double media = 0;
        
        System.out.printf(ENUNCIADO);
        int num = Entrada.entero();
        
        //Creamos un array de objetos punto formado por el número de triángulos que desamos crear
        Punto[] arrayPunto = new Punto[num];
        
        //Creamos un array de objetos triángulo formado por el número de triángulos que desamos crear
        Triangulo[] arrayTriangulo = new Triangulo[num];
        
        //En este for recorremos el arrayTriangulo
        for (int i = 0; i < arrayTriangulo.length; i++) {
            //Le asignamos a cada uno de los vértices una instancia de punto
            verticeA = arrayPunto[i];
            verticeB = arrayPunto[i];
            verticeC = arrayPunto[i];
            //Creamos una instancia de triángulo
            arrayTriangulo[i] = new Triangulo(verticeA, verticeB, verticeC);
            //Vamos sumando los distintos perímetros para obtener el perímetro total de todos los triángulos
            perimetroTotal += arrayTriangulo[i].getPerimetro();
            //Calculamos la media de los perímetros
            media = perimetroTotal / num;
            /* Con la siguiente línea vamos imprimiendo los valores de cada uno de los triángulos
            System.out.printf(i + 1 + arrayTriangulo[i].toString() + "Perimetro: " + arrayTriangulo[i].getPerimetro() + "%n");
            */
           
        }
    
    }
    
}
