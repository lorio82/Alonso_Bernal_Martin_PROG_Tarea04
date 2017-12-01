
package arrays;

/**
 * Clase Punto que crea un objeto punto definido por unas coordenadas x,y.
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Punto {
    private double x;
    private double y;
    
    /**
     * Método constructor Punto que recibe los parámetros x e y, y les asigna un número aleatorio entre 1 y 100
     * @param x double
     * @param y double
    */
    public Punto(double x, double y) {
        this.x = Math.random()*100;
        this.y = Math.random()*100;
    }
    
}
