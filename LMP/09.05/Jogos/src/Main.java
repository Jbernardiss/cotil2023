import javax.swing.plaf.BorderUIResource;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numJogosComBola = 0;
        int numJogosComCarta = 0;

        ArrayList<Jogo> jogos = new ArrayList<Jogo>();
        jogos.add(new Futebol());
        jogos.add(new Volei());
        jogos.add(new Truco(4));
        jogos.add(new Buraco(3));

        for(Jogo j : jogos) {
            if(j instanceof Futebol) {
                ((Futebol) j).iniciar();
                ((Futebol) j).jogar();
            } else if (j instanceof Volei) {
                ((Volei) j).iniciar();
                ((Volei) j).jogar();
            } else if (j instanceof Truco) {
                ((Truco) j).iniciar();
                ((Truco) j).jogar();
            } else if (j instanceof Buraco) {
                ((Buraco) j).iniciar();
                ((Buraco) j).jogar();
            }
            System.out.println("---------------------------------");

            if(j instanceof JogoComBola) {
                numJogosComBola++;
            } else if (j instanceof JogoComCartas) {
                numJogosComCarta++;
            }
        }
        System.out.println("Número de jogos com bola: " + numJogosComBola);
        System.out.println("Número de jogos com carta: " + numJogosComCarta);
    }
}