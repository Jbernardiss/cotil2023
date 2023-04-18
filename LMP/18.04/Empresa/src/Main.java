import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Salaried salaried1 = new Salaried("Antonio", 10000.00);
        Salaried salaried2 = new Salaried("João", 8000.00);
        Salaried salaried3 = new Salaried("Zé da Manga", 696.00);

        Hourly hourly1 = new Hourly("Guilherme", 8, 100);
        Hourly hourly2 = new Hourly("Matheus", 10, 200);
        Hourly hourly3 = new Hourly("Kong Fu Panda", 1, 10);

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(salaried1);
        list.add(salaried2);
        list.add(salaried3);
        list.add(hourly1);
        list.add(hourly2);
        list.add(hourly3);

        System.out.println("Lista de pagamentos assalariados");
        System.out.println();
        System.out.println("--------------------");

        System.out.println("Nome do funcionário: " + salaried1.getName() + ", Pagamento: R$" + salaried1.getPay());
        System.out.println("Nome do funcionário: " + salaried2.getName() + ", Pagamento: R$" + salaried2.getPay());
        System.out.println("Nome do funcionário: " + salaried3.getName() + ", Pagamento: R$" + salaried3.getPay());

        System.out.println("--------------------");
        System.out.println("Quantidade de horas trabalhadas por funcionários freelancers");
        System.out.println("--------------------");
        System.out.println("Nome: " + hourly1.getName() + ", Horas trabalhadas: " + hourly1.getHours());
        System.out.println("Nome: " + hourly2.getName() + ", Horas trabalhadas: " + hourly2.getHours());
        System.out.println("Nome: " + hourly3.getName() + ", Horas trabalhadas: " + hourly3.getHours());
        System.out.println("--------------------");
    }
}