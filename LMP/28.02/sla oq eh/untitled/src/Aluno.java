public class Aluno {
    //atributos
    private String nome;
    private int ra;
    private int idade;
    private double altura;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa()
    {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0)
            this.altura = altura;
        else
            altura=0;
    }

    //metodos
    public void estudar()
    {
        System.out.println("Aluno estudando");
    }
    public void mostrarNome()
    {
        System.out.println("Nome:" + nome);

    }
    public void modificarIdade()
    {
        idade = 18;
    }
}
