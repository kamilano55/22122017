/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pretinho
 */
public class UsuarioDAO {
    
    public boolean checkLogin(String login, String senha){
        
//        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean check = false;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
               check = true; 
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no acesso ao DB Usuário" +ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
       
        return check;
        
    }
       
}
