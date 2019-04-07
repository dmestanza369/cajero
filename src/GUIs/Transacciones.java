                                                                       
package GUIs;

import java.util.Scanner;


public class Transacciones {
    
    Scanner sc= new Scanner(System.in);
    
    public int hacer(){
        System.out.println("Escriba el nombre del destinatario");
        String nombre = sc.nextLine();
        System.out.println("Escriba la cantidad a de dinero a enviar");
        int cantidad = sc.nextInt();        
        System.out.println("Transacción realizada con exito a "+nombre+" con un valor de "+cantidad);
        return cantidad;
    }
}

