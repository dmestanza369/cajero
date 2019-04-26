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
        Font Consolas12 = new java.awt.Font("Consolas", 0, 12);
        Font Consolas16 = new java.awt.Font("Consolas", 0, 16);
        
        jLabel1.setFont(Consolas16);
        jLabel1.setText("Transacciones");
        
        jLabel6.setFont(Consolas12);
        jLabel6.setText("Destinatario (número de cuenta)");
        
        jLabel7.setFont(Consolas12);
        jLabel7.setText("Cantidad");
        
        jLabel8.setFont(Consolas12);
        jLabel8.setText("Concepto");
        
        jButton1.setFont(Consolas12);
        jButton1.setText("Aceptar");
        
        jComboBox1.setFont(Consolas12);
        jComboBox1.addItem("VIAJE");
        jComboBox1.addItem("REGALO");
        jComboBox1.addItem("PRÉSTAMO");
        jComboBox1.addItem("OTROS");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jTextField5.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField5.setName(""); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel11.add(jTextField5);

        jPanel2.add(jPanel11);

        jLabel7.setText("jLabel7");
        jPanel16.add(jLabel7);

        jTextField6.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField6.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanel16.add(jTextField6);

        jPanel2.add(jPanel16);

        jLabel8.setText("jLabel8");
        jPanel12.add(jLabel8);

        jComboBox1.setMinimumSize(new java.awt.Dimension(100, 24));
        jComboBox1.setPreferredSize(new java.awt.Dimension(100, 24));
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
        if (this.controller.existeCuenta(destinatario)){
            double dinero = Double.parseDouble(jTextField6.getText());
            if (this.controller.haySaldo(numerocuenta, dinero)){
                //Quitar dinero
                this.controller.moverSaldo(numerocuenta, -dinero, "TRANSACCIÓN A " + destinatario);
                //Dar dinero
                this.controller.moverSaldo(destinatario, dinero, "TRANSACCIÓN DESDE " + numerocuenta);
            }
        } else JOptionPane.showMessageDialog(this, "El destinatario no existe.");
    }//GEN-LAST:event_jButton1MousePressed


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
