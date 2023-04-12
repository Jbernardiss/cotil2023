public class Vip extends Ingresso{
    double valorAdicional;

    public Vip(double reais, double valorAdicional) {
        super(reais);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
