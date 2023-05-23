public class ContaInvestimento extends ContaBancaria{
    public ContaInvestimento(double saldo) {
        super(saldo);
    }

    @Override
    public double calcularSaldo(){
        return getSaldo() * 1.05;
    }
}
