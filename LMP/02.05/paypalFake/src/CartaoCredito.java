public class CartaoCredito implements TipoPagamento {

    private double valor;

    public CartaoCredito(double valor) {
        this.valor = valor;
    }

    public int getDiasFaturamento() {
        return 20;
    }

    public double getPorcentagemFinanceira() {
        return 10;
    }
}
