public abstract class Empregado {
    private String nome, sobrenome, cpf;

    public Empregado(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenomer() {
        return sobrenome;
    }

    public void setSobrenomer(String sobrenomer) {
        this.sobrenome = sobrenomer;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

     public abstract double vencimento();


}
