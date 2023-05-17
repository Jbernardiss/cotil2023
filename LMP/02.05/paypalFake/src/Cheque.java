public class Cheque implements TipoPagamento{

    private double valor;

    public Cheque(double valor) {
        this.valor = valor;
    }

    public int getDiasFaturamento() {
        return 3;
    }

    public double getPorcentagemFinanceira() {
        return 3;
    }
}
