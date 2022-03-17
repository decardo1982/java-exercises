/* En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias
argentinas en el último mes. A partir de esta información, un noticiero desea determinar el top 5 de las
temperaturas más altas para poder mostrar en la pantalla de su programa, para ello se necesita un programa
que sea capaz de recorrer el vector de temperaturas, determinar las 5 más altas y copiarlas en un nuevo
vector de 5 posiciones
 */
package práctica.vectores.pkg4;
import java.util.*;
public class PrácticaVectores4 {

    public static void main(String[] args) {
        int temperaturas [] = new int [23];
        temperaturas[0] = 22; //"La Plata, Bs. As."
        temperaturas[1] = 26; //"S.F. del Valle de Catamarca, Catamarca"
        temperaturas[2] = 32; //"Resistencia, Chaco"
        temperaturas[3] = 21; //"Rawson, Chubut"
        temperaturas[4] = 22; //"Córdoba, Córdoba"
        temperaturas[5] = 23; //"Corrientes, Corrientes"
        temperaturas[6] = 22; //"Paraná, Entre Ríos"
        temperaturas[7] = 33; //"Formosa, Formosa"
        temperaturas[8] = 39; //"S.S. de Jujuy, Jujuy"
        temperaturas[9] = 25; //"Santa Rosa, La Pampa"
        temperaturas[10] = 37; //"La Rioja, La Rioja"
        temperaturas[11] = 34; //"Mendoza, Mendoza"
        temperaturas[12] = 26; //"Posadas, Misiones"
        temperaturas[13] = 23; //"Neuquén, Neuquén"
        temperaturas[14] = 27; //"Viedma, Río Negro"
        temperaturas[15] = 18; //"Salta, Salta"
        temperaturas[16] = 27; //"San Juan, San Juan"
        temperaturas[17] = 23; //"San Luis, San Luis"
        temperaturas[18] = 6; //"Río Gallegos, Santa Cruz"
        temperaturas[19] = 24; //"Santa Fe, Santa Fe"
        temperaturas[20] = 25; //"Santiago del Estero, Santiago del Estero"
        temperaturas[21] = 2; //"Ushuaia, Tierra del Fuego"
        temperaturas[22] = 22; //"S.M. de Tucumán, Tucumán"
        
        Arrays.sort(temperaturas);
        for (int i = temperaturas.length-1; i >=18; i--) {
            System.out.println(""+temperaturas[i]);
        }
    }
}