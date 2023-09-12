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

import model.Aluno;

/**
 *
 * @author taniabasso
 */
public class AlunoDAO {
    
    Connection con = null;
    
    public void inserirAluno(Aluno al) throws SQLException, ClassNotFoundException
    {
            con = new Conexao().getConnection();
            String sql = "Insert into alunoJava (ra, nome) values (?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
            
            con.close();
    }
    
    public void excluirAluno(int ra) throws SQLException, ClassNotFoundException {
        con = new Conexao().getConnection();
        String sql = "delete from alunoJava where (ra = ?)";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ra);
        stmt.execute();
        stmt.close();
        
        con.close();
                
    }
    
    public ArrayList<Aluno> buscarAlunos() throws SQLException, ClassNotFoundException {
        ResultSet res;
        ArrayList<Aluno> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "select * from alunoJava";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        res = stmt.executeQuery();
        while(res.next()) {
            int ra = res.getInt("RA");
            String nome = res.getString("NOME");
            Aluno al = new Aluno(ra, nome);
            lista.add(al);
        }
        
        stmt.close();
        con.close();
        return lista;
    }
}