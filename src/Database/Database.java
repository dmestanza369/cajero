/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Scripts.Cuenta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author d.mestanza.2017
 */
public class Database {
    ArrayList<Cuenta> DATABASE = new ArrayList<>();

    public Database() {
        //Añadir cuentas
        this.añadirCuenta(00000001, "ÁLVARO RÍO LÓPEZ", 1111, 459.32);
        this.añadirCuenta(00000002, "DAVID MESTANZA RUBIA", 2222, 48.25);
        this.añadirCuenta(00000003, "ALBERTO JÍMENEZ GÓMEZ", 3333, 435000.06);
        this.añadirCuenta(00000004, "CARLOTA MENÉNDEZ DEL CAMPO", 4444, 150.58);
        this.añadirCuenta(00000005, "AZAHARA ANDUJAR MUÑOZ-QUIRÓS", 5555, 333.33);
        this.añadirCuenta(00000006, "ENRIQUE MÁRQUEZ JIMENÉZ", 6666, 234.21);
        this.añadirCuenta(00000007, "MANUEL MARTÍN ALÁEZ", 7777, 300.10);
    }
    
    public void añadirCuenta(int numerocuenta, String nombre, int PIN, double saldo){
        Cuenta cuenta = new Cuenta();
        cuenta.setNumerocuenta(numerocuenta);
        cuenta.setNombre(nombre);
        cuenta.setPin(PIN);
        cuenta.setSaldo(saldo);
        this.DATABASE.add(cuenta);
    }
    
    public int buscarCuentaPIN(int PIN){
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getPin() == PIN){
                return DATABASE.get(i).getNumerocuenta();
            }
        }
        return -1;
    }
    
    public Cuenta buscarCuenta(int numerocuenta){
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getNumerocuenta()== numerocuenta)
                return DATABASE.get(i);
        }
        return null;
    }
    
    public int buscarCuentaNombre(String Nombre){
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getNombre()== Nombre){
                return DATABASE.get(i).getNumerocuenta();
            }
        }
        return -1;
    }
    
    public int moverSaldo(int numerocuenta, double cantidad, String concepto){
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getNumerocuenta() == numerocuenta){
                DATABASE.get(i).setSaldo(DATABASE.get(i).getSaldo() + cantidad);
                DATABASE.get(i).setMovimientos(cantidad, concepto);
                return DATABASE.get(i).getNumerocuenta();
            }
        }
        return -1;
    }

    public boolean isPINUnique(int PIN) {
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getPin() == PIN) return false;
        }
        return true;
    }
    
    public void setPIN(int numerocuenta, int PIN){
        for (int i = 0; i < DATABASE.size(); i++){
            if(DATABASE.get(i).getNumerocuenta()== numerocuenta)
                DATABASE.get(i).setPin(PIN);
                break;
        }
    }
}