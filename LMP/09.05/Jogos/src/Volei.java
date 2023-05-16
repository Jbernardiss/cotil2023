public class Volei extends JogoComBola{

    private String equipe1, equipe2;


    @Override
    public void iniciar() {
        System.out.println("Saque!");
    }

    @Override
    public void jogar() {
        System.out.println("Jbernardis faz a manchete!");
    }

    @Override
    public void finalizar() {
        System.out.println("3 sets! Acabou!");
    }

    @Override
    public void setNomesEquipes(String equipe1, String equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }
}
