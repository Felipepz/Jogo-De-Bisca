/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototipobisca;

/**
 *
 * @author Igor
 */
public class JanelaHospedarJogo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaHost
     */
    public JanelaHospedarJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ip = new javax.swing.JLabel();
        jLabel_codigo = new javax.swing.JLabel();
        jTextField_ip = new javax.swing.JTextField();
        jTextField_codigo = new javax.swing.JTextField();
        jLabel_listaJogadores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_listaJogadores = new javax.swing.JTextArea();
        jButton_iniciarJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_ip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ip.setText("Endereço IP:");

        jLabel_codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_codigo.setText("Código:");

        jTextField_ip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_ip.setText("197.168.4.87");
        jTextField_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ipActionPerformed(evt);
            }
        });

        jTextField_codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_codigo.setText("WSBZ");
        jTextField_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codigoActionPerformed(evt);
            }
        });

        jLabel_listaJogadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_listaJogadores.setText("Jogadores Conectados:");

        jTextArea_listaJogadores.setColumns(20);
        jTextArea_listaJogadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea_listaJogadores.setRows(5);
        jTextArea_listaJogadores.setText("Seu Genésio");
        jScrollPane1.setViewportView(jTextArea_listaJogadores);

        jButton_iniciarJogo.setText("Iniciar Jogo");
        jButton_iniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_iniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_ip)
                                .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_codigo)
                                    .addGap(29, 29, 29))
                                .addComponent(jTextField_codigo)))
                        .addComponent(jScrollPane1)
                        .addComponent(jLabel_listaJogadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ip)
                    .addComponent(jLabel_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_listaJogadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_iniciarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ipActionPerformed

    private void jTextField_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigoActionPerformed

    private void jButton_iniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciarJogoActionPerformed
        // TODO add your handling code here:
        JanelaMesa.executaTesteDePrototipo();
    }//GEN-LAST:event_jButton_iniciarJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaHospedarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaHospedarJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaHospedarJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_iniciarJogo;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_ip;
    private javax.swing.JLabel jLabel_listaJogadores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_listaJogadores;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_ip;
    // End of variables declaration//GEN-END:variables
}
