package arrays;

import utilidades.Entrada;

/**
 * Clase Principal que solicita al usuario la introducción de un número de
 * triángulos a generar, para devolver el valor de la media de los perímetros de
 * todos los triángulos creados, cuantos triángulos están en la media o por
 * encima y cuantos por debajo. También devolverá los valores de del triángulo
 * de mayor perímetro y del que menor perímetro tenga.
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
        double perimetroMayor = 0;
        double perimetroMenor = 0;
        double media = 0;
        int contMayor = 0;
        int contMenor = 0;
        double comparaMayor = 0;
        double comparaMenor = 1000;
        String trianguloMayor = "";
        String trianguloMenor = "";
        int numero = 0;
        int numeroMin = 0;

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
        //En este for calculamos cuantos triángulos tienen un perimtro igual o mayor que la media y cuantos tienen un perímetro menor.
        for (int i = 0; i < arrayTriangulo.length; i++) {

            if (media < arrayTriangulo[i].getPerimetro()) {
                contMayor++;
            } else {
                contMenor++;
            }
            //Con este if comparamos cada uno de los perímetros para quedarnos con el perímetro de mayor tamaño 
            if (arrayTriangulo[i].getPerimetro() >= comparaMayor) {
                comparaMayor = arrayTriangulo[i].getPerimetro();
            }
        }
        //Con este for recorremos de nuevo el array de triángulos para quedarnos con el perímetro de menor tamaño
        for (int i = 0; i < arrayTriangulo.length; i++) {
            if (arrayTriangulo[i].getPerimetro() < comparaMenor) {
                comparaMenor = arrayTriangulo[i].getPerimetro();
            }
        }
        //Recorremos de nuevo el array de triángulos para quedarnos con el triángulo cuyo perímetro es igual al de mayor tamaño.
        for (int i = 0; i < arrayTriangulo.length; i++) {
            if (arrayTriangulo[i].getPerimetro() == comparaMayor) {
                trianguloMayor = arrayTriangulo[i].toString();
                perimetroMayor = arrayTriangulo[i].getPerimetro();
                numero = i + 1;
            }
        }
        //Recorremos de nuevo el array de triángulos para quedarnos con el triángulo cuyo perímetro es igual al de menor tamaño.
        for (int i = 0; i < arrayTriangulo.length; i++) {

            if (arrayTriangulo[i].getPerimetro() == comparaMenor) {
                trianguloMenor = arrayTriangulo[i].toString();
                perimetroMenor = arrayTriangulo[i].getPerimetro();
                numeroMin = i + 1;
            }
        }

        System.out.printf("La suma de todos los perímetros es %f. Y la media de los perimetros es%f%n"
                + "Hay %d triángulo/s con un perímetro superior o igual a la media.%nHay %d triángulo/s con "
                + "un perímetro menor a la media."
                + "%nEl triángulo con el perímetro mayor es el número %d%n%s%nCon un perímetro de %f"
                + "%nEl triángulo con el perímetro menor es el número %d%n%s%nCon un perímetro de %f",
                perimetroTotal, media, contMayor, contMenor, numero, trianguloMayor,perimetroMayor, numeroMin, trianguloMenor,perimetroMenor);
    }

}
