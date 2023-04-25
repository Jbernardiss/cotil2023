public class Veiculo {

    static private double precoTotal = 0;

    private String modelo;
    private double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + this.preco);
    }

    static public double getPrecoTotal() {
        return Veiculo.precoTotal;
    }

    static public void setPrecoTotal(double preco) {
        Veiculo.precoTotal = preco;
    }
}
