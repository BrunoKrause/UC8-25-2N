
import javax.swing.JFrame;

/**
 *
 * @author BRUNOKRAUSENOIADACOS
 */


public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnCadProduto = new javax.swing.JButton();
        btnCadServiço = new javax.swing.JButton();
        desktopPrincipal = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itemCadastroCliente = new javax.swing.JMenuItem();
        itemCadastroProduto = new javax.swing.JMenuItem();
        itemCadastroServiço = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        itemConsultaCliente = new javax.swing.JMenuItem();
        itemConsultaProduto = new javax.swing.JMenuItem();
        itemConsultaServiço = new javax.swing.JMenuItem();
        menuRelatório = new javax.swing.JMenu();
        itemRelatorioCliente = new javax.swing.JMenuItem();
        itemRelatorioProduto = new javax.swing.JMenuItem();
        itemRelatorioServiço = new javax.swing.JMenuItem();
        menuUtilitário = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();
        menuJanela = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\BRUNOKRAUSENOIADACOS\\Downloads\\contorno-do-botao-de-seta-quadrado-de-login (1).png")); // NOI18N
        btnSair.setToolTipText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCadCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\BRUNOKRAUSENOIADACOS\\Downloads\\Icones\\32 x 32\\cliente(1).png")); // NOI18N
        btnCadCliente.setToolTipText("Cadastro Cliente");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        btnCadProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\BRUNOKRAUSENOIADACOS\\Downloads\\Icones\\32 x 32\\descricao-do-produto.png")); // NOI18N
        btnCadProduto.setToolTipText("Cadastro Produto");
        btnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdutoActionPerformed(evt);
            }
        });

        btnCadServiço.setIcon(new javax.swing.ImageIcon("C:\\Users\\BRUNOKRAUSENOIADACOS\\Downloads\\Icones\\32 x 32\\ordem-de-servico.png")); // NOI18N
        btnCadServiço.setToolTipText("Cadastro Serviço");
        btnCadServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadServiçoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadServiço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair)
                    .addComponent(btnCadCliente)
                    .addComponent(btnCadProduto)
                    .addComponent(btnCadServiço))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desktopPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        jToolBar1.setBackground(new java.awt.Color(51, 51, 51));
        jToolBar1.setRollover(true);

        desktopPrincipal.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addGap(0, 226, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuCadastro.setText("Cadastro");

        itemCadastroCliente.setText("Cliente");
        itemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadastroCliente);

        itemCadastroProduto.setText("Produto");
        itemCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadastroProduto);

        itemCadastroServiço.setText("Serviço");
        itemCadastroServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroServiçoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadastroServiço);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consulta");

        itemConsultaCliente.setText("Cliente");
        menuConsulta.add(itemConsultaCliente);

        itemConsultaProduto.setText("Produto");
        menuConsulta.add(itemConsultaProduto);

        itemConsultaServiço.setText("Serviço");
        menuConsulta.add(itemConsultaServiço);

        jMenuBar1.add(menuConsulta);

        menuRelatório.setText("Relatório");

        itemRelatorioCliente.setText("Clientes");
        menuRelatório.add(itemRelatorioCliente);

        itemRelatorioProduto.setText("Produtos");
        menuRelatório.add(itemRelatorioProduto);

        itemRelatorioServiço.setText("Ordem de Serviço");
        menuRelatório.add(itemRelatorioServiço);

        jMenuBar1.add(menuRelatório);

        menuUtilitário.setText("Utilitário");
        jMenuBar1.add(menuUtilitário);

        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        menuAjuda.setText("Ajuda");
        jMenuBar1.add(menuAjuda);

        menuJanela.setText("Janela");
        jMenuBar1.add(menuJanela);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaLogin login = new telaLogin();
        setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void itemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroClienteActionPerformed
        telaCadCliente cadcliente = new telaCadCliente();
        desktopPrincipal.add(cadcliente);
        cadcliente.setVisible(true);
        cadcliente.setLocation(50,50);
    }//GEN-LAST:event_itemCadastroClienteActionPerformed

    private void itemCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroProdutoActionPerformed
        telaCadProduto tela = new telaCadProduto();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
        tela.setLocation(50,50);
    }//GEN-LAST:event_itemCadastroProdutoActionPerformed

    private void itemCadastroServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroServiçoActionPerformed
        telaCadServiço tela = new telaCadServiço();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
        tela.setLocation(50,50);
    }//GEN-LAST:event_itemCadastroServiçoActionPerformed

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        telaCadCliente cadcliente = new telaCadCliente();
        desktopPrincipal.add(cadcliente);
        cadcliente.setVisible(true);
        cadcliente.setLocation(50,50);
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdutoActionPerformed
        telaCadProduto tela = new telaCadProduto();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
        tela.setLocation(50,50);
    }//GEN-LAST:event_btnCadProdutoActionPerformed

    private void btnCadServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadServiçoActionPerformed
        telaCadServiço tela = new telaCadServiço();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
        tela.setLocation(50,50);
    }//GEN-LAST:event_btnCadServiçoActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnCadProduto;
    private javax.swing.JButton btnCadServiço;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenuItem itemCadastroCliente;
    private javax.swing.JMenuItem itemCadastroProduto;
    private javax.swing.JMenuItem itemCadastroServiço;
    private javax.swing.JMenuItem itemConsultaCliente;
    private javax.swing.JMenuItem itemConsultaProduto;
    private javax.swing.JMenuItem itemConsultaServiço;
    private javax.swing.JMenuItem itemRelatorioCliente;
    private javax.swing.JMenuItem itemRelatorioProduto;
    private javax.swing.JMenuItem itemRelatorioServiço;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuJanela;
    private javax.swing.JMenu menuRelatório;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuUtilitário;
    // End of variables declaration//GEN-END:variables
}
