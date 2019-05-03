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
 * @author kikem
 */
public class IngresarDinero extends javax.swing.JPanel {

    private int numeroCuenta;
    private Cajero cajero;
    private CajeroController controller;
    
    public IngresarDinero(Cajero cajero, int cuenta) {
        initComponents();
        this.cajero = cajero;
        this.setSize(1000, 600);
        this.numeroCuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel1.setFont(Consolas24);
        jLabel1.setText("INGRESAR DINERO");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
        
        jButton2.setFont(Consolas20);
        jButton2.setText("SALIR");
        
        jTextField1.setFont(Consolas20);
        jTextField1.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridLayout(1, 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel4);

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel7.add(jButton2);

        jPanel5.add(jPanel7);

        add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.setMinimumSize(new java.awt.Dimension(200, 50));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel6.add(jTextField1);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel8.add(jButton1);

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double ingresar = -1;
        if(jTextField1.getText().length()!=0){//error campo vacio
            ingresar = Double.parseDouble(jTextField1.getText());
            if(ingresar > 0){
                this.controller.moverSaldo(numeroCuenta, ingresar,"INGRESO");
                this.setVisible(false);
                jTextField1.setText(null);
                this.cajero.activarOtraOperacion();
                jTextField1.setText("");
            }else JOptionPane.showMessageDialog(this, "ERROR: No se puede ingresar un número negativo.");
        } else JOptionPane.showMessageDialog(this, "ERROR: Hay campos vacíos.");
        
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        cajero.activarMenuPrincipal();
        
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
