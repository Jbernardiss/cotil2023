public class Main {
    public static void main(String[] args) {

        TipoPagamento cc = new CartaoCredito(10.00);
        TipoPagamento cash = new Dinheiro(15.00);
        TipoPagamento cheque = new Cheque(25.00);

        System.out.println(cc.getDiasFaturamento());
        System.out.println(cc.getPorcentagemFinanceira());
        System.out.println("------------------------");
        System.out.println(cash.getDiasFaturamento());
        System.out.println(cash.getPorcentagemFinanceira());
        System.out.println("------------------------");
        System.out.println(cheque.getDiasFaturamento());
        System.out.println(cheque.getPorcentagemFinanceira());
    }
}