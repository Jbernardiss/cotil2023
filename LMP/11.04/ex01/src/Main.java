import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Comum ingresso1 = new Comum(100);
        Comum ingresso2 = new Comum(100);
        Comum ingresso3 = new Comum(100);
        Vip ingresso4 = new Vip(100, 90);
        Vip ingresso5 = new Vip(100, 90);

        ArrayList<Ingresso> list = new ArrayList<Ingresso>();
        list.add(ingresso1);
        list.add(ingresso2);
        list.add(ingresso3);
        list.add(ingresso4);
        list.add(ingresso5);

        for(Ingresso i: list){
            if(i instanceof Vip){
                total += (i.getReais() + ((Vip) i).getValorAdicional());
            }
            else {
                total += i.getReais();
            }
        }
        System.out.println("Valor total: R$" + total);
    }
}