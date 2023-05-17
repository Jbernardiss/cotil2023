public class Buraco extends JogoComCartas{

    private int numeroDeJogadores;

    public Buraco(int numeroDeJogadores) {
        this.numeroDeJogadores = numeroDeJogadores;
    }

    @Override
    public int qtdCartasDistribuidas() {
        return 10 * numeroDeJogadores;
    }

    @Override
    public int numeroParticipantes() {
        return numeroDeJogadores;
    }

    @Override
    public void iniciar() {
        System.out.println("Começa o Buraco!");
    }

    @Override
    public void jogar() {
        System.out.println("Sla, buraco, bruh!");
    }

    @Override
    public void finalizar() {
        System.out.println("Acabou o buraco");
    }
}
