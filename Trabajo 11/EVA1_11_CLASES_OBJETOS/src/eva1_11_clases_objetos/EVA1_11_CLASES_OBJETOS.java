/*
DEMOSTRACIÓN DE PROGRAMACIÓN ORIENTADA A OBJETOS 
 */
package eva1_11_clases_objetos;

import CUALQUIER_NOMBRE.OtraClase;
import java.util.Scanner;

/**
 * @author Isela Alejandra Ponce de León Carrasco
 */
public class EVA1_11_CLASES_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); //Scanner es una clase || Input es un objeto.
        
        int iVal = 10;
            Ejemplo eMiObjetoEjem;
            eMiObjetoEjem = new Ejemplo();
            
            Ejemplo eObj2= new Ejemplo();
            
            Ejemplo eObj3;
            
            System.out.print(eMiObjetoEjem);
            
            OtraClase oOtroObj = new OtraClase();
    }

}
class Ejemplo {   //CATEGORIAS || creamos nuestro prpio tipo de datos llamado ejemplo || puedo crear varables de tipo ejemplo
int iVal = 10;
}
    


//Las clases se definen como tipos abstractos de datos
//