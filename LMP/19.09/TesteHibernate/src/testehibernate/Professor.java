package testehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Professor {

    @Id
    private int codigo;

    @Column
    private String nome;

    @Column
    private double salario;


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
}
