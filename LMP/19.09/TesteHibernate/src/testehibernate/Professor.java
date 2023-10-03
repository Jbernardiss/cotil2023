package testehibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Professor {

    @Id
    private int codigo;

    @Column
    private String nome;

    @Column
    private double salario;

    @OneToMany
    @JoinColumn (name = "profResponsavel")
    private List<Disciplina> listaDisc;

    public Professor(int id, String nome, double salario) {
        this.codigo = id;
        this.nome = nome;
        this.salario = salario;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Disciplina> getListaDisc() {
        return listaDisc;
    }

    public void setListaDisc(List<Disciplina> listaDisc) {
        this.listaDisc = listaDisc;
    }
}
