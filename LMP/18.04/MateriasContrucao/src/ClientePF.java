public class ClientePF extends Cliente{
    private int cpf;

    public ClientePF(String nome, String endereco, int telefone, int cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
