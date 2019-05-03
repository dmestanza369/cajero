/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Database.CajeroController;
import java.awt.Font;

/**
 *
 * @author a.jimenezg.2017
 */
public class Movimientos extends javax.swing.JPanel {
    private int numeroCuenta;
    private Cajero cajero;
    private CajeroController controller;
    /**
     * Creates new form Movimientos
     */
    public Movimientos(Cajero cajero, int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numeroCuenta = cuenta;
        this.controller = cajero.getController();
        //Fuentes
        Font Consolas14 = new java.awt.Font("Consolas", 0, 14);
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel1.setFont(Consolas24);
        jLabel1.setText("MOVIMIENTOS");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
        jTextArea1.setFont(Consolas14);
        jTextArea1.setEditable(false);
        
        jLabel2.setFont(Consolas14);
        jLabel2.setText("");
    }
    
    public void addMovimientos(){
        String texto = this.controller.getStringMovimientos(numeroCuenta);
        if (!"".equals(texto))
            jTextArea1.setText(texto);
        else jTextArea1.setText("NO HAY MOVIMIENTOS.");
        
        jLabel2.setText("SALDO ACTUAL: " + this.controller.getSaldo(numeroCuenta) + "€");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(516, 175));
        setPreferredSize(new java.awt.Dimension(100, 60));
        setLayout(new java.awt.BorderLayout(25, 25));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 100));

        jPanel6.setMinimumSize(new java.awt.Dimension(350, 300));
        jPanel6.setPreferredSize(new java.awt.Dimension(350, 300));

        jPanel2.setPreferredSize(new java.awt.Dimension(320, 200));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 200));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(400, 300));
        jTextArea1.setPreferredSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel2);

        jLabel2.setText("jLabel2");
        jPanel6.add(jLabel2);

        jPanel1.add(jPanel6);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel1.setText("jLabel1");
        jPanel7.add(jLabel1);

        jPanel8.add(jPanel7);

        add(jPanel8, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        this.setVisible(false);
        cajero.activarOtraOperacion();
    }//GEN-LAST:event_jButton1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
