
package Scripts;

import java.util.Scanner;


public class Pagos {
    
    
    public int opciones(){
        int cantidad=0;
        System.out.println("Que pago desea realizar:"+"\n"+"1.-Recibos"+"\n"+
                "2.-Cuotas"+"\n"+"3.-Impuestos");
        Scanner sc = new Scanner(System.in); 
        int opcion = sc.nextInt();
        if(opcion==1||opcion==2||opcion==3){
            System.out.println("Escriba la cantidad a pagar:");
            cantidad =sc.nextInt();
        }   
        return cantidad;
    }
}
