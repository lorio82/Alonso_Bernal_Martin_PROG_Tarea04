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
    double distancia;

    /**
     * Método constructor Punto que recibe los parámetros x e y, y les asigna un
     * número aleatorio entre 1 y 100
     *
     * @param x double
     * @param y double
     */
    public Punto(double x, double y) {
        this.x = Math.random() * 100;
        this.y = Math.random() * 100;
    }

    /**
     * Método que devuelve el valor del número real almacenado en x.
     *
     * @return x double Coordenada x del punto
     */
    public double getX() {
        return x;
    }

    /**
     * Método que establece el valor del número real almacenado en x. Establece
     * un número aleatorio comprendido entre 1 y 100.
     *
     * @param x double Coordenada x del punto.
     */
    public void setX(double x) {
        this.x = Math.random() * 100;
    }

    /**
     * Método que devuelve el valor del número real almacenado en y.
     *
     * @return y double Coordenada y del punto
     */
    public double getY() {
        return y;
    }

    /**
     * Método que establece el valor del número real almacenado en y. Establece
     * un número aleatorio comprendido entre 1 y 100.
     *
     * @param y double Coordenada y del punto.
     */
    public void setY(double y) {
        this.y = Math.random() * 100;
    }

    /**
     * Método que establece la distancia entre este punto y otro punto aleatorio
     *
     * @param punto double.
     * @return distancia double
     */
    public double distancia(double punto) {

        distancia = Math.sqrt(Math.pow(punto - this.x, 2) + Math.pow(punto - this.y, 2));

        return distancia;
    }

    /**
     * Método que crea una cadena de caracteres con los valores de x e y.
     *
     * @return String Devuelve una cadena de caracteres con los valores de x e
     * y.
     */
    @Override
    public String toString() {
        return " x= " + x + ", y= " + y;
    }

}
