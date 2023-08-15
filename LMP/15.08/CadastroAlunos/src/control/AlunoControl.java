/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    
    private ArrayList<Aluno> listaAl;

    public AlunoControl() {
        listaAl = new ArrayList<>();
    }
    
    public void cadastrar(int raTela, String nomeTela) {
        
        Aluno a = new Aluno(raTela, nomeTela);    
        listaAl.add(a);
        
        for(Aluno aluno : listaAl) {
            System.out.println(aluno.getRa() + ":" + aluno.getNome());
        }
    }
    
    public String mostrar() {
        
        String result = "";
        
        for(Aluno al: listaAl) {
            result = result.concat(al.getRa() + " " + al.getNome() + "\n");
        }
        return result;
    }
    
    public void excluir(int raTela) {
        
        for(Aluno al:listaAl) {
            if(al.getRa() == raTela) {
                listaAl.remove(al);
                break;
            }
        }
    }
}
