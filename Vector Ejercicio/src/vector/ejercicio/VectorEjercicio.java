package vector.ejercicio;

import java.util.Scanner;

public class VectorEjercicio {

    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        for (int i=0; i<15; i++) {
            System.out.println("Ingrese el valor para el índice " + i);
            vector[i] = teclado.nextInt();
        }
        
        //reorrer y contar cuántos números 3 hay
        int cont = 0;
        for (int i=0; i<15; i++) {
            if (vector[i] == 3) {
                cont = cont + 1;
            }
            
        }

        System.out.println("La cantidad de números 3 que hay en el vector es: " + cont);
    }
    
}
