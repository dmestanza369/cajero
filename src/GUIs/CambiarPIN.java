/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Database.CajeroController;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author a.jimenezg.2017
 */
public class CambiarPIN extends javax.swing.JPanel {
    private int numeroCuenta;
    private Cajero cajero;
    private CajeroController controller;
    /**
     * Creates new form CambiarPIN
     */
    public CambiarPIN(Cajero cajero,int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numeroCuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel1.setFont(Consolas24);
        jLabel1.setText("CAMBIAR PIN");
        
        jLabel2.setFont(Consolas20);
        jLabel2.setText("PIN ACTUAL");
        
        jLabel3.setFont(Consolas20);
        jLabel3.setText("NUEVO PIN");
        
        jLabel4.setFont(Consolas20);
        jLabel4.setText("CONFIRMAR NUEVO PIN");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
        
        jButton2.setFont(Consolas20);
        jButton2.setText("SALIR");
        
        jPasswordField1.setFont(Consolas20);
        jPasswordField2.setFont(Consolas20);
        jPasswordField3.setFont(Consolas20);
    
    }
    
    private boolean ComprobarCampos(){
        if (jPasswordField1.getText().length()!=0) return true;
        if (jPasswordField2.getText().length()!=0) return true;
        if (jPasswordField3.getText().length()!=0) return true;
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(3, 1));

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1);

        jPanel1.add(jPanel4);
        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel6);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel2.setText("jLabel2");
        jPanel7.add(jLabel2);

        jPasswordField1.setMinimumSize(new java.awt.Dimension(100, 24));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel7.add(jPasswordField1);

        jPanel2.add(jPanel7);

        jLabel3.setText("jLabel2");
        jPanel11.add(jLabel3);

        jPasswordField2.setMinimumSize(new java.awt.Dimension(100, 24));
        jPasswordField2.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel11.add(jPasswordField2);

        jPanel2.add(jPanel11);

        jLabel4.setText("jLabel2");
        jPanel16.add(jLabel4);

        jPasswordField3.setMinimumSize(new java.awt.Dimension(100, 24));
        jPasswordField3.setPreferredSize(new java.awt.Dimension(100, 30));
        jPasswordField3.setVerifyInputWhenFocusTarget(false);
        jPanel16.add(jPasswordField3);

        jPanel2.add(jPanel16);

        add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jPanel17.setLayout(new java.awt.GridLayout(3, 1));
        jPanel3.add(jPanel17);

        jPanel21.setLayout(new java.awt.GridLayout(1, 0));
        jPanel21.add(jPanel8);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel9.add(jButton1);

        jPanel21.add(jPanel9);

        jButton2.setText("jButton1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel10.add(jButton2);

        jPanel21.add(jPanel10);

        jPanel3.add(jPanel21);

        jPanel32.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel32);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if (ComprobarCampos()){
            int contraseña1 = Integer.parseInt(String.valueOf(jPasswordField1.getPassword()));
            int contraseña2 = Integer.parseInt(String.valueOf(jPasswordField2.getPassword()));
            int contraseña3 = Integer.parseInt(String.valueOf(jPasswordField3.getPassword()));
            if(this.controller.getPin(numeroCuenta) == contraseña1){
                if(contraseña3 == contraseña2){
                    if(this.controller.isPINUnique(contraseña3)){
                        if(Integer.toString(contraseña2).length() == 4 && Integer.toString(contraseña3).length() == 4){
                            this.controller.setPin(numeroCuenta, contraseña3);            
                            this.setVisible(false);
                            cajero.activarOtraOperacion();
                        } else JOptionPane.showMessageDialog(this, "ERROR: El nuevo PIN no tiene 4 dígitos.");
                    } else JOptionPane.showMessageDialog(this, "ERROR: Este PIN ya existe o es el mismo.");
                } else JOptionPane.showMessageDialog(this, "ERROR: Los campos no coinciden.");
            } else JOptionPane.showMessageDialog(this, "ERROR: PIN incorrecto.");
        } else JOptionPane.showMessageDialog(this, "ERROR: Hay campos vacíos.");
        
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jPasswordField3.setText("");
            
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        cajero.activarMenuPrincipal();
        
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jPasswordField3.setText("");
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
