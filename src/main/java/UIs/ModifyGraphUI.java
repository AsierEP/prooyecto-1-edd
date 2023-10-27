/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIs;

/**
 *
 * @author Dell
 */
public class ModifyGraphUI extends javax.swing.JFrame {

    /**
     * Creates new form ModifyGraphUI
     */
    public ModifyGraphUI() {
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
        Title3 = new javax.swing.JLabel();
        AddUserTextField = new javax.swing.JTextField();
        Lab1 = new javax.swing.JLabel();
        Lab2 = new javax.swing.JLabel();
        AddRelationTextField = new javax.swing.JTextField();
        Lab3 = new javax.swing.JLabel();
        RemoveUserTextField = new javax.swing.JTextField();
        Lab4 = new javax.swing.JLabel();
        RemoveRelationTextField = new javax.swing.JTextField();
        AddUserButt = new javax.swing.JButton();
        AddRelationButt = new javax.swing.JButton();
        RemoveUserButt = new javax.swing.JButton();
        RemoveRelationButt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        Title3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("Modificación de grafo");
        getContentPane().add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 380, 60));
        getContentPane().add(AddUserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 540, 50));

        Lab1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lab1.setForeground(new java.awt.Color(255, 255, 255));
        Lab1.setText("Añadir usuario:");
        getContentPane().add(Lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 520, 30));

        Lab2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lab2.setForeground(new java.awt.Color(255, 255, 255));
        Lab2.setText("Añadir relación:");
        getContentPane().add(Lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 40));
        getContentPane().add(AddRelationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 540, 50));

        Lab3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lab3.setForeground(new java.awt.Color(255, 255, 255));
        Lab3.setText("Eliminar usuario:");
        getContentPane().add(Lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 320, 50));
        getContentPane().add(RemoveUserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 540, 50));

        Lab4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Lab4.setForeground(new java.awt.Color(255, 255, 255));
        Lab4.setText("Eliminar relación:");
        getContentPane().add(Lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 460, 50));
        getContentPane().add(RemoveRelationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 540, 50));

        AddUserButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddUserButt.setText("Añadir");
        getContentPane().add(AddUserButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 130, 50));

        AddRelationButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddRelationButt.setText("Añadir");
        getContentPane().add(AddRelationButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 130, 50));

        RemoveUserButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RemoveUserButt.setText("Eliminar");
        getContentPane().add(RemoveUserButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 150, 50));

        RemoveRelationButt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RemoveRelationButt.setText("Eliminar");
        getContentPane().add(RemoveRelationButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 150, 50));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Volver a visualización");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIs/fondoGrafosOperations.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 550));

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
            java.util.logging.Logger.getLogger(ModifyGraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyGraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyGraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyGraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyGraphUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRelationButt;
    private javax.swing.JTextField AddRelationTextField;
    private javax.swing.JButton AddUserButt;
    private javax.swing.JTextField AddUserTextField;
    private javax.swing.JLabel Lab1;
    private javax.swing.JLabel Lab2;
    private javax.swing.JLabel Lab3;
    private javax.swing.JLabel Lab4;
    private javax.swing.JButton RemoveRelationButt;
    private javax.swing.JTextField RemoveRelationTextField;
    private javax.swing.JButton RemoveUserButt;
    private javax.swing.JTextField RemoveUserTextField;
    private javax.swing.JLabel Title3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
