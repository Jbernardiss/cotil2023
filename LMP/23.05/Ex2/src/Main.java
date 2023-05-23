public class Main {
    public static void main(String[] args) {
        System.out.println("----- Banco do Paraguai -----");
        System.out.println();

        ContaCorrente contaCorrente1 = new ContaCorrente(1000);
        ContaCorrente contaCorrente2 = new ContaCorrente(900);
        ContaInvestimento contaInvestimento1 = new ContaInvestimento(700);
        ContaInvestimento contaInvestimento2 = new ContaInvestimento(10000);

        // erro

        try{
            contaCorrente1.sacar(2000);
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        // certo

            contaCorrente1.transferir(500, contaCorrente2);

        // erro

        try{
            contaCorrente2.sacar(-90);
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }

        // erro

        try{
            contaCorrente2.sacar(9000);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }

        System.out.println(contaInvestimento1.calcularSaldo());
        System.out.println(contaInvestimento2.calcularSaldo());
        System.out.println(contaCorrente1.getSaldo());
        System.out.println(contaCorrente1.calcularSaldo());
        System.out.println(contaCorrente2.getSaldo());
        System.out.println(contaCorrente2.calcularSaldo());

        // erro
        try{
            contaInvestimento1.sacar(-9090);
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}