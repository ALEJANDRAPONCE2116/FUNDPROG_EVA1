/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA_5_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu Nombre");
        String sNombre; //DECLARANDO
        Scanner sInput; //DECLARANDo || Es una instrucción poara leer datos del teclado
                                      //Se crean con la variable new
        sInput = new Scanner (System.in);
        
        
        //Scanner sInput2 = new Scanner (System.in);
        //int iVal = 10;
        
        sNombre = sInput.nextLine(); //Se ejecuta cuando el usuario da enter
        System.out.print("Tu nombre es " + sNombre);
        
    }
    
}
