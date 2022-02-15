
package telas;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    ControllerUsuario usuarios = new ControllerUsuario();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        logar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 560));
        setMinimumSize(new java.awt.Dimension(650, 560));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 260, 30, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flat-color-icons_search.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 170, 21, 30);
        getContentPane().add(jUser);
        jUser.setBounds(180, 170, 290, 34);
        getContentPane().add(jSenha);
        jSenha.setBounds(180, 270, 290, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Simple Shiny 2 (1).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(650, 560));
        jLabel1.setMinimumSize(new java.awt.Dimension(650, 560));
        jLabel1.setPreferredSize(new java.awt.Dimension(711, 568));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 539);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 10, 50, 27);

        logar.setText("jButton2");
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });
        getContentPane().add(logar);
        logar.setBounds(230, 337, 180, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login tl = new Login();
        tl.setVisible(true);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        usuarios.setNome(jUser.getText());
        usuarios.setSenha(jSenha.getText());
        if ((jUser.getText().isEmpty()) || (jSenha.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }else{
            UsuarioDAO dao = new UsuarioDAO();
            boolean concluido = dao.logar(usuarios);
            if(concluido == true){
                Splash tl = new Splash();
                tl.setVisible(true);

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }
        }
    }//GEN-LAST:event_logarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JTextField jUser;
    private javax.swing.JButton logar;
    // End of variables declaration//GEN-END:variables
}
