//Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
//Realizar un programa que permita la carga por teclado de los 10 números solicitados.

package práctica.vectores.pkg1;

import java.util.*;

public class PrácticaVectores1 {

    public static void main(String[] args) {
        int numeros [] = new int [10];
        Scanner teclado = new Scanner (System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el valor para el índice " + i);
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El índice " + i + " contiene el número " + numeros[i]);
        }
    }
}
