/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author pc
 */
public class CadastrarSalas extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarSalas
     */
    public CadastrarSalas() {
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

        Cadastrar_Salas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Button_cadastrar = new javax.swing.JButton();
        Caixa_text_bloco = new javax.swing.JTextField();
        Caixa_text_numero = new javax.swing.JTextField();
        select_lab = new javax.swing.JRadioButton();
        select_sala = new javax.swing.JRadioButton();
        ComboBox_status = new javax.swing.JComboBox<>();
        Button_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastrar Salas");

        jLabel3.setText("Bloco: ");

        jLabel4.setText("Número: ");

        jLabel5.setText("Tipo de sala: ");

        jLabel6.setText("Status da Sala:");

        Button_cadastrar.setText("Cadastrar");
        Button_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cadastrarActionPerformed(evt);
            }
        });

        Caixa_text_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa_text_numeroActionPerformed(evt);
            }
        });

        select_lab.setText("Labotatório");
        select_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_labActionPerformed(evt);
            }
        });

        select_sala.setText("Sala de aula");

        ComboBox_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupada", "Disponível", "Reservada" }));

        Button_voltar.setText("Voltar");
        Button_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cadastrar_SalasLayout = new javax.swing.GroupLayout(Cadastrar_Salas);
        Cadastrar_Salas.setLayout(Cadastrar_SalasLayout);
        Cadastrar_SalasLayout.setHorizontalGroup(
            Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_SalasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastrar_SalasLayout.createSequentialGroup()
                        .addComponent(Button_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_cadastrar)
                        .addGap(26, 26, 26))
                    .addGroup(Cadastrar_SalasLayout.createSequentialGroup()
                        .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(73, 73, 73)
                        .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Cadastrar_SalasLayout.createSequentialGroup()
                                    .addComponent(select_lab)
                                    .addGap(18, 18, 18)
                                    .addComponent(select_sala))
                                .addComponent(Caixa_text_bloco, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(Caixa_text_numero)))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        Cadastrar_SalasLayout.setVerticalGroup(
            Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_SalasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Caixa_text_bloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Caixa_text_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(select_lab)
                    .addComponent(select_sala))
                .addGap(18, 18, 18)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(Cadastrar_SalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cadastrar)
                    .addComponent(Button_voltar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastrar_Salas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastrar_Salas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_cadastrarActionPerformed

    private void select_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_labActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_labActionPerformed

    private void Button_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_voltarActionPerformed
        // TODO add your handling code here:
        Home frame = new Home();
        frame.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_Button_voltarActionPerformed

    private void Caixa_text_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa_text_numeroActionPerformed
        // TODO add your handling code here:
//        float numero;
//        numero = Float.valueOf(this.Caixa_text_numero.getText());
//        
//        
//        if(numero >= 0 ){
//            
//        }else{
//            Caixa_text_numero.setText("Valor inválido");
//        }
        
    }//GEN-LAST:event_Caixa_text_numeroActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarSalas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cadastrar;
    private javax.swing.JButton Button_voltar;
    private javax.swing.JPanel Cadastrar_Salas;
    private javax.swing.JTextField Caixa_text_bloco;
    private javax.swing.JTextField Caixa_text_numero;
    private javax.swing.JComboBox<String> ComboBox_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton select_lab;
    private javax.swing.JRadioButton select_sala;
    // End of variables declaration//GEN-END:variables
}
