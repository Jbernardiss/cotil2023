public abstract class Pessoa {

    private int idade;
    private String nome;
    private String cpf;

    public Pessoa(int idade, String nome, String cpf) {

        if(idade <= 0) {
            throw new valorNegativoException();
        }
        else if(nome == null){
            throw new NullPointerException();
        }
        else if(cpf == null){
            throw new NullPointerException();
        }
        else if( cpf.startsWith("-")){
            throw new valorNegativoException();
        }
        else if(cpf.matches("^[a-zA-Z]*$")){
            System.out.println("Bruh");
            throw new ContemLetraException();
        }
        else{
            this.idade = idade;
            this.nome = nome;
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
