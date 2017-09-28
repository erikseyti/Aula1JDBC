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
public class ConexaoJDBC {
    
    
    public void conexao(){
    try
        {
            String resposta = "";
            //conexão feita com o banco de dados
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Aula1","postgres","postgres");
            
            
                    
        }catch(Exception e)
            {
            e.printStackTrace();
            }
    }
}
