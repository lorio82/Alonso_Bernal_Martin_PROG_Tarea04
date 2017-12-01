/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        System.out.printf(ENUNCIADO);
        int num = Entrada.entero();
        
        //Creamos un array de objetos punto formado por el número de triángulos que desamos crear
        Punto[] arrayPunto = new Punto[num];
        
        //Creamos un array de objetos triángulo formado por el número de triángulos que desamos crear
        Triangulo[] arrayTriangulo = new Triangulo[num];
    
    }
    
}
