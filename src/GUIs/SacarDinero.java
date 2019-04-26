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
 * @author david
 */
public class SacarDinero extends javax.swing.JPanel {

    private int numeroCuenta;
    private Cajero cajero;
    private CajeroController controller;
    
    public SacarDinero(Cajero cajero, int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numeroCuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas12 = new java.awt.Font("Consolas", 0, 12);
        Font Consolas16 = new java.awt.Font("Consolas", 0, 16);
        
        jLabel1.setFont(Consolas16);
        jLabel1.setText("Sacar dinero");
        
        jButton1.setFont(Consolas12);
        jButton1.setText("Aceptar");
        
        jTextField1.setFont(Consolas12);
        jTextField1.setText("a");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 24));
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        double sacar = -1;
        if(jTextField1.getText() != "")
            sacar = Double.parseDouble(jTextField1.getText()); //CAMBIAR LA COMPROBACIÓN PARA CUANDO ESTÁ VACIO (TAMBIÉN EN INGRESAR DINERO)
        if(sacar >= 0 ){
            sacar = -sacar; //
        int OK = 0;
        if (-sacar <= controller.getSaldo(numeroCuenta)){
            OK = this.controller.moverSaldo(numeroCuenta, sacar,"RETIRADA EN EFECTIVO");//el this puede que sobre
            System.out.println(this.controller.getSaldo(numeroCuenta));
            if (OK == -1) JOptionPane.showMessageDialog(this, "ERROR");
            else{
                this.setVisible(false);
                this.cajero.activarOtraOperacion();
            }
        }
        else JOptionPane.showMessageDialog(this, "ERROR: SALDO INSUFICIENTE");
        jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
