
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Novo i1 = new Novo("Rua A, 10", 100000, 10000);
        Antigo i2 = new Antigo("Rua B, 20", 200000, 50000);
        Novo i3 = new Novo("Rua C, 37", 500000, 20000);
        ArrayList<Imovel> imoveis = new ArrayList<>();

        imoveis.add(i1);
        imoveis.add(i2);
        imoveis.add(i3);

        for(Imovel i: imoveis) {
            if(i instanceof Novo) {
                ((Novo) i).mostrarDados();
                System.out.println("######################");
            }
        }
    }
}