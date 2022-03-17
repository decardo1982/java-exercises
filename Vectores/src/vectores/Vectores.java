package vectores;

import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Vectores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = new int [4];
         //Asignación (manual)
         //vector[0]=2;
         //vector[1]=35;
         //vector[2]=48;
         //vector[3]=157;
         
         //Asignación (por teclado)
         Scanner teclado = new Scanner (System.in);
         for (int i=0; i<vector.length; i++) {
             System.out.println("Ingrese el valor para el índice " + i);
             vector[i] = teclado.nextInt();
         }
         
         //Recorrido
         for (int i=0; i<vector.length; i++) {
             System.out.println("Estoy en el índice: " + i);
             System.out.println("Tengo guardado un " + vector[i]);
             System.out.println("-----------------------");
        }
    }
    
}
