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
public class Conta {
    public static void main(String[] args)
    {
    try
        {
            String resposta = "";
            //conexão feita com o banco de dados
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Aula1","postgres","postgres");
            do{
            Scanner scam = new Scanner(System.in); 
            
            System.out.println("Digite o Valor de seu Saldo");
            String  saldo = scam.next();
            
            double valorSaldo = Double.parseDouble(saldo);
            
            System.out.println("Digite o Valor de seu ID do Cliente");
            String  idCliente = scam.next();
            Integer valorIdCliente = Integer.parseInt(idCliente);
     
            
                PreparedStatement ps = conn.prepareStatement("INSERT INTO CONTA (SALDO,IDCLIENTE) VALUES (?,?)");
                ps.setDouble(1, valorSaldo);
                ps.setInt(2,valorIdCliente);
                ps.execute();
            System.out.println("Deseja digitar outro saldo? sim ou nao");
            resposta = scam.next();
            }
            while(resposta.equals("sim"));
                    
        }catch(Exception e)
            {
            e.printStackTrace();
            }
    
    }
    
}
