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
public class Transacciones extends javax.swing.JPanel {
    private int numerocuenta;
    private Cajero cajero;
    private CajeroController controller;
    /**
     * Creates new form Transacciones
     */
    public Transacciones(Cajero cajero,int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numerocuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel1.setFont(Consolas24);
        jLabel1.setText("TRANSACCIONES");
        
        jLabel6.setFont(Consolas20);
        jLabel6.setText("DESTINATARIO (NÚMERO DE CUENTA)");
        
        jLabel7.setFont(Consolas20);
        jLabel7.setText("CANTIDAD");     
        jLabel8.setFont(Consolas20);
        jLabel8.setText("CONCEPTO");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
        
        jComboBox1.setFont(Consolas20);
        jComboBox1.addItem("PRÉSTAMO");
        jComboBox1.addItem("REGALO");
        jComboBox1.addItem("VIAJE");
        jComboBox1.addItem("OTRO");
        
        jTextField5.setFont(Consolas20);
        jTextField5.setText("");
        jTextField6.setFont(Consolas20);
        jTextField6.setText("");   
    }

    private boolean ComprobarCampos(){
        if ("".equals(jTextField5.getText())) return false;
        if ("".equals(jTextField6.getText())) return false;
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(3, 1));

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jPanel4.setLayout(new java.awt.GridLayout(3, 1));
        jPanel1.add(jPanel4);

        jLabel1.setText("jLabel1");
        jPanel5.add(jLabel1);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel6);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        jLabel6.setText("jLabel6");
        jPanel11.add(jLabel6);

        jTextField5.setMinimumSize(new java.awt.Dimension(200, 50));
        jTextField5.setName(""); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(200, 50));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField5);

        jPanel2.add(jPanel11);

        jLabel7.setText("jLabel7");
        jPanel16.add(jLabel7);

        jTextField6.setMinimumSize(new java.awt.Dimension(200, 50));
        jTextField6.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel16.add(jTextField6);

        jPanel2.add(jPanel16);

        jLabel8.setText("jLabel8");
        jPanel12.add(jLabel8);

        jComboBox1.setMinimumSize(new java.awt.Dimension(100, 24));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel12.add(jComboBox1);

        jPanel2.add(jPanel12);

        add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jPanel17.setLayout(new java.awt.GridLayout(3, 1));
        jPanel3.add(jPanel17);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel21.add(jButton1);

        jPanel3.add(jPanel21);

        jPanel32.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel32);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        int destinatario = Integer.parseInt(jTextField5.getText());
        if (ComprobarCampos()){
            if (this.controller.existeCuenta(destinatario)){
                double dinero = Double.parseDouble(jTextField6.getText());
                if (this.controller.haySaldo(numerocuenta, dinero)){
                    //Quitar dinero
                    this.controller.moverSaldo(numerocuenta, -dinero, "TRANSACCIÓN A " + this.controller.getNombre(destinatario));
                    //Dar dinero
                    this.controller.moverSaldo(destinatario, dinero, "TRANSACCIÓN DE " + this.controller.getNombre(numerocuenta));
                    this.setVisible(false);
                    jTextField5.setText(null);
                    jTextField6.setText(null);
                    cajero.activarOtraOperacion();
                }
            } else JOptionPane.showMessageDialog(this, "ERROR: El destinatario no existe.");
        } else JOptionPane.showMessageDialog(this, "ERROR: Hay campos vacíos.");
        
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton1MousePressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
