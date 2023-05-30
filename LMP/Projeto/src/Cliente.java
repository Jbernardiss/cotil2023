public class Cliente extends Pessoa implements IPessoa {

    private String cnh;
    private String endereco;

    public Cliente(int idade, String nome, String cpf, String cnh, String endereco) {

        super(idade, nome, cpf);

        if(cpf.contains("-")){
            throw new valorNegativoException();
        }
        else if(cpf == null){
            throw new NullPointerException();
        }
        else if(endereco == null){
            throw new NullPointerException();
        }else{
            this.cnh = cnh;
            this.endereco = endereco;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("CNH: " + cnh);
        System.out.println("Endereço: " + endereco);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
