public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override

    public double calcularSaldo(){
        return getSaldo() * 0.90;
    }
}
