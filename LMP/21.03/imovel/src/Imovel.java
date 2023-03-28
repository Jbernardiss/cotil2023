public class Imovel {
    int id;
    String endereco;
    double preco;

    public Imovel(int id, String endereco, double preco) {
        this.id = id;
        this.endereco = endereco;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
