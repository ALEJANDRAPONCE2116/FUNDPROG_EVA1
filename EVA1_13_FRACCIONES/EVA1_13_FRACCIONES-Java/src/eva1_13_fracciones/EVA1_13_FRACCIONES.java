/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_fracciones;

import java.util.Scanner; 

/**
 *
 * @author Isela Alejandra Ponce de Leon Carrasco
 */
public class EVA1_13_FRACCIONES {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        //Primera fraccion
        System.out.println("Ingresa el primer numerador");
        int numerador1;
        numerador1 = input.nextInt();
        
        System.out.println("Ingresa el primer denominador");
        int denominador1;
        denominador1 = input.nextInt();
        
        //Segunda fraccion
        System.out.println("Ingresa el segundo numerador");
        int numerador2;
        numerador2 = input.nextInt();
        
        System.out.println("Introduce el segundo denominador");
        int denominador2;
        denominador2 = input.nextInt();
        
        //Operaciones
        int suma; int resta; int multiplicacion; int division;
	int suma1; int resta1; int multiplicacion1; int division1;
        
        suma=(numerador1*denominador2 + denominador1*numerador2); 
	suma1=(denominador1*denominador2);
	
	resta=(numerador1*denominador2 - denominador1*numerador2);
	resta1=(denominador1*denominador2);
	
	multiplicacion=(numerador1 * numerador2); 
	multiplicacion1=(denominador1 * denominador2);
	
	division=(numerador1 * denominador2);
	division1=(denominador1*numerador2);
       
        //Salida
        System.out.println("La suma de las fracciones es "+suma+"/"+suma1);
        System.out.println("La resta de las fracciones es "+resta+"/"+resta1);
        System.out.println("La multiplicacion de las fracciones es "+multiplicacion+"/"+multiplicacion1);
        System.out.println("La division de las fracciones es "+division+"/"+division1);
    }
}
