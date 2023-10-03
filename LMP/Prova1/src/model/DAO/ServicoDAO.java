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
import model.Servico;

/**
 *
 * @author aluno
 */
public class ServicoDAO {
    
    private Connection conn;
    
    public void cadastrarServico(int cod, String desc, double preco) throws SQLException, ClassNotFoundException {
        

        conn = Conexao.getConexao();
        String sql = "INSERT INTO veterinarioProva (codigo, descr, preco) VALUES (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, cod);
        stmt.setString(2, desc);
        stmt.setDouble(3, preco);
            
        stmt.execute();
        stmt.close();
            
        conn.close();
    }
    
    public void excluirServico(int cod) throws SQLException, ClassNotFoundException {
        
        
        conn = Conexao.getConexao();
        String sql = "DELETE FROM veterinarioProva WHERE codigo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, cod);
            
        stmt.execute();
        stmt.close();
            
        conn.close();
    }
    
    public ArrayList<Servico> buscarServicos() throws SQLException, ClassNotFoundException {
        
        ArrayList<Servico> listaServico = new ArrayList<>();
        
        ResultSet res;
        
        
        conn = Conexao.getConexao();
        String sql = "SElECT * FROM veterinarioProva";
        PreparedStatement stmt = conn.prepareStatement(sql);
        res = stmt.executeQuery();
            
        while(res.next()) {
                
            int cod = res.getInt("codigo");
            String desc = res.getString("descr");
            double preco = res.getDouble("preco");
                
            listaServico.add(new Servico(cod, desc, preco));
        }
            
        return listaServico;
    }
}
