

package cajero;

import java.util.Scanner;


public class Contraseñas {

    public Contraseñas() {
       
    }
    public int Cambio(){

        System.out.println("Escriba nueva contraseña, recuerde que tienen que ser 4 numeros");   
        Scanner sc1 = new Scanner(System.in);
        String nueva = sc1.nextLine();
        int nuevatam=nueva.length();
        System.out.println("Confirme la contraseña");
        String nueva1 = sc1.nextLine();
        int nueva1tam = nueva1.length();
        boolean conf=true;
        if (nueva1tam!=nuevatam || nueva1tam!=4 || nuevatam!=4){
            System.out.println("Error: no tiene 4 digitos");
            conf=false;
        }
       
        if (!nueva.equals(nueva1)){
            System.out.println("Error: Las contraseñas no coinciden");
            conf=false;
        } if(conf==true) {
                System.out.println("Cambio guardado");
            }
        
        return Integer.parseInt(nueva);
    }
}
