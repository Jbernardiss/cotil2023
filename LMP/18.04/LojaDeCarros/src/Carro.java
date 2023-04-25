public class Carro extends Veiculo {

    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        if(km > 100000) {
            this.setPreco(getPreco() * 0.92);
        }
        this.km = km;

        Veiculo.setPrecoTotal(getPrecoTotal() + getPreco());
    }

    public void setKm(double km) {
        if(km > 100000 && km != this.km) {
            this.setPreco(getPreco() * 0.92);
        }
        this.km = km;
    }

    public void printDados() {
        super.printDados();
        System.out.println("Km: " + this.km);
    }
}
