
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Produto");
        Livro l1 = new Livro(2, "Livro 1", "Diário de Um Banana");
        Garrafa g1 = new Garrafa(3, "Stanley", 2);

        ArrayList<Produto> list = new ArrayList<Produto>();
        list.add(p1);
        list.add(l1);
        list.add(g1);

        for(Produto p: list) {
            p.show();
            if(p instanceof Livro) {
                ((Livro) p).read();
            }
            if(p instanceof Garrafa) {
                ((Garrafa) p).fill();
            }
            System.out.println("---------------");
        }
    }
}