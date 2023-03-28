public class Aluno extends Pessoa{
    protected int ra;

    public Aluno(int cpf, String nome, int ra) {
        super(cpf, nome);
        this.ra = ra;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println(this.ra);
    }

    public double calcMedia(double n1, double n2) {
        return ((n1 + n2)/2);
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
