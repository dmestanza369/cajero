
package cajero;

import java.util.Scanner;


public class RetirarDinero{
    
    public RetirarDinero() {
    }
        
    public int hacer(){
        System.out.println("Escriba la cantidad que desea retirar:");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        return cantidad;
    }

}
    
