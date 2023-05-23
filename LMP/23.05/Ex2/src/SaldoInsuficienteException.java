public class SaldoInsuficienteException extends RuntimeException{

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public SaldoInsuficienteException(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getMessage(){
        return "Saldo insuficiente, não foi possível realizar transações! Saldo Atual: " + saldo;
    }
}
