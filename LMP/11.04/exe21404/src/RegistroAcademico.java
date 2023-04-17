public class RegistroAcademico {

    //veriaveis
    private String nome;
    private static int numeroMatricula;
    private int codigoCurso;
    private double percentualCobranca;

    //Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public static void setNumeroMatricula(int numeroMatricula) {
        RegistroAcademico.numeroMatricula = numeroMatricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    //construtores

    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroMatricula++;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }

    public void mostradados(){
        System.out.println("\nNome: " + nome);
        System.out.println("Codigo do curso: " + codigoCurso);
        System.out.println("Cobrança: " + percentualCobranca);
    }

    public static int mostraMatricula(){
        return numeroMatricula;
    }
}
