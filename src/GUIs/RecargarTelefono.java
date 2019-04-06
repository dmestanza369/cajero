
package GUIs;

import java.util.Scanner;


public class RecargarTelefono {
 
    int codigo= (int) (Math.random()*9999+1); 
    Scanner sc = new Scanner(System.in); 
    
    public String pedirnumero (){
        System.out.println("Escriba el numero de telefono que desea recargar:");
        String telf=sc.next();
        int tamaño=telf.length();
        if (tamaño!=9){
            System.out.println("El numero de telefono escrito no coincide con ningún telefono :,(");
            telf="0";
        }
        return telf;
    }
   
    public void sms (){
        System.out.println("Le hemos enviado un sms con el codigo de verificación");
        System.out.println("              ------------------------");
        System.out.println("              |         "+codigo+"          |");
        System.out.println("              ------------------------");
    }
   public boolean comprobar (){
       System.out.println("Escriba el codigo de verificación");
       int codigo1=sc.nextInt();
       if (codigo1==codigo){
           System.out.println("Codigo correcto :)");
           return true;
       } else {
           return false;
       }
   }
   public int recargar(){
       System.out.println("Escriba la cantidad a recargar");
       int dinero=sc.nextInt();
       return dinero;
   }
}
