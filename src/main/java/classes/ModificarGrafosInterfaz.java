/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author Dell
 */
public class ModificarGrafosInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form ModificarGrafosInterfaz
     */
    public ModificarGrafosInterfaz() {
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
        TituloModGrafos = new javax.swing.JLabel();
        AñadirUsuarioLab = new javax.swing.JLabel();
        TextAñadirUsuario = new javax.swing.JTextField();
        EliminarUsuarioLab = new javax.swing.JLabel();
        TextEliminarUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        TituloModGrafos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TituloModGrafos.setForeground(new java.awt.Color(255, 255, 255));
        TituloModGrafos.setText("Modificación de grafos");
        getContentPane().add(TituloModGrafos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 270, 50));

        AñadirUsuarioLab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AñadirUsuarioLab.setForeground(new java.awt.Color(255, 255, 255));
        AñadirUsuarioLab.setText("Añadir usuario (identificar relaciones con otros usuarios):");
        getContentPane().add(AñadirUsuarioLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 530, 60));

        TextAñadirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAñadirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextAñadirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 630, 70));

        EliminarUsuarioLab.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EliminarUsuarioLab.setForeground(new java.awt.Color(255, 255, 255));
        EliminarUsuarioLab.setText("Eliminar un usuario:");
        getContentPane().add(EliminarUsuarioLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 190, 50));
        getContentPane().add(TextEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 620, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/fondoGrafosOperations.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextAñadirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAñadirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAñadirUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarGrafosInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarGrafosInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarGrafosInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarGrafosInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarGrafosInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AñadirUsuarioLab;
    private javax.swing.JLabel EliminarUsuarioLab;
    private javax.swing.JTextField TextAñadirUsuario;
    private javax.swing.JTextField TextEliminarUsuario;
    private javax.swing.JLabel TituloModGrafos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
