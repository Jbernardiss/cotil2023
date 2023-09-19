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
import model.Usuario;

/**
 *
 * @author aluno
 */
public class UsuarioDAO {
    
    Connection con = null;
    
    public void cadastrarUsuario(Usuario us) throws SQLException, ClassNotFoundException {
        
        con = Conexao.getConnection();
        String sql = "insert into usuarioJava(cpf, nome, idade) values(?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, us.getCpf());
        stmt.setString(2, us.getNome());
        stmt.setInt(3, us.getIdade());
        
        stmt.execute();
        stmt.close();
        
        con.close();
    }
    
    public void excluirUsuario(int cpf) throws SQLException, ClassNotFoundException {
        
        con = Conexao.getConnection();
        String sql = "delete from usuarioJava where(cpf = ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, cpf);
        stmt.execute();
        stmt.close();
        
        con.close();
    }
    
    public ArrayList<Usuario> consultarUsuarios() throws SQLException, ClassNotFoundException {
        ResultSet res;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        
        
        con = Conexao.getConnection();
        String sql = "select * from usuarioJava";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        res = stmt.executeQuery();
        while(res.next()) {
            int cpf = res.getInt("cpf");
            String nome = res.getString("nome");
            int idade = res.getInt("idade");
            Usuario us = new Usuario(nome, cpf, idade);
            usuarios.add(us);
        }
        
        stmt.close();
        con.close();
        return usuarios;
    }
}
