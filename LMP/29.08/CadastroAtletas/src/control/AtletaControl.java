/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaControl {
    ArrayList<Atleta> listaAtletas = new ArrayList<>();
    
    public void cadastrarAtleta(String nome, int idade, double peso, int altura){
        
        Atleta atleta = new Atleta(nome, peso, altura, idade);
        listaAtletas.add(atleta);
        
    }
    
    public double mediaPesos() {
        
        double somaPesos = 0;
        
        for(Atleta a:listaAtletas) {
            somaPesos += a.getPeso();
        }
        
        return somaPesos / Atleta.getNumeroAtletas() ;
    }
}
