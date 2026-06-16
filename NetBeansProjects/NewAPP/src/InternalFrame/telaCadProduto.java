package InternalFrame;

/**
 *
 * @author BRUNOKRAUSENOIADACOS
 */
public class telaCadProduto extends javax.swing.JInternalFrame {

    public telaCadProduto() {
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoID = new javax.swing.JTextField();
        campoDescrição = new javax.swing.JTextField();
        campoPreço = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Produto");

        campoID.setBackground(new java.awt.Color(242, 242, 242));
        campoID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ID"));

        campoDescrição.setBackground(new java.awt.Color(242, 242, 242));
        campoDescrição.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descrição"));
        campoDescrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescriçãoActionPerformed(evt);
            }
        });

        campoPreço.setBackground(new java.awt.Color(242, 242, 242));
        campoPreço.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Preço"));

        btnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoID)
                    .addComponent(campoDescrição)
                    .addComponent(campoPreço, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnCadastrar)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDescriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescriçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescriçãoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField campoDescrição;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoPreço;
    // End of variables declaration//GEN-END:variables
}
