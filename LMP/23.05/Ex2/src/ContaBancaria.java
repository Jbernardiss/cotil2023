public abstract class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        if(valor <= 0){
            throw new ValorInvalidoException(valor);
        }else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor <= 0){
            throw new ValorInvalidoException(valor);
        }else{
            if(getSaldo() - valor < 0){
                throw new SaldoInsuficienteException(getSaldo());
            }else{
                this.saldo += valor;
            }
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino){
        if(valor <= 0){
            throw new ValorInvalidoException(valor);
        }else{
            if(getSaldo() - valor < 0){
                throw new SaldoInsuficienteException(getSaldo());
            }else{
                this.saldo -= valor;
                contaDestino.setSaldo(getSaldo() + valor);
            }
        }
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double calcularSaldo(){
        return getSaldo();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
