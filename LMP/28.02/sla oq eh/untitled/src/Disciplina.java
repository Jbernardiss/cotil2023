public class Disciplina {
    //atributos

    private String disciplina;
    private int codigo;
    private int cargaHoraria;

    //construtor

    public Disciplina(int cargaHoraria, String disciplina, int codigo) {
        if (cargaHoraria > 0)
            this.cargaHoraria = cargaHoraria;
        else
            this.cargaHoraria = 0;
        this.codigo = codigo;
    }

    //construtor

    public Disciplina() {
        this.cargaHoraria = 0;
        this.disciplina = "";
    }

    //Construtor

    public Disciplina(String disciplina) {
        this.cargaHoraria = 0;
        this.disciplina = "disciplina";
    }
}
