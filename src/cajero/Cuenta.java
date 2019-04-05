
package cajero;


public class Cuenta {
    private int numerocuenta;
    private String nombre;
    private int pin;
    private int saldo;
    private String movimientos;
    
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


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void quitarDinero(int extraccion){
        this.saldo=this.saldo-extraccion;
        //String frase = "Extracción de "+extraccion+"€";
        //movimientos=frase;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }
    
}
