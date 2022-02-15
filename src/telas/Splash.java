
package telas;
import dao.UsuarioDAO;

public class Splash extends javax.swing.JFrame {
    ControllerLogado usuarios = new ControllerLogado();

    public Splash() {
        initComponents();
        System.out.println(usuarios.getNome());
        labelNome.setText(usuarios.getNome());
        UsuarioDAO dao = new UsuarioDAO();
        
        dao.pontuacaoMax(Integer.toString(usuarios.getId()));
        dao.ultimaJogada(Integer.toString(usuarios.getId()));
        mPontuacao.setText(usuarios.getMaiorPontuacao());
        uPontuacao.setText(usuarios.getUltimaJogadaPT());
        dateJogada.setText(usuarios.getUltimaJogadaDT());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        uPontuacao = new javax.swing.JLabel();
        mPontuacao = new javax.swing.JLabel();
        dateJogada = new javax.swing.JLabel();
        ButtonVariaveis = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 560));
        setMinimumSize(new java.awt.Dimension(650, 560));
        setPreferredSize(new java.awt.Dimension(650, 560));
        getContentPane().setLayout(null);

        labelNome.setFont(new java.awt.Font("Padauk", 1, 24)); // NOI18N
        getContentPane().add(labelNome);
        labelNome.setBounds(110, 30, 150, 40);

        uPontuacao.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        uPontuacao.setForeground(java.awt.Color.gray);
        getContentPane().add(uPontuacao);
        uPontuacao.setBounds(340, 460, 60, 17);

        mPontuacao.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        mPontuacao.setForeground(java.awt.Color.gray);
        getContentPane().add(mPontuacao);
        mPontuacao.setBounds(160, 460, 60, 17);

        dateJogada.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        dateJogada.setForeground(java.awt.Color.gray);
        getContentPane().add(dateJogada);
        dateJogada.setBounds(490, 460, 80, 17);

        ButtonVariaveis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 15.jpg"))); // NOI18N
        ButtonVariaveis.setText("jLabel1");
        getContentPane().add(ButtonVariaveis);
        ButtonVariaveis.setBounds(-6, -6, 660, 560);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 190, 160, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        VariaveisFase1 VF1 = new VariaveisFase1();
        VF1.setVisible(true);
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonVariaveis;
    private javax.swing.JLabel dateJogada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel mPontuacao;
    private javax.swing.JLabel uPontuacao;
    // End of variables declaration//GEN-END:variables
}
