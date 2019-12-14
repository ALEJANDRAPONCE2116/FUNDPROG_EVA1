/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVA1_7_TIPOS_PRIMITIVOS;

import java.util.Scanner;

/**
 *
 * @author Isela Alejandra Ponce de León Carrasco
 */
public class EVA1_7_TIPOS_PRIMITIVOS {
    private static final 
            Scanner input = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre ");
        String nombre;
        
        nombre = input.nextLine ();
        System.out.print("ingresa tu edad ");
        int edad;
        
        edad = input.nextInt();
        edad = 2018 - edad;
        
        System.out.print("Tu nombre es " + nombre);
        System.out.print(" Tu fecha de nacimiento es  " + edad);
    }
    
}
