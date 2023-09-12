/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

/**
 *
 * @author taniabasso
 */
public class AlunoControl {
    
    public void inserir (int ra, String nome) throws SQLException, ClassNotFoundException
    {
        Aluno al = new Aluno(ra,nome);
        AlunoDAO alDao = new AlunoDAO();
        alDao.inserirAluno(al);
    }
    
    public void excluir (int ra) throws SQLException, ClassNotFoundException{
        AlunoDAO alDao = new AlunoDAO();
        alDao.excluirAluno(ra);
    }
    
    public ArrayList<Aluno> buscar() throws SQLException, ClassNotFoundException{
        AlunoDAO alDao = new AlunoDAO();
        return alDao.buscarAlunos();
    }
    
}
