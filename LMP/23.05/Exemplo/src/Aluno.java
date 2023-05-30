public class Aluno {

    private String nome;
    private int ra;

    //metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0){
            throw new IllegalArgumentException("Nao pode ser negativo seu bosta!");
        }
        else {
        this.ra = ra;
        }
    }
}
