/*
Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir de esta carga,
se desea otro vector que copie los mismos nombres pero en el orden inverso, es decir, si los nombres
son: perro, gato, lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el
cambio, mostrar por pantalla ambos vectores para compararlos.
 */
package práctica.vectores.pkg5;
import java.util.*;
public class PrácticaVectores5 {

    public static void main(String[] args) {
        int animales [] = new int [10];
        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese nombre de animal: " + i);
            animales[i] = teclado.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("En el índice " + i + " se encuentra un " + animales[i]);
            
        }

        
    }
    
}
