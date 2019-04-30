/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Database.CajeroController;
import Scripts.Cuenta;

import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author d.mestanza.2017
 */
public class Cajero extends javax.swing.JFrame {

    private CajeroController controller;
    private int numerocuentaactiva;
    private int PIN = 0;
    private boolean isCorrect = false; 
    
    MenuPrincipal menuprincipal;
    OtraOperación otraoperacion;
    SacarDinero sacardinero;
    IngresarDinero ingresardinero;
    Transacciones transacciones;
    CambiarPIN cambiarpin;
    Pagos pagos;
    Movimientos movimientos;
    RecargarTelefono recargartelefono;
    
    public Cajero() {
        this.controller = new CajeroController();

        this.setTitle("Cajero"); //Título de la ventana
        this.setVisible(true);
 
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        initComponents();
        this.setSize(1000, 600);
        
        //Versión
        jLabel2.setFont(Consolas20);
        jLabel2.setText("Versión 1.0");
        
        //PIN
        jLabel1.setFont(Consolas24);
        jLabel1.setText("ESCRIBA SU PIN:");
        jPasswordField1.setFont(Consolas24);
        jPasswordField1.setEchoChar('*');
        jPasswordField1.setText("");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        jPasswordField1.setToolTipText("");
        jPasswordField1.setActionCommand("<Not Set>");
        jPasswordField1.setAutoscrolls(false);
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(66, 40));
        jPanel1.add(jPasswordField1);

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel3.add(jButton1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(jPasswordField1.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "ERROR: Debe escribir algún PIN");
        }else {      
            if (jPasswordField1.getPassword().length == 4){
                char[] textoC = jPasswordField1.getPassword();
                String contraseña = new String(textoC);
                PIN = Integer.parseInt(contraseña);
            }
            numerocuentaactiva = this.controller.validaPin(PIN);
            setCuentas();
            jPasswordField1.setText("");
        
            if (numerocuentaactiva != -1){
                this.jPanel2.setVisible(false);
                this.jPanel3.setVisible(false);
                this.jPanel4.setVisible(false);
                menuprincipal.setVisible(true);
        } else JOptionPane.showMessageDialog(this, "ERROR: PIN inexistente o no es un número"); }    
    }//GEN-LAST:event_jButton1MousePressed

    private void setCuentas() {
        this.menuprincipal = new MenuPrincipal(this);
        this.otraoperacion = new OtraOperación(this,numerocuentaactiva);
        this.sacardinero = new SacarDinero(this, numerocuentaactiva);
        this.ingresardinero = new IngresarDinero(this, numerocuentaactiva);
        this.transacciones = new Transacciones(this,numerocuentaactiva);
        this.cambiarpin = new CambiarPIN(this, numerocuentaactiva);
        this.pagos = new Pagos(this, numerocuentaactiva);
        this.movimientos = new Movimientos(this,numerocuentaactiva);
        this.recargartelefono = new RecargarTelefono(this,numerocuentaactiva);
        
        this.getContentPane().add(menuprincipal);
        this.getContentPane().add(otraoperacion);
        this.getContentPane().add(sacardinero);
        this.getContentPane().add(ingresardinero);
        this.getContentPane().add(transacciones);
        this.getContentPane().add(cambiarpin);
        this.getContentPane().add(pagos);
        this.getContentPane().add(movimientos);
        this.getContentPane().add(recargartelefono);
        
        menuprincipal.setVisible(false);
        otraoperacion.setVisible(false);
        sacardinero.setVisible(false);
        ingresardinero.setVisible(false);
        transacciones.setVisible(false);
        cambiarpin.setVisible(false);
        pagos.setVisible(false);
        movimientos.setVisible(false);
        recargartelefono.setVisible(false);
    }
    
    public void elegirSubmenu(int eleccion){
        switch(eleccion){
            case 1:
                ingresardinero.setVisible(true);
                break;
            case 2:
                sacardinero.setVisible(true);
                break;
            case 3:
                transacciones.setVisible(true);
                break;
            case 4:
                movimientos.addMovimientos();
                movimientos.setVisible(true);
                break;
            case 5:
                pagos.setVisible(true);
                break;
            case 6:
                cambiarpin.setVisible(true);
                break;
            case 7:
                recargartelefono.setVisible(true);
                break;
            case 8:
                this.jPanel2.setVisible(true);
                this.jPanel3.setVisible(true);
                this.jPanel4.setVisible(true);
                break;
        }
    }
    
    public void activarMenuPrincipal(){
        this.menuprincipal.setVisible(true);
    }
    
    public void activarOtraOperacion(){
        this.otraoperacion.setVisible(true);   
    }
    
    public CajeroController getController() {
        return controller;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero();
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
