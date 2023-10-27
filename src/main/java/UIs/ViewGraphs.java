/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs;

/**
 *
 * @author Dell
 */
public class ViewGraphs extends javax.swing.JFrame {

    /**
     * Creates new form ViewGraphs
     */
    public ViewGraphs() {
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
        Title2 = new javax.swing.JLabel();
        Lab1 = new javax.swing.JLabel();
        VisualizarGrafoButt = new javax.swing.JButton();
        IdentificarEFCButt = new javax.swing.JButton();
        ModificarGrafoButt = new javax.swing.JButton();
        Background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        Title2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Visualización de grafo");
        getContentPane().add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 310, 40));

        Lab1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        Lab1.setForeground(new java.awt.Color(255, 255, 255));
        Lab1.setText("Por favor seleccione la opción que desea realizar");
        getContentPane().add(Lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 550, 70));

        VisualizarGrafoButt.setBackground(new java.awt.Color(102, 255, 255));
        VisualizarGrafoButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VisualizarGrafoButt.setText("Visualizar grafo");
        VisualizarGrafoButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarGrafoButtActionPerformed(evt);
            }
        });
        getContentPane().add(VisualizarGrafoButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 80));

        IdentificarEFCButt.setBackground(new java.awt.Color(102, 255, 255));
        IdentificarEFCButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IdentificarEFCButt.setText("Identificar elementos fuertemente conectados");
        IdentificarEFCButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificarEFCButtActionPerformed(evt);
            }
        });
        getContentPane().add(IdentificarEFCButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 380, 80));

        ModificarGrafoButt.setBackground(new java.awt.Color(102, 255, 255));
        ModificarGrafoButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarGrafoButt.setText("Modificar grafo");
        ModificarGrafoButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarGrafoButtActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarGrafoButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 230, 80));

        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs/FondoGrafos.png"))); // NOI18N
        getContentPane().add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VisualizarGrafoButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarGrafoButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisualizarGrafoButtActionPerformed

    private void IdentificarEFCButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificarEFCButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificarEFCButtActionPerformed

    private void ModificarGrafoButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarGrafoButtActionPerformed
        this.setVisible(false);
        ModifyGraphUI ventanamod = new ModifyGraphUI();
        ventanamod.setVisible(true);
    }//GEN-LAST:event_ModificarGrafoButtActionPerformed

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
            java.util.logging.Logger.getLogger(ViewGraphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGraphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGraphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGraphs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGraphs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background2;
    private javax.swing.JButton IdentificarEFCButt;
    private javax.swing.JLabel Lab1;
    private javax.swing.JButton ModificarGrafoButt;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton VisualizarGrafoButt;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
