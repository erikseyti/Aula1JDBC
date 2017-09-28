/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ConexaoJDBC {
    
    private static Connection conn;
    
    public static synchronized Connection getConexao()
    {
        if(conn ==null)
        {
            try {
                conn = DriverManager.getConnection("","","");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    return conn;
    }
    
    
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
