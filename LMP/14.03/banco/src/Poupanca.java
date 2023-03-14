public class Poupanca {
    private double saldo;
    private static  double taxaJurosAnual = 0;

    public Poupanca(double saldo){
        this.saldo = saldo;
    }


    public void calcularJurosMensais(){
        saldo += (saldo * (taxaJurosAnual / 100.0))  / 12;
    }

    public static void modificaTaxaJuros(int juros){
        taxaJurosAnual = juros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }
}
