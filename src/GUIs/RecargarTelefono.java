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
 * @author a.rio.2017
 */
public class RecargarTelefono extends javax.swing.JPanel {
    private int numerocuenta;
    private Cajero cajero;
    private CajeroController controller;
    int numeroconfirmacion;
    /**
     * Creates new form RecargarTelefono
     */
    public RecargarTelefono(Cajero cajero,int cuenta) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.numerocuenta = cuenta;
        this.controller = cajero.getController();
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        jLabel5.setFont(Consolas24);
        jLabel5.setText("RECARGAR TELEFONO");
        
        
        jLabel1.setFont(Consolas20);
        jLabel1.setText("NUMERO DE TELEFONO");
        
        jLabel2.setFont(Consolas20);
        jLabel2.setText("CANTIDAD");
        
        jLabel3.setFont(Consolas20);
        jLabel3.setText("NUMERO DE CONFIRMACION");
        
        jButton1.setFont(Consolas20);
        jButton1.setText("ACEPTAR");
        
        jButton2.setFont(Consolas20);
        jButton2.setText("CONFIRMAR");
        
        jTextField1.setFont(Consolas20);
        jTextField1.setText("");
        
        jTextField2.setFont(Consolas20);
        jTextField2.setText("");
        
        jTextField3.setFont(Consolas20);
        jTextField3.setText("");
    }
    
    private int getNumConfirmacion() {
        return (int) Math.floor(1000 + Math.random()*9000+1);
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
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.GridLayout(5, 0));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);

        add(jPanel1);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);

        jTextField1.setMinimumSize(new java.awt.Dimension(200, 24));
        jTextField1.setName(""); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel2.add(jTextField1);

        add(jPanel2);

        jLabel2.setText("jLabel1");
        jPanel3.add(jLabel2);

        jTextField2.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 50));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2);

        add(jPanel3);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel4.add(jButton1);

        add(jPanel4);

        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3);

        jTextField3.setMinimumSize(new java.awt.Dimension(100, 24));
        jTextField3.setPreferredSize(new java.awt.Dimension(200, 50));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField3);

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel5.add(jButton2);

        add(jPanel5);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        Integer numerotelefono = Integer.parseInt(jTextField1.getText()); 
        int numeros = Integer.toString(numerotelefono).length();
        if(numeros == 9 && numerotelefono >= 600000000 && numerotelefono <= 799999999){
            numeroconfirmacion = getNumConfirmacion();
            JOptionPane.showMessageDialog(this, "Número de confirmación: " + numeroconfirmacion);
           
        } else JOptionPane.showMessageDialog(this, "El número de telefono no existe");
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        Integer numerotelefono = Integer.parseInt(jTextField1.getText()); 
        int numeroconfirmacionescrito = Integer.parseInt(jTextField3.getText());
        int cantidad = -Integer.parseInt(jTextField2.getText());
        if(numeroconfirmacion == numeroconfirmacionescrito){
            if(this.controller.haySaldo(numerocuenta, -cantidad)){
                this.controller.moverSaldo(numerocuenta, cantidad, "RECARGA A " + numerotelefono);
                this.setVisible(false);
                jTextField1.setText(null);
                jTextField2.setText(null);
                jTextField3.setText(null);
                cajero.activarOtraOperacion();
            }
        }
        else JOptionPane.showMessageDialog(this, "El número de confirmación no es correcto.");
    }//GEN-LAST:event_jButton2MousePressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables


}
