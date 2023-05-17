public class Assalariado extends Empregado{
    private double salario;

    public double vencimento(){
        return getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
