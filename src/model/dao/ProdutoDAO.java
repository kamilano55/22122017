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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Pretinho
 */
public class ProdutoDAO {
    
    public void create(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO dvd (dvd_titulo,dvd_genero,dvd_classificacao,dvd_sinopse,dvd_imagem) VALUES(?,?,?,?,?)");
            
            stmt.setString(1, p.getDvd_titulo());
            stmt.setString(2, p.getDvd_genero());
            stmt.setString(3, p.getDvd_classificacao());
            stmt.setString(4, p.getDvd_sinopse());
            stmt.setString(5, p.getDvd_imagem());
            
            
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
            
        }
        
    }
     
    public List<Produto> read(){
//        
      Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        
        List<Produto> produtos = new ArrayList<>();
        
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM dvd");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setId_dvd(rs.getInt("id_dvd"));
                produto.setDvd_titulo(rs.getString("dvd_titulo"));
                produto.setDvd_genero(rs.getString("dvd_genero"));
                produto.setDvd_classificacao(rs.getString("dvd_classificacao"));
                produto.setDvd_sinopse(rs.getString("dvd_sinopse"));
                produto.setDvd_imagem(rs.getString("dvd_imagem"));
                
                produtos.add(produto);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar" +ex.getMessage());
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
        
    }
    
    
    
  
    public List<Produto> readForTytle(String titulo){
//        
      Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
//        
        List<Produto> produtos = new ArrayList<>();
        
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM dvd WHERE dvd_titulo LIKE ?");
            
            stmt.setString(1, "%"+titulo+"%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setId_dvd(rs.getInt("id_dvd"));
                produto.setDvd_titulo(rs.getString("dvd_titulo"));
                produto.setDvd_genero(rs.getString("dvd_genero"));
                produto.setDvd_classificacao(rs.getString("dvd_classificacao"));
                produto.setDvd_sinopse(rs.getString("dvd_sinopse"));
                produto.setDvd_imagem(rs.getString("dvd_imagem"));
                
                produtos.add(produto);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Listar" +ex.getMessage());
            
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
        
        
        
    }
//    
   public void update(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE dvd SET dvd_titulo = ?,dvd_genero = ?,dvd_classificacao = ?,dvd_sinopse = ?,dvd_imagem = ? WHERE ID_DVD = ?");
            
            stmt.setString(1, p.getDvd_titulo());
            stmt.setString(2, p.getDvd_genero());
            stmt.setString(3, p.getDvd_classificacao());
            stmt.setString(4, p.getDvd_sinopse());
            stmt.setString(5, p.getDvd_imagem());
            stmt.setInt(6, p.getId_dvd());
            
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!! " +ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
            
        }
        
    }     
    
   public void delete(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM dvd WHERE ID_DVD = ?");
            
            stmt.setInt(1, p.getId_dvd());
            
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!! " +ex.getMessage());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
            
            
        }
        
    }
    
        
}