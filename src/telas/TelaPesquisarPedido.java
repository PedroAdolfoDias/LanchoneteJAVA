package telas;

import atendente.Atendente;
import cliente.Cliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pedido.DadosPedido;
import pedido.Pedido;
import pedido.RegrasPedido;

public class TelaPesquisarPedido extends javax.swing.JFrame {

    /**
     * Creates new form FormPedidoCliente
     */
    public TelaPesquisarPedido() {
        initComponents();
        carregarVendas();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPesquisaIndividual = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACOMPANHAR PEDIDOS");

        jtPedidos.setBackground(new java.awt.Color(204, 204, 204));
        jtPedidos.setBorder(new javax.swing.border.MatteBorder(null));
        jtPedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "STATUS", "CÓDIGO"
            }
        ));
        jtPedidos.setName("LISTA DE PEDIDOS"); // NOI18N
        jScrollPane1.setViewportView(jtPedidos);
        if (jtPedidos.getColumnModel().getColumnCount() > 0) {
            jtPedidos.getColumnModel().getColumn(1).setMinWidth(200);
            jtPedidos.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtPedidos.getColumnModel().getColumn(1).setMaxWidth(200);
            jtPedidos.getColumnModel().getColumn(2).setMinWidth(110);
            jtPedidos.getColumnModel().getColumn(2).setPreferredWidth(110);
            jtPedidos.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lanchonete/imagens/icons8-binóculos-34.png"))); // NOI18N
        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF:");

        jtPesquisaIndividual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITENS PEDIDOS", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtPesquisaIndividual);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RESULTADO DA PESQUISA PARA O NOME DIGITADO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addComponent(jtfNome)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // Chama todos os pedidos de um cliente:
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();
        DadosPedido dadosPedido = new DadosPedido();
        RegrasPedido regrasPedido = new RegrasPedido();
        cliente.setCpf(jtfNome.getText());
        pedido.setCliente(cliente);
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<Pedido> listaPedidosCPF = null;
        try {
            listaPedidosCPF = regrasPedido.pesquisarPedidoClienteporCPF(pedido);
        } catch (Exception ex) {
            //Logger.getLogger(TelaPesquisarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.setColumnIdentifiers(new Object[]{"ITENS PEDIDOS", "STATUS"});
        for (Pedido p : listaPedidosCPF) {
            modelo.addRow(new Object[]{p.getProduto().getNome(), p.getStatus()});
        }
        jtPesquisaIndividual.setModel(modelo);


    }//GEN-LAST:event_jbPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarPedido().setVisible(true);
            }
        });
    }

    /*
    Carrega todas as vendas na tabela da tela.
     */
    private void carregarVendas() {

        try {

            Pedido filtro = new Pedido();
            Pedido pedidos = new Pedido();
            Atendente atendente = new Atendente();
            DadosPedido dadosPedidos = new DadosPedido();

            ArrayList<Pedido> listaPedidos = dadosPedidos.pesquisarPedidoClientePendentes();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"CÓDIGO", "NOME", "CLIENTE", "STATUS"});
            for (Pedido pedido : listaPedidos) {
                modelo.addRow(new Object[]{pedido.getCod_pedido(), pedido.getProduto().getNome(), pedido.getCliente().getNome(), pedido.getStatus()});
            }
            jtPedidos.setModel(modelo);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    /**
     * Carrega todas as vendas para um determinado cliente.
     *
     * @param nomeCliente
     */
    private void carregarVendaspeloCliente(String nomeCliente) {

        /*


         */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTable jtPesquisaIndividual;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
