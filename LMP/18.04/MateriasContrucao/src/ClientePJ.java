public class ClientePJ extends Cliente{
    private int cnpj;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePJ(String nome, String endereco, int telefone, int cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }
}
