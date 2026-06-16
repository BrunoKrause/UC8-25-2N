package InternalFrame;
import bancos.bancoProdutos;
import Classe.Produto;
import javax.swing.table.DefaultTableModel;

public class telaConProduto extends javax.swing.JInternalFrame {
    
    private void carregarProdutos() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        String pesquisa = campoPesquisa.getText().toLowerCase();
        
        modelo.addColumn("Código");
        modelo.addColumn("Descrição");
        modelo.addColumn("Valor");
        modelo.addColumn("Quantidade");
        
        for (Produto produto : bancoProdutos.produtos) {
            
            boolean encontrou = false;
            
            if (rbDescricao.isSelected()) {
                if (produto.getDescricao().toLowerCase().contains(pesquisa)) {
                    encontrou = true;
                }
            } else if (rbId.isSelected()) {
                try {
                    int idPesquisado = Integer.parseInt(pesquisa);
                    
                    if (produto.getId() == idPesquisado) {
                        encontrou = true;
                    }
                } catch (NumberFormatException erro) {
                    encontrou = false;
                }
            }
            
            if (encontrou) {
                modelo.addRow(new Object[] {
                    produto.getId(),
                    produto.getDescricao(),
                    produto.getValor(),
                    produto.getQuantidade(),
                });
            }
        }
        
        tabelaProdutos.setModel(modelo);
    }
    
    public telaConProduto() {
        initComponents();
        carregarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        rbDescricao = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Produto");

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

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaProdutos);

        buttonGroup1.add(rbDescricao);
        rbDescricao.setSelected(true);
        rbDescricao.setText("Descrição");

        buttonGroup1.add(rbId);
        rbId.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(rbId)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao)
                    .addComponent(rbId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        carregarProdutos();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        carregarProdutos();
    }//GEN-LAST:event_campoPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
