public class Secretaria extends Funcionario{
    int numRamal;

    public Secretaria(String nome, double salario, int numRamal) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    public int getNumRamal() {
        return numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }
}
