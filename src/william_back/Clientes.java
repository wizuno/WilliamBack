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
public class Clientes {

 
    
     private String nome;
     private boolean status;
     private String cpfCpnj;
     private double valor;

    
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
          
}
