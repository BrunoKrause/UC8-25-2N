import javax.swing.JOptionPane;
import Telas.*;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    
    
    public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPrincipal = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemNovo = new javax.swing.JMenuItem();
        itemEditar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemDesfazer = new javax.swing.JMenuItem();
        itemRefazer = new javax.swing.JMenuItem();
        menuExibir = new javax.swing.JMenu();
        itemZoom = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        item = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPrincipal.setBackground(new java.awt.Color(153, 153, 153));

        jToolBar1.setRollover(true);

        desktopPrincipal.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addGap(0, 362, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuArquivo.setText("Arquivo");

        itemNovo.setText("Novo");
        itemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemNovo);

        itemEditar.setText("Editar");
        itemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemEditar);

        jMenuBar1.add(menuArquivo);

        menuEditar.setText("Editar");

        itemDesfazer.setText("Desfazer");
        menuEditar.add(itemDesfazer);

        itemRefazer.setText("Refazer");
        menuEditar.add(itemRefazer);

        jMenuBar1.add(menuEditar);

        menuExibir.setText("Exibir");

        itemZoom.setText("Zoom");
        menuExibir.add(itemZoom);
        menuExibir.add(jSeparator1);

        item.setText("Régua");
        menuExibir.add(item);

        jMenuBar1.add(menuExibir);

        menuAjuda.setText("Ajuda");

        itemSobre.setText("Sobre o Sistema");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        JOptionPane.showMessageDialog(this,
                "Sistema Avaliação Java Swing"
                        + "\nVersão 1.0"
                        + "\nDesenvolvido pelos alunos");
    }//GEN-LAST:event_itemSobreActionPerformed

    private void itemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNovoActionPerformed
        NovoAluno tela = new NovoAluno();
        desktopPrincipal.add(tela);
        tela.setVisible(true);
        tela.setLocation(null);
    }//GEN-LAST:event_itemNovoActionPerformed

    private void itemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenuItem item;
    private javax.swing.JMenuItem itemDesfazer;
    private javax.swing.JMenuItem itemEditar;
    private javax.swing.JMenuItem itemNovo;
    private javax.swing.JMenuItem itemRefazer;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenuItem itemZoom;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuExibir;
    // End of variables declaration//GEN-END:variables
}
