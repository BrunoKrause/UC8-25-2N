package InternalFrame;
import bancos.bancoProdutos;
import Classe.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class telaConProduto extends javax.swing.JInternalFrame {
    
    private int idSelecionado = 0;
    
    private void limparCampos() {
        txtDescricao.setText("");
        txtValor.setText("");
        txtQuantidade.setText("");
        campoPesquisa.setText("");
        
        idSelecionado = 0;
        
        campoPesquisa.requestFocus();
    }
    
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
        txtDescricao = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Produto");

        campoPesquisa.setBackground(new java.awt.Color(242, 242, 242));
        campoPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Pesquisar por:", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION));
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
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProdutos);

        buttonGroup1.add(rbDescricao);
        rbDescricao.setSelected(true);
        rbDescricao.setText("Descrição");

        buttonGroup1.add(rbId);
        rbId.setText("Código");

        txtDescricao.setBackground(new java.awt.Color(242, 242, 242));
        txtDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descrição"));

        txtValor.setBackground(new java.awt.Color(242, 242, 242));
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Valor"));

        txtQuantidade.setBackground(new java.awt.Color(242, 242, 242));
        txtQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Quantidade"));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(rbId))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(campoPesquisa))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar)
                            .addComponent(btnEditar)
                            .addComponent(btnAdicionar)
                            .addComponent(btnExcluir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDescricao)
                    .addComponent(rbId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        carregarProdutos();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        carregarProdutos();
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        int linha = tabelaProdutos.getSelectedRow();
        
        if (linha >= 0) {
            idSelecionado = Integer.parseInt(tabelaProdutos.getValueAt(linha, 0).toString());
            
            txtDescricao.setText(tabelaProdutos.getValueAt(linha, 1).toString());
            
            txtValor.setText(tabelaProdutos.getValueAt(linha, 2).toString());
            
            txtQuantidade.setText(tabelaProdutos.getValueAt(linha, 3).toString());
        }
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (txtDescricao.getText().isEmpty()
                || txtValor.getText().isEmpty()
                || txtQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            
            return;
        }
        
        Produto produto = new Produto();
        
        produto.setId(bancoProdutos.idProduto);
        produto.setDescricao(txtDescricao.getText());
        produto.setValor(Double.parseDouble(txtValor.getText()));
        produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
        
        bancoProdutos.produtos.add(produto);
        
        bancoProdutos.idProduto++;
        
        JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
        
        carregarProdutos();
        limparCampos();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (idSelecionado == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
            
            return;
        }
        
        for (Produto produto : bancoProdutos.produtos) {
            
            if (produto.getId() == idSelecionado) {
                produto.setDescricao(txtDescricao.getText());
                produto.setValor(Double.parseDouble(txtValor.getText()));
                produto.setQuantidade(Integer.parseInt(txtValor.getText()));
                
                JOptionPane.showMessageDialog(null, "Produto atualizado!");
                
                carregarProdutos();
                limparCampos();
                
                idSelecionado = 0;
                
                break;
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        if (idSelecionado == 0) {
            
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
            
            return;
        }
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            
            for (Produto produto : bancoProdutos.produtos) {
                
                if (produto.getId() == idSelecionado) {
                    bancoProdutos.produtos.remove(produto);
                    
                    JOptionPane.showMessageDialog(null, "Produto removido!");
                   
                    carregarProdutos();
                    limparCampos();
                    
                    idSelecionado = 0;
                    
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbDescricao;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
