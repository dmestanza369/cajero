/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Database.Database;

/**
 *
 * @author d.mestanza.2017
 */
public class CajeroController{
    
    private Database DB = new Database();
    
    public int validaPin(int PIN) {  
        return DB.buscarCuentaPIN(PIN);
    }
    
    public int moverSaldo(int numerocuenta, double saldo, String concepto){
        return DB.moverSaldo(numerocuenta, saldo, concepto);
    }
    
    public double getSaldo(int numerocuenta){
        return DB.buscarCuenta(numerocuenta).getSaldo();
    }
    
    public String getStringMovimientos(int numerocuenta){
        return DB.buscarCuenta(numerocuenta).getMovimientos();
    }
    
    public boolean isPINUnique(int PIN){
        return DB.isPINUnique(PIN);
    }
    
    public int getPin(int numerocuenta){
        return DB.buscarCuenta(numerocuenta).getPin();
    }
    
    public void setPin(int numerocuenta, int PIN){
        DB.setPIN(numerocuenta, PIN);
    }
    
    public boolean existeCuenta(int numerocuenta){
        return (DB.buscarCuenta(numerocuenta) != null);
    }
    
    public boolean haySaldo(int numerocuenta, double retirada){
        return getSaldo(numerocuenta) >= retirada;
    }
    
    public String getNombre(int cuenta){
        return DB.buscarCuenta(cuenta).getNombre();
    }
    
    public int getNumerocuenta (String nombre){
        return DB.buscarCuentaNombre(nombre);
    }
}
