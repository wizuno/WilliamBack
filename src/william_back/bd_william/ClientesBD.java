/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william_back.bd_william;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import william_back.Clientes;

/**
 *
 * @author William
 */
public class ClientesBD {
    
    String resposta;
    public void CriarTabela(){
        
        String comando;
        comando = "CREATE TABLE tb_customer_account (id_customer SERIAL,"
                + "cpf_cnpj CHAR(11), nm_customer CHAR(20), is_active BOOLEAN, vl_total REAL, PRIMARY KEY(id_customer));";
        
         try {

            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "230490";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario ,senha);

            System.out.println("Banco de dados acessado");
            
          java.sql.Statement stm = con.createStatement();  
          stm.executeUpdate(comando);
                 
          con.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("Não foi possível acessar o banco de dados");
            }        
        
    }
    
    public String Cadastrar(Clientes cliente){
        
        String comando;
        comando = "INSERT INTO tb_customer_account (cpf_cnpj,nm_customer,is_active,vl_total) "
                + "VALUES ('"+cliente.getCpfCpnj()+ "','"+ cliente.getNome().toUpperCase()+ "',"+ cliente.isStatus()+ ","+ cliente.getValor()+ ");";
        
         try {

            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "230490";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario ,senha);

            //System.out.println("Banco de dados acessado");
            
          java.sql.Statement stm = con.createStatement();  
          stm.executeUpdate(comando);
                 
          con.close();
          resposta = "Pessoa cadastrada com sucesso!";
        }
        catch (Exception e) {
            
            e.printStackTrace();
            //System.out.println("Não foi possível acessar o banco de dados");
            resposta = "Não foi possível cadastrar a pessoa!";
            }      
         return resposta;
    }
        
    public String CalcularMedia(){
        
        double media=0;
        int pessoas=0;
        String comando;
        resposta = "Não foram encontrada pessoas para as condições buscadas!";
        
        comando = "SELECT vl_total as total FROM tb_customer_account WHERE vl_total > 560.0 AND id_customer BETWEEN 1500 AND 2700;";
        
         try {

            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "230490";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario ,senha);

            //System.out.println("Banco de dados acessado");
            
          PreparedStatement stmt = con.prepareStatement(comando);
          
            ResultSet rs = stmt.executeQuery();
            
                    while(rs.next()){
                    media = media+ (rs.getDouble("total"));
                    pessoas= pessoas+1;
                    
                    }
                    double c = media/pessoas;
                    if(pessoas !=0){
                        resposta = "A média é de R$ "+ c;
                        
                    }
                       
          con.close();
        }
        catch (Exception e) {   
            
            e.printStackTrace();
            //System.out.println("Não foi possível acessar o banco de dados");
            }  
         
         return resposta;
        
    }
    
    public ArrayList PessoasEnvolvidas(){
        
        ArrayList respostaArray = new ArrayList();
        String comando;
        
        comando = "SELECT nm_customer,vl_total FROM tb_customer_account WHERE vl_total > 560.0 AND id_customer BETWEEN 1500 AND 2700 "
                + "ORDER BY vl_total DESC;";
        
         try {

            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "230490";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario ,senha);

            //System.out.println("Banco de dados acessado");
            
          PreparedStatement stmt = con.prepareStatement(comando);
          
            ResultSet rs = stmt.executeQuery();
            
                    while(rs.next()){
                      respostaArray.add(rs.getString("nm_customer"));
                      respostaArray.add(rs.getDouble("vl_total"));
                    }
                                           
          con.close();
        }
        catch (Exception e) {   
            
            e.printStackTrace();
            //System.out.println("Não foi possível acessar o banco de dados");
            
            }  
         
        return respostaArray;
    }
            
    
    /*
    public void Editar(Clientes cliente){
        
        String comando;
        comando = "UPDATE tb_customer_account SET is_active = '"+ cliente.isStatus()
                + "' WHERE nm_costumer = '" + cliente.getNome().toUpperCase() +"';";
        
         try {

            String url = "jdbc:postgresql://localhost:5432/banco";
            String usuario = "postgres";
            String senha = "230490";

            Class.forName("org.postgresql.Driver");

            Connection con;

            con = DriverManager.getConnection(url, usuario ,senha);

            System.out.println("Banco de dados acessado");
            
          java.sql.Statement stm = con.createStatement();  
          stm.executeUpdate(comando);
                 
          con.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
            System.out.println("Não foi possível acessar o banco de dados");
            }        
    } */
}