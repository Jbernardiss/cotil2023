public class Bolsista extends Aluno{

    private double bolsa;

    public Bolsista(int cpf, String nome, int ra, double bolsa) {
        super(cpf, nome, ra);
        this.bolsa = bolsa;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println(bolsa);
    }

    @Override
    public void mostraTipo() {
        System.out.println("É um bolsista");
    }

    public Bolsista(int cpf, String nome, int ra) {
        super(cpf, nome, ra);
    }

    public double calcMedia(double n1, double n2) {
        return (((n1 + n2)/2) + 1) ;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
