public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double qntSaque) {
        if (qntSaque > 0) {
            if (saldo - qntSaque < 0) {
                System.out.println("Não foi possível concluir o saque, o valor excede o valor na Conta");
            } else {
                saldo = saldo - qntSaque;
            }
        } else {
            System.out.println("Valor negativo não é aceito");
        }
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
        }
    else

    {
        System.out.println("Valor negativo não é aceito");
    }
}
}
