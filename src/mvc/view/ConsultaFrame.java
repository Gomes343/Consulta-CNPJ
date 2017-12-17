/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;
import mvc.control.DownloadCartao;
import mvc.control.JanelasControl;
/**
 *
 * @author a1700677
 */
public class ConsultaFrame extends javax.swing.JFrame {

    DownloadCartao baixar = new DownloadCartao();
    JanelasControl control = new JanelasControl();
    
    
    public ConsultaFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstInfo = new javax.swing.JLabel();
        consultButton = new javax.swing.JToggleButton();
        fieldCNPJ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstInfo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstInfo.setText("CONSULTA DE CNPJ");

        consultButton.setText("Consultar");
        consultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Insira o CNPJ (14 digitos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(consultButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(firstInfo)
                    .addComponent(fieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(firstInfo)
                .addGap(38, 38, 38)
                .addComponent(fieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(consultButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultButtonActionPerformed
 
        String CNPJ = fieldCNPJ.getText();
        int v = 0;
        
            v = baixar.baixarCartao(CNPJ);
            switch (v){
                case 0:
                    this.dispose();
                    ErroFrame erro = new ErroFrame();
                    erro.setVisible(true);
                case 1:
                    this.dispose();
                    control.baixado();
            }
    }//GEN-LAST:event_consultButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton consultButton;
    private javax.swing.JTextField fieldCNPJ;
    private javax.swing.JLabel firstInfo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
