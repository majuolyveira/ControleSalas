/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema;

/**
 *
 * @author pc
 */
public class Disciplinas extends javax.swing.JFrame {

    /**
     * Creates new form Disciplinas
     */
    public Disciplinas() {
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

        P_disciplinas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button_cadastrar_disc = new javax.swing.JButton();
        button_ler_disc = new javax.swing.JButton();
        button_atualizar_dic = new javax.swing.JButton();
        button_deletar_disc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Disciplinas");

        button_cadastrar_disc.setText("Cadastrar");
        button_cadastrar_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cadastrar_discActionPerformed(evt);
            }
        });

        button_ler_disc.setText("Ler");

        button_atualizar_dic.setText("Atualizar");
        button_atualizar_dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_atualizar_dicActionPerformed(evt);
            }
        });

        button_deletar_disc.setText("Deletar");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_disciplinasLayout = new javax.swing.GroupLayout(P_disciplinas);
        P_disciplinas.setLayout(P_disciplinasLayout);
        P_disciplinasLayout.setHorizontalGroup(
            P_disciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_disciplinasLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_disciplinasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(button_cadastrar_disc)
                .addGap(41, 41, 41)
                .addComponent(button_ler_disc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(button_atualizar_dic)
                .addGap(42, 42, 42)
                .addGroup(P_disciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(button_deletar_disc))
                .addContainerGap())
        );
        P_disciplinasLayout.setVerticalGroup(
            P_disciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_disciplinasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(P_disciplinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cadastrar_disc)
                    .addComponent(button_ler_disc)
                    .addComponent(button_atualizar_dic)
                    .addComponent(button_deletar_disc))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_disciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_disciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_cadastrar_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cadastrar_discActionPerformed
        // TODO add your handling code here:
        CadastrarDisciplinas frame = new CadastrarDisciplinas();
        frame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_button_cadastrar_discActionPerformed

    private void button_atualizar_dicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_atualizar_dicActionPerformed
        // TODO add your handling code here:
        AtualizarDisc frame = new AtualizarDisc();
        frame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_button_atualizar_dicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Home frame = new Home();
        frame.setVisible(true);

        this.dispose();
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
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_disciplinas;
    private javax.swing.JButton button_atualizar_dic;
    private javax.swing.JButton button_cadastrar_disc;
    private javax.swing.JButton button_deletar_disc;
    private javax.swing.JButton button_ler_disc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
