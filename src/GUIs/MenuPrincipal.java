/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Database.CajeroController;
import Scripts.Cuenta;
import java.awt.Font;
import java.awt.event.ActionEvent;

/**
 *
 * @author d.mestanza.2017
 */
public class MenuPrincipal extends javax.swing.JPanel{
    private Cajero cajero;
    private CajeroController controller;
    int boton = 0;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Cajero cajero) {
        initComponents();
        this.setSize(1000, 600);
        this.cajero = cajero;
        this.controller = cajero.getController();
        
        
        //Fuentes
        Font Consolas20 = new java.awt.Font("Consolas", 0, 20);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        Font Consolas30 = new java.awt.Font("Consolas", 0, 30);       

        jLabel9.setFont(Consolas30);
        jLabel9.setText("SELECCIONE UNA OPCIÓN");

        jLabel1.setFont(Consolas24);
        jLabel1.setText("INGRESAR DINERO");
        jButton1.setFont(Consolas20);
        jButton1.setText("1");

        jLabel10.setFont(Consolas24);
        jLabel10.setText("SACAR DINERO");
        jButton2.setFont(Consolas20);
        jButton2.setText("2");

        jLabel11.setFont(Consolas24);
        jLabel11.setText("TRANSACCIONES");
        jButton3.setFont(Consolas20);
        jButton3.setText("3");

        jLabel12.setFont(Consolas24);
        jLabel12.setText("MOVIMIENTOS");
        jButton4.setFont(Consolas20);
        jButton4.setText("4");

        jLabel13.setFont(Consolas24);
        jLabel13.setText("PAGOS");
        jButton5.setFont(Consolas20);
        jButton5.setText("5");

        jLabel14.setFont(Consolas24);
        jLabel14.setText("CAMBIAR PIN");
        jButton6.setFont(Consolas20);
        jButton6.setText("6");

        jLabel15.setFont(Consolas24);
        jLabel15.setText("RECARGAR TELÉFONO");
        jButton7.setFont(Consolas20);
        jButton7.setText("7");

        jLabel16.setFont(Consolas24);
        jLabel16.setText("SACAR TARJETA");
        jButton8.setFont(Consolas20);
        jButton8.setText("8");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.GridLayout(5, 0));

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel9.setText("Selecciona una opción");
        jPanel1.add(jLabel9);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Ingresar dinero");
        jPanel8.add(jLabel1);

        jPanel6.add(jPanel8);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel15.add(jButton1);

        jPanel6.add(jPanel15);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel16.add(jButton2);

        jPanel7.add(jPanel16);

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel10.setText("Retirar dinero");
        jPanel17.add(jLabel10);

        jPanel7.add(jPanel17);

        jPanel2.add(jPanel7);

        add(jPanel2);

        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel11.setText("Transacciones");
        jPanel20.add(jLabel11);

        jPanel19.add(jPanel20);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jPanel21.add(jButton3);

        jPanel19.add(jPanel21);

        jPanel18.add(jPanel19);

        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jPanel23.add(jButton4);

        jPanel22.add(jPanel23);

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel12.setText("Movimientos");
        jPanel24.add(jLabel12);

        jPanel22.add(jPanel24);

        jPanel18.add(jPanel22);

        add(jPanel18);

        jPanel25.setLayout(new java.awt.GridLayout(1, 0));

        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel13.setText("Pagos");
        jPanel27.add(jLabel13);

        jPanel26.add(jPanel27);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jPanel28.add(jButton5);

        jPanel26.add(jPanel28);

        jPanel25.add(jPanel26);

        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jPanel30.add(jButton6);

        jPanel29.add(jPanel30);

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel14.setText("Cambiar PIN");
        jPanel31.add(jLabel14);

        jPanel29.add(jPanel31);

        jPanel25.add(jPanel29);

        add(jPanel25);

        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel15.setText("Recargar teléfono");
        jPanel34.add(jLabel15);

        jPanel33.add(jPanel34);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jPanel35.add(jButton7);

        jPanel33.add(jPanel35);

        jPanel32.add(jPanel33);

        jPanel36.setLayout(new java.awt.GridLayout(1, 0));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(70, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(70, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(70, 50));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        jPanel37.add(jButton8);

        jPanel36.add(jPanel37);

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel16.setText("Sacar tarjeta");
        jPanel38.add(jLabel16);

        jPanel36.add(jPanel38);

        jPanel32.add(jPanel36);

        add(jPanel32);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        this.setVisible(false);
        boton = 1;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        this.setVisible(false);
        boton = 2;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        this.setVisible(false);
        boton = 3;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        this.setVisible(false);
        boton = 4;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        this.setVisible(false);
        boton = 5;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        this.setVisible(false);
        boton = 6;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        this.setVisible(false);
        boton = 7;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        this.setVisible(false);
        boton = 8;
        cajero.elegirSubmenu(boton);
    }//GEN-LAST:event_jButton8MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
