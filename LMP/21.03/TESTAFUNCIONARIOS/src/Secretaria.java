public class Secretaria extends Funcionario{
    int numRamal;

    public Secretaria(String nome, double salario, int numRamal) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Número de Ramal: " + this.numRamal);
    }

    public int getNumRamal() {
        return numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }
}
