/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import GUIs.Cuenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Database.Database;

/**
 *
 * @author d.mestanza.2017
 */
public class CajeroController implements ActionListener{
    
    private Cuenta cuenta;
    private Database DB;

    public CajeroController(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public Cuenta validaPin(int password) {
        return DB.buscarCuenta(password);       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
