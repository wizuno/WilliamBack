/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william_back;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import william_back.bd_william.ClientesBD;
import william_back.william_interface.InterfaceCliente;

/**
 *
 * @author William
 */
public class Clientes implements InterfaceCliente {

 
    
     private String nome;
     private boolean status;
     private String cpfCpnj;
     private double valor;
     private String resposta;
    
    ClientesBD cliente = new ClientesBD();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public boolean isStatus() {
        return status;
    }

 
    public void setStatus(boolean status) {
        this.status = status;
    }


    public String getCpfCpnj() {
        return cpfCpnj;
    }


    public void setCpfCpnj(String cpfCpnj) {
        this.cpfCpnj = cpfCpnj;
    }

 
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
      
    
    @Override
    public void CadastrarCLiente(String nome,String cpfCnpj,boolean status,double valor) {
        
        resposta = cliente.Cadastrar(nome, cpfCnpj, status, valor);
        JOptionPane.showMessageDialog(null,resposta);
        
    }

    @Override
    public void CalcularMedia() {
             
       resposta =  cliente.CalcularMedia();
       System.out.println(resposta);
        
    }
    
    public void ExibirPessoas(){
        
        ArrayList respostaArray = new ArrayList();
        
        respostaArray = cliente.PessoasEnvolvidas();
        int tamanho = respostaArray.size();
        
        if(tamanho != 0){
          for(int i=0; i < tamanho; i=i+2){
            System.out.println(respostaArray.get(i)+ " " + respostaArray.get(i+1));
            
          }  
        }else{
            System.out.println("Sem resultados!!");
        }
        
        
    }
    
}
