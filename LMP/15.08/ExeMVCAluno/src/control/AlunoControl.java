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
public class AlunoControl 
{
    ArrayList <Aluno> listaAl;
    
    public AlunoControl ()
    {
        listaAl = new ArrayList<>(); //o ArrayList esta sendo inicializado dentro do construtor de AlunoControl
    }
    
    public void cadastrar(int raTela, String nomeTela)
    {
        Aluno aluno = new Aluno(raTela, nomeTela);
        listaAl.add(aluno);
        
         //for (Aluno a: listaAl)
        //{
       //   System.out.println(a.getRa());
      //     System.out.println(a.getNome());
     //  }
    // System.out.println("=================================");
    }
    
    public String mostrar()
    {
        String result = "";
        for (Aluno a: listaAl)
        {
           result = result.concat(a.getRa() + " " + a.getNome() + "\n");
        }
        return result;
    }
}
