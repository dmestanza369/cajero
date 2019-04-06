
package GUIs;

import java.util.Scanner;


public class CajeroStatic {

    public static final String rojo = "\u001B[31m";  
    public static String getStringInColor(String color, String txt){
        return color+txt;
    }
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta();
        cuenta1.setNombre("Alvaro Rio");
        cuenta1.setNumerocuenta(0);
        char[] pin = new char[4];
        for (int i = 0; i < 4; i++){
            pin[i] = 1;
        }
        cuenta1.setPin(pin);
        cuenta1.setSaldo(600);
        cuenta1.setMovimientos("Movimientos:"+"\n");
        Contraseñas contraseña1 = new Contraseñas();
        IngresarDinero ingresardinero1 = new IngresarDinero();
        Pagos pagos1 = new Pagos();
        RecargarTelefono recargartelefono1 = new RecargarTelefono();
        RetirarDinero retirardinero1 = new RetirarDinero();
        Transacciones transacciones1 = new Transacciones();
        ValidarDinero validar1 = new ValidarDinero();
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Seleccione que desea hacer:");
        System.out.println("1 - Cambiar contraseña"+"\n"+"2 - Ingresar dinero"+"\n" +"3 - Obtencion de movimientos");
        System.out.println("4 - Pagos"+"\n"+"5 - Recargar Telefono"+"\n"+"6 - Retirar dinero");
        System.out.println("7 - Transacciones"+"\n"+"8 - Validar dinero"+"\n"+"9.-Salir"+"\n");
        int numero = 0;

        do{
                               
        numero = sc.nextInt();
        if (numero==0){
            System.out.println("Seleccione que desea hacer:");
            System.out.println("1 - Cambiar contraseña"+"\n"+"2 - Ingresar dinero"+"\n" +"3 - Obtencion de movimientos");
            System.out.println("4 - Pagos"+"\n"+"5 - Recargar Telefono"+"\n"+"6 - Retirar dinero");
            System.out.println("7 - Transacciones"+"\n"+"8 - Validar dinero"+"\n"+"9.-Salir"+"\n");
        }
        if(numero==1){
        System.out.println("Su contraseña actual es: "+cuenta1.getPin());
           char[] nueva = new char[4];
           cuenta1.setPin(nueva);          
           //String frase = cuenta1.getMovimientos()+"Cambio de contraseña realizado";
           //cuenta1.setMovimientos(frase+"\n");
        }
        if(numero==2){
            System.out.println("Saldo actual: "+cuenta1.getSaldo());
            int dinero=ingresardinero1.sumardinero();
            cuenta1.setSaldo(cuenta1.getSaldo()+dinero);
            System.out.println("Saldo despues del ingreso: "+cuenta1.getSaldo());
            String extension = cuenta1.getMovimientos()+"Ingreso de dinero realizado +"+dinero+"€"+"\n";
            cuenta1.setMovimientos(extension);
        }
        if(numero==3){
            System.out.println(cuenta1.getMovimientos());
        }
        if(numero==4){
          int cantidad=pagos1.opciones();
          cuenta1.quitarDinero(cantidad);
          String frasepago=CajeroStatic.getStringInColor(CajeroStatic.rojo,"Pago realizado -"+cantidad+"€"+"\n"); 
          String extension2=cuenta1.getMovimientos()+frasepago;
          cuenta1.setMovimientos(extension2);
        }
        if(numero==5){
            String telefono = recargartelefono1.pedirnumero();
            if(!telefono.equals("0")){
              recargartelefono1.sms();
                boolean comprobacion = recargartelefono1.comprobar();
                if (comprobacion==false){
                 System.out.println("Los codigos no coinciden, recarga cancelada");
                }   else {
                    int dinerorecarga= recargartelefono1.recargar();
                    System.out.println("El saldo actual de su telefono es:"+"\n"+"Lo que tuvieras + "+dinerorecarga);
                }  
            }
            
        }
        if(numero==6){
           int retirar=retirardinero1.hacer();
           cuenta1.setSaldo(cuenta1.getSaldo()-retirar);
           System.out.println("Saldo actual de la cuenta: "+cuenta1.getSaldo());
           String frasepago1=CajeroStatic.getStringInColor(CajeroStatic.rojo,"Extracción de dinero realizada -"+retirar+"€"+"\n"); 
           String extension3=cuenta1.getMovimientos()+frasepago1;
           cuenta1.setMovimientos(extension3);
        }
       
        if(numero==7){
            int dinerotrans=transacciones1.hacer();
            cuenta1.setSaldo(cuenta1.getSaldo()-dinerotrans);
            String frasepago2=CajeroStatic.getStringInColor(CajeroStatic.rojo,"Transacción de dinero realizada -"+dinerotrans+"€"+"\n"); 
            String extension4=cuenta1.getMovimientos()+frasepago2;
            cuenta1.setMovimientos(extension4);
        }
        if(numero==8){
            
        }
        if(numero==9){
            System.out.println("Muchas gracias, hasta luego! :)");
            System.exit(0);
        }
        System.out.println("\n"+"Si desea continuar escriba el numero de la opción"+"\n"+
                "Mostrar opciones = 0"+"\n"+"Salir = 9"+"\n");
        } while(numero<10 && numero>-1);
    }
}