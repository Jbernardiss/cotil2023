/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;
import model.Usuario;

/**
 *
 * @author aluno
 */
public class ProdutoDAO {
    
    Connection con = null;
    
    public void cadastrarProduto(int ID, String nome, double preco, int estoque) throws SQLException, ClassNotFoundException{
        con = Conexao.getConnection();
        String sql = "INSERT INTO produtoJava(id, nome, preco, estoque) values(?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ID);
        stmt.setString(2, nome);
        stmt.setDouble(3, preco);
        stmt.setInt(4, estoque);
        
        stmt.execute();
        stmt.close();
        
        con.close();
    }
    
    public void excluirProduto(int ID) throws SQLException, ClassNotFoundException{
        con = Conexao.getConnection();
        String sql = "DELETE FROM produtoJava WHERE cpf = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ID);
        stmt.execute();
        stmt.close();
        
        con.close();
    }
    
    public ArrayList<Produto> consultarProduto() throws SQLException, ClassNotFoundException{
        ResultSet res;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        con = Conexao.getConnection();
        String sql = "select * from produtoJava";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        res = stmt.executeQuery();
        while(res.next()) {
            int ID = res.getInt("id");
            String nome = res.getString("nome");
            double preco = res.getDouble("preco");
            int estoque = res.getInt("estoque");
            Produto produto = new Produto(ID, nome, preco, estoque);
            produtos.add(produto);
        }     
        stmt.close();
        con.close();
             
        return produtos;
    }
    
}
