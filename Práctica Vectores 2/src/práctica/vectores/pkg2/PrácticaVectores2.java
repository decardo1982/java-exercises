/*
En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
Se desea un programa que sea capaz de determinar cuál es la mayor edad
y cuál es la menor edad que se encuentra entre los estudiantes.
 */
package práctica.vectores.pkg2;
import java.util.*;
public class PrácticaVectores2 {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 100;
        int edades [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese edad para el índice " + i);
            edades[i] = teclado.nextInt();
            if (edades[i]>mayor) {
                mayor = edades[i];                
            }
            if  (edades[i]<menor) {
                menor = edades[i];
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("El alumno " + i + " tiene " + edades[i] + " años.");
        }
            System.out.println("--------------------------------------");
            System.out.println("El alumno de mayor edad tiene " + mayor + " años.");
            System.out.println("--------------------------------------");
            System.out.println("El alumno de menor edad tiene " + menor + " años.");
    }
}
