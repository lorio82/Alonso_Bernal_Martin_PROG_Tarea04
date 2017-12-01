
package arrays;

/**
 * Clase Triángulo que crea un objeto triángulo definido por sus tres vértices
 * (A,B y C).
 *
 * @author: Martín Alonso Bernal
 * @version: 11/2017
 */
public class Triangulo {
    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;
    private double x;
    private double y;
    
    /**
     * Método constructor Triangulo que recibe los parámetros verticeA, verticeB
     * y verticeC y les asigna como valor a cada uno de ellos una ocurrencia de
     * la clase Punto
     *
     * @param verticeA Punto
     * @param verticeB Punto
     * @param verticeC Punto
     */
    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
        this.verticeA = new Punto(x, y);
        this.verticeB = new Punto(x, y);
        this.verticeC = new Punto(x, y);
    }
    
    /**
     * Método que devuelve el valor de VerticeA.
     *
     * @return verticeA Punto Con sus coordenadas x,y
     */
    public Punto getVerticeA() {
        return verticeA;
    }

    /**
     * Método que devuelve el valor de VerticeB.
     *
     * @return verticeB Punto Con sus coordenadas x,y
     */
    public Punto getVerticeB() {
        return verticeB;
    }

    /**
     * Método que devuelve el valor de VerticeC.
     *
     * @return verticeC Punto Con sus coordenadas x,y
     */
    public Punto getVerticeC() {
        return verticeC;
    }   
}
