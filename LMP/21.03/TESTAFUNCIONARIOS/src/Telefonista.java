public class Telefonista extends Funcionario{
    int codEstacao;

    public Telefonista(String nome, double salario, int codEstacao) {
        super(nome, salario);
        this.codEstacao = codEstacao;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Código estação: " + codEstacao);
    }

    public int getCodEstacao() {
        return codEstacao;
    }

    public void setCodEstacao(int codEstacao) {
        this.codEstacao = codEstacao;
    }
}
