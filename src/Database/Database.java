/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import GUIs.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author d.mestanza.2017
 */
public class Database {
    ArrayList<Cuenta> DATABASE = new ArrayList<>();
    
    private void insertarCuentas() {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumerocuenta(00000001);
        cuenta1.setNombre("Álvaro Río López");
        cuenta1.setPin(1111);
        cuenta1.setSaldo(459.32);
        this.DATABASE.add(cuenta1);
        
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumerocuenta(00000002);
        cuenta2.setNombre("David Mestanza Rubia");
        cuenta2.setPin(2222);
        cuenta2.setSaldo(48.25);
        this.DATABASE.add(cuenta2);
        
        Cuenta cuenta3 = new Cuenta();
        cuenta3.setNumerocuenta(00000003);
        cuenta3.setNombre("Alberto Jiménez Gómez");
        cuenta3.setPin(3333);
        cuenta3.setSaldo(0.01);
        this.DATABASE.add(cuenta3);
        
        Cuenta cuenta4 = new Cuenta();
        cuenta4.setNumerocuenta(00000004);
        cuenta4.setNombre("Carlota Menéndez del Campo");
        cuenta4.setPin(4444);
        cuenta4.setSaldo(150.58);
        this.DATABASE.add(cuenta4);
        
        Cuenta cuenta5 = new Cuenta();
        cuenta5.setNumerocuenta(00000005);
        cuenta5.setNombre("Azahara Andújar Muñoz-Quirós");
        cuenta5.setPin(5555);
        cuenta5.setSaldo(333.33);
        this.DATABASE.add(cuenta5);
        
        Cuenta cuenta6 = new Cuenta();
        cuenta6.setNumerocuenta(00000006);
        cuenta6.setNombre("Enrique Márquez Jiménez");
        cuenta6.setPin(6666);
        cuenta6.setSaldo(23400.21);
        this.DATABASE.add(cuenta6);
        
        Cuenta cuenta7 = new Cuenta();
        cuenta7.setNumerocuenta(00000007);
        cuenta7.setNombre("Manuel Martín Aláez");
        cuenta7.setPin(7777);
        cuenta7.setSaldo(300.10);
        this.DATABASE.add(cuenta7);
    }
    
    public Cuenta buscarCuenta(int PIN){
        Cuenta cuenta = new Cuenta();
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getPin() == PIN){
                cuenta = DATABASE.get(i);
                break;
            }
        }
        return cuenta;
    }
    
}

