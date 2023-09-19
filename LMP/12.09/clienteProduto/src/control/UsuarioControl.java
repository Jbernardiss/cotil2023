/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author aluno
 */
public class UsuarioControl {
    
    public void inserir(String nome, int cpf, int idade) throws SQLException, ClassNotFoundException {
        Usuario us = new Usuario(nome, cpf, idade);
        UsuarioDAO usDAO = new UsuarioDAO();
        usDAO.cadastrarUsuario(us);
    }
    
    public void excluir(int cpf) throws SQLException, ClassNotFoundException {
        UsuarioDAO usDAO = new UsuarioDAO();
        usDAO.excluirUsuario(cpf);
    }
    
    public ArrayList<Usuario> buscar() throws SQLException, ClassNotFoundException {
        UsuarioDAO usDAO = new UsuarioDAO();
        ArrayList<Usuario> usuarios = usDAO.consultarUsuarios();
        
        return usuarios;
    }
}
