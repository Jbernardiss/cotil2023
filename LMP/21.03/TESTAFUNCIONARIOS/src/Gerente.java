public class Gerente extends Funcionario{
    String nomeUsuario;
    String senha;

    public Gerente(String nome, double salario, String nomeUsuario, String senha){
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public double calcBonificacao() {
        return (salario * 0.2);
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Usuário: " + this.nomeUsuario);
        System.out.println("Senha: " + this.senha);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
