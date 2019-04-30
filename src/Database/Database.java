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
        this.añadirCuenta(00000001, "Álvaro Río López", 1111, 459.32);
        this.añadirCuenta(00000002, "David Mestanza Rubia", 2222, 48.25);
        this.añadirCuenta(00000003, "Alberto Jiménez Gómez", 3333, 0.01);
        this.añadirCuenta(00000004, "Carlota Menéndez del Campo", 4444, 150.58);
        this.añadirCuenta(00000005, "Azahara Andújar Muñoz-Quirós", 5555, 333.33);
        this.añadirCuenta(00000006, "Enrique Márquez Jiménez", 6666, 234.21);
        this.añadirCuenta(00000007, "Manuel Martín Aláez", 7777, 300.10);
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