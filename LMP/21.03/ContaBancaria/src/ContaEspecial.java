public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public void sacar(double saque){
        if(saque > (getSaldo() + getLimite())) {
            System.out.println("Pobre! Não tem dinheiro kk!");
        }
        else if(saque > getSaldo()){
            setLimite(getLimite() - (saque - getSaldo()));
            setSaldo(0);
        }else{
            System.out.println("Valor sacado: R$" + saque);
            setSaldo(getSaldo() - saque);
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
