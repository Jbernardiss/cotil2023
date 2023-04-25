public class Moto extends Veiculo {

    private int ano;

    public Moto(String modelo, double preco, int ano) {

        super(modelo, preco);
        if(ano >= 2008) {
            this.setPreco(getPreco() * 1.1);
        }
        this.ano = ano;

        Veiculo.setPrecoTotal(getPrecoTotal() + getPreco());
    }

    public void setAno(int ano) {
        if(ano >= 2008 && ano != this.ano) {
            this.setPreco(getPreco() * 1.1);
        }
        this.ano = ano;
    }

    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + ano);
    }
}
