/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import william_back.Clientes;
import BD.ClientesBD;

/**
 *
 * @author William
 */
public class ImplementarCliente implements InterfaceCliente {

    ClientesBD clienteBd = new ClientesBD();
    String resposta;
    ArrayList respostaArray = new ArrayList();
    
    @Override
    public void CadastrarCLiente(Clientes cliente) {
               
        resposta = clienteBd.Cadastrar(cliente);
    }

    @Override
    public void CalcularMedia() {
        
        resposta = clienteBd.CalcularMedia();
    }

    @Override
    public void PessoasEnvolvidas() {
        
         respostaArray = clienteBd.PessoasEnvolvidas();
    }
    
}
