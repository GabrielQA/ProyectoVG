/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

import Archi.ArchAdmn;
import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL-PC
 */
public class LoginAdmin extends javax.swing.JFrame {

    public LoginAdmin() {
        initComponents();
        Contraseña.setText("");
    }

    public void veriPass(String[] h) {
        ArchAdmn login = new ArchAdmn();

        h = login.extraerPass();

        if ((Usuario.getText().equals(h[0])) & (Contraseña.getText().equals(h[1]))) {
            System.out.println("Correcto");
            Administrador O = new Administrador();
            O.setVisible(true);
            O.setEnabled(true);
            O.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        iniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar.setText("Iniciar Sesion");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 193, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        Contraseña.setText("jPasswordField1");
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 193, -1));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/how_many_understand.gif"))); // NOI18N
        jLabel3.setText("asd");
        jLabel3.setToolTipText("");
        jLabel3.setFocusCycleRoot(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 450, 300));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        ArchAdmn logic = new ArchAdmn();
        veriPass(logic.extraerPass());
        dispose();

    }//GEN-LAST:event_iniciarActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed

    }//GEN-LAST:event_ContraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminOEst Log = new AdminOEst();
        Log.setVisible(true);
        Log.setEnabled(true);
        Log.setLocationRelativeTo(null);
        dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
