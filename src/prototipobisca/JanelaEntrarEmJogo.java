/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototipobisca;

/**
 *
 * @author Igor
 */
public class JanelaEntrarEmJogo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaEntrarEmJogo
     */
    public JanelaEntrarEmJogo() {
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

        jLabel_codigo = new javax.swing.JLabel();
        jTextField_ip = new javax.swing.JTextField();
        jTextField_codigo = new javax.swing.JTextField();
        jLabel_ip = new javax.swing.JLabel();
        jButton_EntrarJogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_codigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_codigo.setText("Código:");

        jTextField_ip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ipActionPerformed(evt);
            }
        });

        jTextField_codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codigoActionPerformed(evt);
            }
        });

        jLabel_ip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ip.setText("Endereço IP:");

        jButton_EntrarJogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_EntrarJogo.setText("Entrar no Jogo");
        jButton_EntrarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EntrarJogoActionPerformed(evt);
            }
        });

        jLabel1.setText("Aguardando Host...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_EntrarJogo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ip)
                            .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_codigo)
                                .addGap(29, 29, 29))
                            .addComponent(jTextField_codigo))
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ip)
                    .addComponent(jLabel_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EntrarJogo)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ipActionPerformed

    private void jTextField_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigoActionPerformed

    private void jButton_EntrarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EntrarJogoActionPerformed
        // TODO add your handling code here:
        JanelaMesa.executaTesteDePrototipo();
    }//GEN-LAST:event_jButton_EntrarJogoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaEntrarEmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarEmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarEmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaEntrarEmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaEntrarEmJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_EntrarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_ip;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_ip;
    // End of variables declaration//GEN-END:variables
}
