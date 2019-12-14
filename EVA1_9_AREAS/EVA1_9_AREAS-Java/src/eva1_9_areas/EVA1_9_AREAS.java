/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_areas;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA1_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
Scanner input = new Scanner(System.in);        
System.out.print("Vamos a calcular el area de un trapecio");
System.out.print("Ingrese la Base Mayor");
float Bmayor;
Bmayor=input.nextFloat();

System.out.print("Ingrese la Base Menor");
float Bmenor;
Bmenor=input.nextFloat();

System.out.print("Ingrese la Altura");
float Altura;
Altura=input.nextFloat();

float Area;
Area = Bmayor*Bmenor/2*Altura;

System.out.print("El area del trapecio es de"+Area);
    }
    
}
