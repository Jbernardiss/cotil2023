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
    private static ArrayList<Atleta> listaAtletas = new ArrayList<>();
    
    public void cadastrarAtleta(String nome, int idade, double peso, int altura){
        
        Atleta atleta = new Atleta(nome, peso, altura, idade);
        listaAtletas.add(atleta);
        
    }
    
    public double mediaPesos() {
        
        if(listaAtletas.isEmpty()) {
            return 0;
        }
        
        double somaPesos = 0;
        
        for(Atleta a:listaAtletas) {
            somaPesos += a.getPeso();
        }
        
        return somaPesos / Atleta.getNumeroAtletas() ;
    }
    
    public Atleta getAtletaMaisAlto() {
        
        if(listaAtletas.isEmpty()) {
            return null;
        }
                
        int maiorAltura = listaAtletas.get(0).getAltura();
        Atleta maiorAtleta = listaAtletas.get(0);
        
        for(Atleta a: listaAtletas) {
            if(a.getAltura() > maiorAltura) {
                maiorAltura = a.getAltura();
                maiorAtleta = a;
            }
        }
        
        return maiorAtleta;
    }
    
    public int[] getMaiorEMenoridade() {
        
        int[] returnArray = {0, 0};
        
        for(Atleta a : listaAtletas) {
            if(a.getIdade() > 18) {
                returnArray[1]++;
            } else {
                returnArray[0]++;
            }
        }
        
        return returnArray;
    }

    public static ArrayList<Atleta> getListaAtletas() {
        return listaAtletas;
    }
    
    public ArrayList<Atleta> getAtletaPorNome(String nome){
        ArrayList<Atleta> arrayRetorno = new ArrayList<>();
        int encontrou = 0;
        for(Atleta a: listaAtletas){
            if(a.getNome().toLowerCase().contains(nome.toLowerCase())) {
                arrayRetorno.add(a);
                encontrou = 1;
            }
        }
            
        if(encontrou == 0){
            return null;
        }
        return arrayRetorno;
    }
    
    public ArrayList<Atleta> getAtletaPorCodigo(int codigo){
        ArrayList<Atleta> arrayRetorno = new ArrayList<>();
        int encontrou = 0;
        for(Atleta a: listaAtletas){
            if(a.getCodigo() == codigo){
                arrayRetorno.add(a);
                encontrou = 1;
            }
        }
              
        if(encontrou == 0){
            return null;
        }
                
        return arrayRetorno;
    }
            
    public ArrayList<Atleta> getAtletaPorIdade(int idade){
        ArrayList<Atleta> arrayRetorno = new ArrayList<>();
        int encontrou = 0;
        for(Atleta a: listaAtletas){
            if(a.getIdade() == idade){
                arrayRetorno.add(a);
                encontrou = 1;
            }
        }
                
        if(encontrou == 0){
            return null;
        }
                
        return arrayRetorno;
    }
    
    public ArrayList<Atleta> getAtletaPorPeso(double peso){
        ArrayList<Atleta> arrayRetorno = new ArrayList<>();
        int encontrou = 0;
        for(Atleta a: listaAtletas){
            if(a.getPeso() == peso){
                arrayRetorno.add(a);
                encontrou = 1;
            }
        }
                
        if(encontrou == 0){
            return null;
        }
                
        return arrayRetorno;
    }
     
    public ArrayList<Atleta> getAtletaPorAltura(int altura){
        ArrayList<Atleta> arrayRetorno = new ArrayList<>();
        int encontrou = 0;
        for(Atleta a: listaAtletas){
            if(a.getAltura() == altura){
                arrayRetorno.add(a);
                encontrou = 1;
            }
        }
                
        if(encontrou == 0){
            return null;
        }
                
        return arrayRetorno;
    }
    
    public void excluirAtleta(Atleta atleta) {
        listaAtletas.remove(atleta);
        
        if(Atleta.getNumeroAtletas() > 0) {
            Atleta.setNumeroAtletas(Atleta.getNumeroAtletas() - 1);
        }
    }
}
