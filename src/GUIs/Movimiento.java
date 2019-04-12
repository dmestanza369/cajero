/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.text.DecimalFormat;

/**
 *
 * @author d.mestanza.2017
 */
public class Movimiento {
    private double cantidad;
    private String concepto;

    public Movimiento(double cantidad, String concepto) {
        this.cantidad = cantidad;
        this.concepto = concepto;
    }
    
    public String getMovimiento(){
        DecimalFormat df = new DecimalFormat("#####.##");
        if (this.cantidad == 0)
            return this.concepto;
        else return this.concepto + ": " + df.format(this.cantidad);
    };
}
