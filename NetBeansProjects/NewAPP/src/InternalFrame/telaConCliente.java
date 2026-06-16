package InternalFrame;
import bancos.bancoClientes;
import Classe.Cliente;
import javax.swing.table.DefaultTableModel;

public class telaConCliente extends javax.swing.JInternalFrame {

    private void carregarClientes() {
        DefaultTableModel modelo = new DefaultTableModel();
        String pesquisa = campoPesquisa.getText().toLowerCase();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Email");
        
        for (Cliente cliente : bancos.bancoClientes.clientes) {
            if (cliente.getNome().toLowerCase().contains(pesquisa)){
                modelo.addRow(new Object[] {
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getEmail(),
                });
            }
        }
        
        tabelaClientes.setModel(modelo);
    }
    
       public telaConCliente() {
        initComponents();
        carregarClientes();
        
        setSize(600,300);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Cliente");

        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnPesquisar)))
                .addContainerGap(152, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        carregarClientes();
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        carregarClientes();
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}
