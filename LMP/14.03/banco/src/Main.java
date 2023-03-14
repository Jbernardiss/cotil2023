public class Main {
    public static void main(String[] args) {
        Poupanca conta01 = new Poupanca(2000);
        Poupanca conta02 = new Poupanca(3000);

        Poupanca.setTaxaJurosAnual(3.0);
        conta01.calcularJurosMensais();
        System.out.println("Conta 1 com saldo  = " + conta01.getSaldo());
        conta02.calcularJurosMensais();
        System.out.println("Conta 1 com saldo  = " + conta02.getSaldo());

        System.out.println();


        Poupanca.setTaxaJurosAnual(4.0);
        conta01.calcularJurosMensais();
        System.out.println("Conta 1 com saldo  = " + conta01.getSaldo());
        conta02.calcularJurosMensais();
        System.out.println("Conta 1 com saldo  = " + conta02.getSaldo());

    }
}