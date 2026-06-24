package Telas;

import javax.swing.table.DefaultTableModel;
import Bancos.BancoAlunos;
import Classes.Aluno;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;


public class NovoAluno extends javax.swing.JInternalFrame {

    private int idSelecionado = 0;
    
    public void limparCampos() {
        
        txtNome.setText("");
        txtTurma.setText("");
        txtEmail.setText("");
        
        idSelecionado = 0;
        
        txtNome.requestFocus();
    }
    
    public void carregarAlunos(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Turma");
        modelo.addColumn("Email");
        
        for (Aluno aluno : BancoAlunos.alunos) {
            
            modelo.addRow( new Object[] {
                aluno.getId(),
                aluno.getNome(),
                aluno.getTurma(),
                aluno.getEmail(),
            });
        }
        
        tabelaAluno.setModel(modelo);
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tabelaAluno.setRowSorter(sorter);
        
        sorter.setSortKeys(Arrays.asList(
        new RowSorter.SortKey(1, SortOrder.ASCENDING)));
        sorter.sort();
    }
    
    public NovoAluno() {
        initComponents();
        carregarAlunos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Novo Aluno");
        setToolTipText("");

        txtNome.setBackground(new java.awt.Color(242, 242, 242));
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nome"));

        txtTurma.setBackground(new java.awt.Color(242, 242, 242));
        txtTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Turma"));

        txtEmail.setBackground(new java.awt.Color(242, 242, 242));
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Email"));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaAluno);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtTurma)
                    .addComponent(txtEmail)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunoMouseClicked
        
        int linha = tabelaAluno.getSelectedRow();
        
        if (linha >= 0) {
            
            idSelecionado = Integer.parseInt(tabelaAluno.getValueAt(linha, 0).toString());
        }
    }//GEN-LAST:event_tabelaAlunoMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        if (txtNome.getText().isEmpty()
                || txtTurma.getText().isEmpty()
                || txtEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Prencha todos os Campos!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            return;
        }
        
        Aluno aluno = new Aluno();
        
        aluno.setId(BancoAlunos.idAluno);
        aluno.setNome(txtNome.getText());
        aluno.setTurma(txtTurma.getText());
        aluno.setEmail(txtEmail.getText());
        
        BancoAlunos.alunos.add(aluno);
        
        BancoAlunos.idAluno++;
        
        JOptionPane.showMessageDialog(this,"Aluno Adicionado com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        
        carregarAlunos();
        limparCampos();
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        if (idSelecionado == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um Aluno.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            
            for (Aluno aluno : BancoAlunos.alunos) {
                
                if (aluno.getId() == idSelecionado) {
                    BancoAlunos.alunos.remove(aluno);
                    
                    JOptionPane.showMessageDialog(this, "Aluno Removido");
                    
                    carregarAlunos();
                    limparCampos();
                    
                    idSelecionado = 0;
                    
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
