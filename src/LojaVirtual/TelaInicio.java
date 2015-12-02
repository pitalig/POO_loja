package LojaVirtual;

import java.beans.PropertyVetoException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class TelaInicio extends javax.swing.JFrame {

    Produto p1 = new Produto("1", 10.99, 300);
    Produto p2 = new Produto("2", 160.50, 50);
    Produto p3 = new Produto("3", 1.99, 100);
    Cliente c1 = new Cliente("João", "Avenida dos Estados, 19745, São Paulo - SP", "02113500", "11999558877", "98758936584", "29051990");
    Aluguel a1 = new Aluguel(LocalDate.of(2015, 11, 1), c1, p3, p3, p3);

    public TelaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItemNovoCliente = new javax.swing.JMenuItem();
        jMenuItemEditarCliente = new javax.swing.JMenuItem();
        jMenuItemListaCliente = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemNovaVenda = new javax.swing.JMenuItem();
        jMenuAluguel = new javax.swing.JMenu();
        jMenuItemNovoAluguel = new javax.swing.JMenuItem();
        jMenuItemDevolucao = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemAdicionarProduto = new javax.swing.JMenuItem();
        jMenuItemEditarProduto = new javax.swing.JMenuItem();
        jMenuItemListaProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/page.png"))); // NOI18N
        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/door_out.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/user.png"))); // NOI18N
        jMenuCliente.setText("Cliente");

        jMenuItemNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/user_add.png"))); // NOI18N
        jMenuItemNovoCliente.setText("Novo");
        jMenuItemNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemNovoCliente);

        jMenuItemEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/user_edit.png"))); // NOI18N
        jMenuItemEditarCliente.setText("Editar");
        jMenuItemEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemEditarCliente);

        jMenuItemListaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/user_go.png"))); // NOI18N
        jMenuItemListaCliente.setText("Lista");
        jMenuItemListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemListaCliente);

        jMenuBar1.add(jMenuCliente);

        jMenuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/cart.png"))); // NOI18N
        jMenuVenda.setText("Venda");

        jMenuItemNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/cart_add.png"))); // NOI18N
        jMenuItemNovaVenda.setText("Nova");
        jMenuItemNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemNovaVenda);

        jMenuBar1.add(jMenuVenda);

        jMenuAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/basket.png"))); // NOI18N
        jMenuAluguel.setText("Aluguel");

        jMenuItemNovoAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/basket_add.png"))); // NOI18N
        jMenuItemNovoAluguel.setText("Novo");
        jMenuItemNovoAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoAluguelActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemNovoAluguel);

        jMenuItemDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/basket_go.png"))); // NOI18N
        jMenuItemDevolucao.setText("Devolução");
        jMenuItemDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDevolucaoActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemDevolucao);

        jMenuBar1.add(jMenuAluguel);

        jMenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/controller.png"))); // NOI18N
        jMenuProdutos.setText("Produtos");

        jMenuItemAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/controller_add.png"))); // NOI18N
        jMenuItemAdicionarProduto.setText("Adicionar");
        jMenuItemAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemAdicionarProduto);

        jMenuItemEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/controller_error.png"))); // NOI18N
        jMenuItemEditarProduto.setText("Editar");
        jMenuItemEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemEditarProduto);

        jMenuItemListaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons 1/controller.png"))); // NOI18N
        jMenuItemListaProduto.setText("Lista");
        jMenuItemListaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListaProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemListaProduto);

        jMenuBar1.add(jMenuProdutos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaVendaActionPerformed
        disposeAll();
        TelaNovoVenda tela = new TelaNovoVenda();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovaVendaActionPerformed

    private void jMenuItemNovoAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoAluguelActionPerformed
        disposeAll();
        TelaNovoAluguel tela = new TelaNovoAluguel();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovoAluguelActionPerformed

    private void jMenuItemAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarProdutoActionPerformed
        disposeAll();
        TelaNovoProduto tela = new TelaNovoProduto();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdicionarProdutoActionPerformed

    private void jMenuItemListaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaProdutoActionPerformed
        disposeAll();
        TelaListaProduto tela = new TelaListaProduto();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaProdutoActionPerformed

    private void jMenuItemNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoClienteActionPerformed
        disposeAll();
        TelaNovoCliente tela = new TelaNovoCliente();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovoClienteActionPerformed

    private void jMenuItemListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListaClienteActionPerformed
        disposeAll();
        TelaListaCliente tela = new TelaListaCliente();
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemListaClienteActionPerformed

    private void jMenuItemDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDevolucaoActionPerformed
        disposeAll();
        //Dialogo para escolher aluguel
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icons 1/basket_go.png")));
        Object[] possibilities = Aluguel.toObject();
        String s;
        s = (String) JOptionPane.showInputDialog(
                this,
                "Escolha o aluguel: (referência - cliente)",
                "Devolução",
                JOptionPane.PLAIN_MESSAGE,
                figura,
                possibilities,
                "");

        //Pegar aluguel no arraylist operações
        Aluguel a = null;
        for (int i = 0; i < Operacao.operacoes.size(); i++) {
            if (s.contains(String.valueOf(i))) {
                a = (Aluguel) Operacao.operacoes.get(i);
            }
        }

        //Devolver
        double multa = a.devolver();

        //Mensagem
        if (multa > 0) {
            JOptionPane.showMessageDialog(this,
                    "Produtos devolvidos com atraso. Taxa extra: R$" + String.format("%.2f", multa),
                    "Devolução",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Produtos devolvidos.",
                    "Devolução",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemDevolucaoActionPerformed

    private void jMenuItemEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarClienteActionPerformed
        disposeAll();
        // Dialogo para escolher cliente
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icons 1/user_edit.png")));
        Object[] possibilities = Cliente.toObject();
        String s;
        s = (String) JOptionPane.showInputDialog(
                this,
                "Escolha o cliente:",
                "Editar Cliente",
                JOptionPane.PLAIN_MESSAGE,
                figura,
                possibilities,
                "");
        //Pegar cliente no arraylist clientes
        Cliente c = null;
        for (Cliente cliente : Cliente.clientes) {
            if (s.equals(cliente.getNome())) {
                c = cliente;
            }
        }
        disposeAll();
        TelaEditarCliente tela = new TelaEditarCliente(c);
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarClienteActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarProdutoActionPerformed
        disposeAll();
        // Dialogo para escolher produto
        Icon figura = new ImageIcon(getToolkit().createImage(getClass().getResource("/icons 1/controller_error.png")));
        Object[] possibilities = Produto.toObject();
        String s;
        s = (String) JOptionPane.showInputDialog(
                this,
                "Escolha o produto:",
                "Editar Produto",
                JOptionPane.PLAIN_MESSAGE,
                figura,
                possibilities,
                "");
        Produto p = null;
        for (Produto produto : Produto.produtos) {
            if (s.equals(produto.getNome())) {
                p = produto;
            }
        }
        disposeAll();
        TelaEditarProduto tela = new TelaEditarProduto(p);
        jDesktopPane1.add(tela);
        try {
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarProdutoActionPerformed

    private void disposeAll() {
        JInternalFrame[] frames = jDesktopPane1.getAllFrames();
        for (JInternalFrame frame : frames) {
            frame.dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAluguel;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemAdicionarProduto;
    private javax.swing.JMenuItem jMenuItemDevolucao;
    private javax.swing.JMenuItem jMenuItemEditarCliente;
    private javax.swing.JMenuItem jMenuItemEditarProduto;
    private javax.swing.JMenuItem jMenuItemListaCliente;
    private javax.swing.JMenuItem jMenuItemListaProduto;
    private javax.swing.JMenuItem jMenuItemNovaVenda;
    private javax.swing.JMenuItem jMenuItemNovoAluguel;
    private javax.swing.JMenuItem jMenuItemNovoCliente;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables
}
