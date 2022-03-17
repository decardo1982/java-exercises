/* Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un nombre
y en el tercero un apellido. Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO
TIEMPO y mostrar cada uno de estos datos por pantalla. Pista: tener en cuenta que el índice de cada
vector es correspondiente al índice de los demás, es decir, los datos contenidos en el índice cero del
vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.
 */
package práctica.vectores.pkg3;
import java.util.*;
public class PrácticaVectores3 {

    public static void main(String[] args) {
        int dni [] = new int [2];
        String nombre [] = new String[2];
        String apellido [] = new String[2];
        dni[0] = 29414783;
        dni[1] = 28627390;
        nombre[0] = "Dario";
        nombre[1] = "Cecilia";
        apellido[0] = "Cardozo";
        apellido[1] = "García";
        for (int i = 0; i < 2; i++) {
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Apellido: " + apellido[i]);
            System.out.println("D.N.I.: " + dni[i]);
            System.out.println("-------------------------");
            
        }

        
    }
    
}
