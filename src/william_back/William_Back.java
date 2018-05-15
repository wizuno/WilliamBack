/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william_back;


import Interface.ImplementarCliente;

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
        ImplementarCliente cli = new ImplementarCliente();
   
        cli.PessoasEnvolvidas();
        cli.CalcularMedia();
    }
    
}
