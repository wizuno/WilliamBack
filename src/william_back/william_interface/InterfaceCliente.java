/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william_back.william_interface;

/**
 *
 * @author William
 */
public interface InterfaceCliente {
    
    void CadastrarCLiente(String nome,String cpfCpnj,boolean status,double valor);
    void CalcularMedia();
    
}
