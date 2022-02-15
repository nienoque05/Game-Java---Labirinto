package telas;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    ControllerUsuario usuarios = new ControllerUsuario();
    
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextApelido = new javax.swing.JTextField();
        jTextSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 560));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 260, 30, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flat-color-icons_search.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 170, 21, 30);

        jTextApelido.setBackground(new java.awt.Color(221, 223, 197));
        getContentPane().add(jTextApelido);
        jTextApelido.setBounds(180, 160, 290, 40);
        getContentPane().add(jTextSenha);
        jTextSenha.setBounds(180, 270, 300, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simple Shiny 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 650, 550);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(213, 333, 200, 50);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 0, 40, 27);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtApelidoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
            Login tl = new Login();
            tl.setVisible(true);

            dispose();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code        
        usuarios.setNome(jTextApelido.getText());
        usuarios.setSenha(jTextSenha.getText());
        if ((jTextApelido.getText().isEmpty()) || (jTextSenha.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }else{
            
            UsuarioDAO dao = new UsuarioDAO();
            boolean concluido = dao.verificarSeExiste(usuarios);
            if(concluido == true){
                dao.addUser(usuarios);
                JOptionPane.showMessageDialog(null, "Usuário "+jTextApelido.getText()+" inserido com sucesso! ");

                Login tl = new Login();
                tl.setVisible(true);

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário "+jTextApelido.getText()+" já existe ");
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login tl = new Login();
        tl.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextApelido;
    private javax.swing.JPasswordField jTextSenha;
    // End of variables declaration//GEN-END:variables
}
