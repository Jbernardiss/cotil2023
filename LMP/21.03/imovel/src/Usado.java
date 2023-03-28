public class Usado extends Imovel{
    double desconto;

    public Usado(int id, String endereco, double preco, double desconto) {
        super(id, endereco, preco);
        this.desconto = desconto;
    }

    public void showDesconto() {
        System.out.println("Desconto: R$" + desconto);
    }

    @Override
    public double getPreco() {
        return (super.getPreco() - desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
