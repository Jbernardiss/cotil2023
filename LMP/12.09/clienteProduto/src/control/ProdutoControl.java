/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.ProdutoDAO;
import model.Produto;

/**
 *
 * @author aluno
 */
public class ProdutoControl {
    
    
    public void cadastrar(int ID, String nome, double preco, int estoque) throws SQLException, ClassNotFoundException{
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrarProduto(ID, nome, preco, estoque);
    }
    
    public void excluir(int ID) throws SQLException, ClassNotFoundException{
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.excluirProduto(ID);
    }
    
    public ArrayList<Produto> consultar() throws SQLException, ClassNotFoundException{
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.consultarProduto();

        return produtos;
    }
}
