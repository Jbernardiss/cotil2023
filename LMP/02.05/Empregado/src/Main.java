import java.io.FilterOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> list = new ArrayList<Empregado>();

        Assalariado as1 = new Assalariado();
        Assalariado as2 = new Assalariado();
        Comissionado cm1 = new Comissionado();
        Comissionado cm2 = new Comissionado();
        Horista hr1 = new Horista();
        Horista hr2 = new Horista();

        cm1.setTotalVenda(1000.00);
        cm2.setTotalVenda(7980.00);
        as1.setSalario(10000);
        as2.setSalario(9765);
        hr1.setHorasTrabalhadas(50);
        hr1.setPrecoHora(100);
        hr2.setHorasTrabalhadas(87);
        hr2.setPrecoHora(90);
        double total = 0;

        list.add(cm1);
        list.add(cm2);
        list.add(as2);
        list.add(as1);
        list.add(hr1);
        list.add(hr2);

        for(Empregado c: list){
            if(c instanceof Comissionado){
                total += ((Comissionado) c).getTotalVenda();
            }
        }

        System.out.println("Total vendido no mês: R$" + total);
    }
}