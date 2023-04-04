public class AppContas {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Matheus Lindo", 123, 2);
        ContaPoupanca conta02 = new ContaPoupanca("Matheus Investidor", 1234, 5, 15);
        ContaEspecial conta03 = new ContaEspecial("Matheus Especial", 12345, 10000, 2000);

        System.out.println("Cliente: " + conta01.getCliente() + "\nNumero Conta: " + conta01.getNumConta() + "\nSaldo R$" + conta01.getSaldo());
        System.out.println("Cliente: " + conta02.getCliente() + "\nNumero Conta: " + conta02.getNumConta() + "\nSaldo R$" + conta02.getSaldo() + "\nDia do rendimento: " + conta02.getDiaRendimento());
        System.out.println("Cliente: " + conta03.getCliente() + "\nNumero Conta: " + conta03.getNumConta() + "\nSaldo R$" + conta03.getSaldo() + "\nLimite R$" + conta03.getLimite());

        conta01.depositar(8);
        conta02.depositar(15);
        conta03.depositar(1000);

        conta01.sacar(10000);
        conta02.sacar(890);
        conta03.sacar(13001);
        conta02.calcularNovosaldo(430);

        System.out.println("Cliente: " + conta01.getCliente() + "\nNumero Conta: " + conta01.getNumConta() + "\nSaldo R$" + conta01.getSaldo());
        System.out.println("Cliente: " + conta02.getCliente() + "\nNumero Conta: " + conta02.getNumConta() + "\nSaldo R$" + conta02.getSaldo() + "\nDia do rendimento: " + conta02.getDiaRendimento());
        System.out.println("Cliente: " + conta03.getCliente() + "\nNumero Conta: " + conta03.getNumConta() + "\nSaldo R$" + conta03.getSaldo() + "\nLimite R$" + conta03.getLimite());

    }
}
