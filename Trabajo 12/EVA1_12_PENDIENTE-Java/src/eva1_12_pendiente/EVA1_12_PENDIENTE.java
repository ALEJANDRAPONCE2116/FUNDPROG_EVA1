//Calcular La Pendiente
package eva1_12_pendiente;

import java.util.Scanner;

/**
 *
 * @author Isela Alejandra Ponce de Le[on Carrasco
 */
public class EVA1_12_PENDIENTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // TODO code application logic here
        System.out.println("Calcular la pendiente");
        System.out.println("Ingrese P1");
        double p1;
        p1=input.nextDouble();
        
        System.out.println("Ingrese p2");
        double p2;
        p2=input.nextDouble();
        
        System.out.println("Ingrese q1");
        double q1;
        q1=input.nextDouble();
        
        System.out.println("Ingrese q2");
        double q2;
        q2=input.nextDouble();
        
        double m;
        m=(p2-p1)/(q2-q1);
        
        System.out.println("La pendiente es "+m);
    }
    
}
