package telas;

import javax.swing.JOptionPane;

public class Variaveis2 extends javax.swing.JFrame {

    public Variaveis2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Movimento8 = new javax.swing.JTextField();
        Movimento7 = new javax.swing.JTextField();
        Movimento6 = new javax.swing.JTextField();
        Movimento5 = new javax.swing.JTextField();
        Movimento4 = new javax.swing.JTextField();
        Movimento3 = new javax.swing.JTextField();
        Movimento2 = new javax.swing.JTextField();
        Movimento1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mapa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(891, 624));
        setMinimumSize(new java.awt.Dimension(891, 624));
        setPreferredSize(new java.awt.Dimension(881, 634));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(Movimento8);
        Movimento8.setBounds(600, 460, 210, 30);
        getContentPane().add(Movimento7);
        Movimento7.setBounds(600, 420, 210, 30);
        getContentPane().add(Movimento6);
        Movimento6.setBounds(600, 380, 210, 30);
        getContentPane().add(Movimento5);
        Movimento5.setBounds(600, 340, 210, 30);
        getContentPane().add(Movimento4);
        Movimento4.setBounds(600, 300, 210, 30);
        getContentPane().add(Movimento3);
        Movimento3.setBounds(600, 260, 210, 30);

        Movimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movimento2ActionPerformed(evt);
            }
        });
        getContentPane().add(Movimento2);
        Movimento2.setBounds(600, 220, 210, 30);

        Movimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Movimento1ActionPerformed(evt);
            }
        });
        getContentPane().add(Movimento1);
        Movimento1.setBounds(600, 180, 210, 30);

        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 570, 120, 40);

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 2/1.png"))); // NOI18N
        getContentPane().add(mapa);
        mapa.setBounds(30, 90, 500, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 16.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(881, 634));
        jLabel2.setMinimumSize(new java.awt.Dimension(944, 654));
        jLabel2.setPreferredSize(new java.awt.Dimension(944, 654));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 890, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Movimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movimento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Movimento2ActionPerformed

    private void Movimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Movimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Movimento1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     if (!Movimento1.getText().equals("String move = ‘rigth’;")){
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento2.getText().equals("String move = ‘down’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/2.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento3.getText().equals("String move = ‘left’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/3.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento4.getText().equals("String move = ‘up’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/4.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento5.getText().equals("String move = ‘rigth’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/4.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento6.getText().equals("String move = ‘up’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/4.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento7.getText().equals("String move = ‘left’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/4.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }else if (!Movimento8.getText().equals("String move = ‘up’;")){
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/variaveis/fase 1/4.png")));
        JOptionPane.showMessageDialog(null, "Movimento errado!!!");
     }
     
     if (Movimento1.getText().equals("String move = ‘rigth’;") && (Movimento2.getText().equals("String move = ‘down’;") && (Movimento3.getText().equals("String move = ‘left’;") && (Movimento4.getText().equals("String move = ‘up’;")) && (Movimento5.getText().equals("String move = ‘rigth’;")) && (Movimento6.getText().equals("String move = ‘up’;")) && (Movimento7.getText().equals("String move = ‘left’;")) && (Movimento8.getText().equals("String move = ‘up’;")) ))){                  
        JOptionPane.showMessageDialog(null, "Parabéns você concluiu a fase variavels!!!");   
        Splash v2 = new Splash();
        v2.setVisible(true);
        dispose();
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Variaveis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Variaveis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Variaveis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Variaveis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Variaveis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Movimento1;
    private javax.swing.JTextField Movimento2;
    private javax.swing.JTextField Movimento3;
    private javax.swing.JTextField Movimento4;
    private javax.swing.JTextField Movimento5;
    private javax.swing.JTextField Movimento6;
    private javax.swing.JTextField Movimento7;
    private javax.swing.JTextField Movimento8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mapa;
    // End of variables declaration//GEN-END:variables
}
