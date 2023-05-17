public class Dinheiro implements TipoPagamento{

    private double valor;

    public Dinheiro(double valor) {
        this.valor = valor;
    }

    public int getDiasFaturamento() {
        return 0;
    }

    public double getPorcentagemFinanceira() {
        return 0;
    }
}
