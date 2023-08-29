/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Atleta {
    
    private static int numeroAtletas = 0;
    private int codigo;
    private String nome;
    private double peso;
    private int altura;
    private int idade;

    public Atleta(String nome, double peso, int altura, int idade) {
        numeroAtletas++;
        this.codigo = numeroAtletas;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static int getNumeroAtletas() {
        return numeroAtletas;
    }

    public static void setNumeroAtletas(int numeroAtletas) {
        Atleta.numeroAtletas = numeroAtletas;
    }
    
}
