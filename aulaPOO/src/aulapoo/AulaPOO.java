/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo;

import java.sql.Connection;
import java.sql.DriverManager;
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
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Aula1","postgres","postgres");
            do{
            
            Scanner scam = new Scanner(System.in);
            System.out.println("Digite o seu nome");
            String  nome = scam.next();
            System.out.println(nome);
            
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
