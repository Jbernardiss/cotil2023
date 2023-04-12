public class Antigo extends Imovel{
    private double descontoPreco;

    public Antigo(String endereco, double preco, double descontoPreco) {
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Desconto: R$" + descontoPreco);
    }

    public double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }
}
