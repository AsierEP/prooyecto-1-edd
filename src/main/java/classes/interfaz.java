/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        salir = new javax.swing.JButton();
        Título = new javax.swing.JLabel();
        CargarArchivo = new javax.swing.JButton();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        Anteriordata = new javax.swing.JButton();
        Fondolab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(255, 0, 51));
        salir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, 30));

        Título.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        Título.setForeground(new java.awt.Color(51, 0, 255));
        Título.setText("Proyecto 1: Análisis de redes sociales. ");
        jPanel1.add(Título, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        CargarArchivo.setBackground(new java.awt.Color(102, 255, 255));
        CargarArchivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CargarArchivo.setText("Cargar archivo");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 140, 40));

        lab1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Por favor seleccione la opción");
        jPanel1.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 240, -1));

        lab2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("de la que quiera obtener los datos del programa");
        jPanel1.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        Anteriordata.setBackground(new java.awt.Color(153, 255, 255));
        Anteriordata.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Anteriordata.setText("Usar archivo previo");
        jPanel1.add(Anteriordata, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 170, 40));

        Fondolab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/Diseño sin título (2).png"))); // NOI18N
        jPanel1.add(Fondolab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String Filename = f.getAbsolutePath();
        JOptionPane.showMessageDialog(null, Filename);
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anteriordata;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JLabel Fondolab;
    private javax.swing.JLabel Título;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
