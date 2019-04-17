
package Scripts;

import java.util.Stack;

public class Cuenta {
    private int numerocuenta;
    private String nombre;
    private int pin;
    private double saldo;
    private Stack<Movimiento> movimientos = new Stack<>();
   
    public int getNumerocuenta() {
        return numerocuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPin() {
        return pin;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void quitarDinero(int extraccion){
        this.saldo=this.saldo-extraccion;
        //String frase = "Extracción de "+extraccion+"€";
        //movimientos=frase;
    }

    public String getMovimientos() {
        String mov = "";
        for (int i = 0; i < movimientos.size(); i++)
            mov += movimientos.get(i).getMovimiento() + "/n";
        return mov;
    }

    public void setMovimientos(int cant, String conc) {
        Movimiento mov = new Movimiento(cant, conc);
        this.movimientos.add(mov);
    }   
}
