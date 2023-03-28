public class Novo extends Imovel{
    double precoAdicional;

    public Novo(int id, String endereco, double preco, double precoAdicional) {
        super(id, endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + this.precoAdicional);
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
}
