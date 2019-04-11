/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Controllers.CajeroController;
import java.awt.Font;

/**
 *
 * @author d.mestanza.2017
 */
public class Cajero extends javax.swing.JFrame {

    private CajeroController controller;
    private Cuenta cuenta;
    /**
     * Creates new form
     */
    public Cajero() {
        
        this.cuenta = new Cuenta();
        this.controller = new CajeroController(cuenta);
        
        this.setTitle("Cajero"); //Título de la ventana
        
        MenuPrincipal menuprincipal = new MenuPrincipal();
        OtraOperación otraoperacion = new OtraOperación();
        SacarDinero sacardinero = new SacarDinero();
        
        initComponents();
        this.setSize(1000, 600);
        this.setVisible(true);
        
        //Fuentes
        Font Consolas12 = new java.awt.Font("Consolas", 0, 12);
        Font Consolas24 = new java.awt.Font("Consolas", 0, 24);
        
        //Versión
        jLabel2.setFont(Consolas12);
        jLabel2.setText("Versión");
        
        //PIN
        jLabel1.setFont(Consolas24);
        jLabel1.setText("ESCRIBA SU PIN:");
        jPasswordField1.addActionListener(this.controller);
        jPasswordField1.setFont(Consolas24);
        jPasswordField1.setEchoChar('*');
        
        char[] pin = new char[4];
        boolean isCorrect = true;
         
        do{ //Comprueba el pin: si falla, tendrá que repetirlo.
            jPasswordField1.setText("");
            isCorrect = this.controller.validaPin(jPasswordField1.getPassword());
        }while (isCorrect);
        
        if (isCorrect){ //Muestra el menú principal
            boolean isOtraOperacion = false;
            int eleccion = -1;
            do{
                this.jPanel2.setVisible(false);
                this.jPanel3.setVisible(false);
                this.jPanel4.setVisible(false);
                menuprincipal.setVisible(true);
                
                //
                switch(eleccion){
                    case 1:
                        //
                        break;
                }
                
                
                isOtraOperacion = otraoperacion.getOtraOperacion();
            }while(!isOtraOperacion);
        }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        jPasswordField1.setToolTipText("");
        jPasswordField1.setAutoscrolls(false);
        jPasswordField1.setPreferredSize(new java.awt.Dimension(66, 40));
        jPanel1.add(jPasswordField1);

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
                run();
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
