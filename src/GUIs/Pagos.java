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
public class Pagos extends javax.swing.JPanel {
    private int numeroCuenta;
    private Cajero cajero;
    private CajeroController controller;
    /**
     * Creates new form Pagos
     */
    public Pagos(Cajero cajero, int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numeroCuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel1.setFont(Consolas24);
        jLabel1.setText("PAGOS");
        
        jLabel2.setFont(Consolas20);
        jLabel2.setText("CONCEPTO");
        
        jLabel3.setFont(Consolas20);
        jLabel3.setText("CANTIDAD");
        
        jTextField2.setFont(Consolas20);
        jTextField2.setText("");
        
        jButton2.setFont(Consolas20);
        jButton2.setText("PAGAR");
        
        jButton3.setFont(Consolas20);
        jButton3.setText("SALIR");
        
        jComboBox1.setFont(Consolas20);
        jComboBox1.addItem("AGUA");
        jComboBox1.addItem("GAS");
        jComboBox1.addItem("IMPUESTOS");
        jComboBox1.addItem("LUZ");
        jComboBox1.addItem("MULTA");
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
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

        jComboBox1.setMinimumSize(new java.awt.Dimension(100, 24));
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel7.add(jComboBox1);

        jPanel2.add(jPanel7);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        jLabel3.setText("jLabel3");
        jPanel9.add(jLabel3);

        jTextField2.setText("jTextField2");
        jTextField2.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel9.add(jTextField2);

        jPanel11.add(jPanel9);

        jPanel2.add(jPanel11);

        jPanel16.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(jPanel16);

        add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        jPanel17.setLayout(new java.awt.GridLayout(3, 1));
        jPanel3.add(jPanel17);

        jPanel21.setLayout(new java.awt.GridLayout(1, 3));
        jPanel21.add(jPanel8);

        jButton2.setText("jButton1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel10.add(jButton2);

        jPanel21.add(jPanel10);

        jButton3.setText("jButton1");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel12.add(jButton3);

        jPanel21.add(jPanel12);

        jPanel3.add(jPanel21);

        jPanel32.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jPanel32);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        //BORRAR
    }//GEN-LAST:event_jButton1MousePressed
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        double pagar = -Double.parseDouble(jTextField2.getText());
        Integer pago = Integer.parseInt(jTextField2.getText());
        String concepto = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        if ("".equals(jTextField2.getText())){
            if (pago<1){
                JOptionPane.showMessageDialog(this, "ERROR: Imposible realizar un pago de "+pago+" €." );
            } else {
                if(this.controller.haySaldo(numeroCuenta, -pagar)){
                    controller.moverSaldo(numeroCuenta, pagar,concepto);
                    this.setVisible(false);
                    jTextField2.setText(null);
                    cajero.activarOtraOperacion();           
                } else JOptionPane.showMessageDialog(this, "ERROR: Saldo insuficiente.");
            }
        } else JOptionPane.showMessageDialog(this, "ERROR: Hay campos vacíos.");
        
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setVisible(false);
        cajero.activarMenuPrincipal();
        
        jTextField2.setText("");
    }//GEN-LAST:event_jButton3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
