public class Professor extends Pessoa{
    private double salario;

    public Professor(int cpf, String nome, double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
