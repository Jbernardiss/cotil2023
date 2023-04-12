public class Novo extends Imovel {
    private double precoAdicional;

    public Novo(String endereco, double preco, double precoAdicional) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Adicional: R$" + precoAdicional);
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
}
