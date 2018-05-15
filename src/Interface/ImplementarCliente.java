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
        System.out.println(resposta);
    }

    @Override
    public void PessoasEnvolvidas() {
        
         respostaArray = clienteBd.PessoasEnvolvidas();
         int tamanho = respostaArray.size();
         if(tamanho != 0){
             for(int i=0; i < tamanho; i=i+2){
                 System.out.println(respostaArray.get(i) + " " + respostaArray.get(i+1));
             }
           
         }
         else{
             System.out.println("Nenhuma pessoa encontrada!");
         }
    }
    
}
