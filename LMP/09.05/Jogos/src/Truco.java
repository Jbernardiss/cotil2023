public class Truco extends JogoComCartas {

    private int numeroDeJogadores;

    public Truco(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    @Override
    public int qtdCartasDistribuidas() {
        return 3 * numeroDeJogadores;
    }

    @Override
    public int numeroParticipantes() {
        return numeroDeJogadores;
    }

    @Override
    public void iniciar() {
        System.out.println("Distribuidas as cartas jogo começa!");
    }

    @Override
    public void jogar() {
        System.out.println("Pede truco se é homem!");
    }

    @Override
    public void finalizar() {
        System.out.println("12 termos! Acabou o jogo.");
    }
}
