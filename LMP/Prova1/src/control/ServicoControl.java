package control;


import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.ServicoDAO;
import model.Servico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ServicoControl {
    
    ServicoDAO servicoDAO = new ServicoDAO();
    
    public void cadastrar(int cod, String desc, double preco) throws SQLException, ClassNotFoundException {
        servicoDAO.cadastrarServico(cod, desc, preco);
    }
    
    public void deletar(int cod) throws SQLException, ClassNotFoundException {
        servicoDAO.excluirServico(cod);
    }
    
    public ArrayList<Servico> buscar() throws SQLException, ClassNotFoundException {
        
        ArrayList<Servico> listaServicos = servicoDAO.buscarServicos();
        return listaServicos;
    }
}
