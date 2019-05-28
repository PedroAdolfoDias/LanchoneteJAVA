/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegrasCliente {

    public void cadastrarCliente(Cliente cliente) throws Exception {

        if ("".equals(cliente.getNome()) || "".equals(cliente.getCpf())) {
            try {
                JOptionPane.showMessageDialog(null, "Informar os dados do cliente");
            } catch (Exception ex) {
                Logger.getLogger(RegrasCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (cliente.getNome().trim().length() > 200) {
                try {
                    JOptionPane.showMessageDialog(null, "O nome do cliente deverá ter menos de 200 caracteres");
                } catch (Exception ex) {
                    Logger.getLogger(RegrasCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (cliente.getCpf().trim().length() > 200) {
                try {
                    JOptionPane.showMessageDialog(null, "O cpf do cliente deverá ter menos de 200 caracteres");
                } catch (Exception ex) {
                    Logger.getLogger(RegrasCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            DadosCliente dadosCliente = new DadosCliente();
            dadosCliente.cadastrarCliente(cliente);
        }
    }
}