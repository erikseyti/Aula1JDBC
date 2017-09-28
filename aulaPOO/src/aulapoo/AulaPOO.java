/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AulaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String resposta = "";
            //conexão feita com o banco de dados
            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Aula1","postgres","postgres");
            /*erik
            
            conn.prepareCall("DROP TABLE CLIENTE").execute();
            conn.prepareCall("create table cliente\n"+
                    "id serial not null\n"+
                    "nome varchar(50)\n"+
                    "constraint pk_cliente primary key (id)\n"+");").execute();
            */
            do{
            
            Scanner scam = new Scanner(System.in);
            System.out.println("Digite o seu nome");
            String  nome = scam.next();
            
                PreparedStatement ps = conn.prepareStatement("INSERT INTO CLIENTE (NOME) VALUES (?)");
                ps.setString(1, nome);
                ps.execute();
            System.out.println("Deseja digitar outro nome? sim ou nao");
            resposta = scam.next();
            }
            while(resposta.equals("sim"));
                    
        }catch(Exception e)
            {
            e.printStackTrace();
            }
    }
    
}
