/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william_back;

import william_back.bd_william.ClientesBD;

/**
 *
 * @author William
 */
public class William_Back {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clientes cliente = new Clientes();
        ClientesBD cli = new ClientesBD();
        

        cliente.setCpfCpnj("45090");
        cliente.setNome("ABB");
        cliente.setStatus(true);
        cliente.setValor(400.0);
        
        cli.Cadastrar(cliente);
        
        

        
    }
    
}
