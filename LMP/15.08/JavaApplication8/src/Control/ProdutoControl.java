/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProdutoControl {
    ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public ProdutoControl() {
        
    }
    
    public void cadastrar(int codigo, String descricao, Double preco){
        Produto produto = new Produto(codigo, descricao, preco);
        listaProdutos.add(produto);
    }
    
    public ArrayList<Produto> getArray(){
        return listaProdutos;
    }
}
