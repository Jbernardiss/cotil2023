public class appContas {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Matheus Lindo", 123, 30921);
        ContaPoupanca conta02 = new ContaPoupanca("Matheus Investidor", 1234, 10000, 15);
        ContaEspecial conta03 = new ContaEspecial("Matheus Especial", 12345, 9012, 2334);

        System.out.println("Cliente: " + conta01.getCliente() + "\nNumero Conta: " + conta01.getNumConta() + "\nSaldo R$" + conta01.getSaldo());
        System.out.println("Cliente: " + conta02.getCliente() + "\nNumero Conta: " + conta02.getNumConta() + "\nSaldo R$" + conta02.getSaldo() + "\nDia do rendimento: " + conta02.getDiaRendimento());
        System.out.println("Cliente: " + conta03.getCliente() + "\nNumero Conta: " + conta03.getNumConta() + "\nSaldo R$" + conta03.getSaldo() + "\nLimite R$" + conta03.getLimite());

        conta01.depositar(100);
        conta02.depositar(190);
        conta03.depositar(812);

        conta01.sacar(10000);
        conta02.sacar(890);
        conta03.sacar(10000);
        conta02.calcularNovosaldo(430);

        System.out.println("Cliente: " + conta01.getCliente() + "\nNumero Conta: " + conta01.getNumConta() + "\nSaldo R$" + conta01.getSaldo());
        System.out.println("Cliente: " + conta02.getCliente() + "\nNumero Conta: " + conta02.getNumConta() + "\nSaldo R$" + conta02.getSaldo() + "\nDia do rendimento: " + conta02.getDiaRendimento());
        System.out.println("Cliente: " + conta03.getCliente() + "\nNumero Conta: " + conta03.getNumConta() + "\nSaldo R$" + conta03.getSaldo() + "\nLimite R$" + conta03.getLimite());

    }
}
