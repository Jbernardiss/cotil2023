public class Futebol extends JogoComBola{

    private String equipe1, equipe2;


    @Override
    public void iniciar() {
        System.out.println("A bola rola no gramado!");
    }

    @Override
    public void jogar() {
        System.out.println("Jbernardis chuta  a bola!");
    }

    @Override
    public void finalizar() {
        System.out.println("Apita o arbitro!");
    }

    @Override
    public void setNomesEquipes(String equipe1, String equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }
}
