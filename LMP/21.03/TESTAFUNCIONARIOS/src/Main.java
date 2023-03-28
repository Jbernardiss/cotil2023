public class Main {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Robertowsky", 10000.00, "robertinho69", "123456#");
        Telefonista t1 = new Telefonista("Thais Carla", 2.00, 538);
        Secretaria s1 = new Secretaria("Rosana", 2000.00, 321);

        System.out.println("Gerente: ");
        g1.mostraDados();
        System.out.println("Bonificação: R$" + g1.calcBonificacao());
        g1.setSalario(g1.getSalario() + g1.calcBonificacao());

        System.out.println();

        System.out.println("Telefonista: ");
        t1.mostraDados();
        System.out.println("Bonificação: R$" + t1.calcBonificacao());
        t1.setSalario(t1.getSalario() + t1.calcBonificacao());

        System.out.println();

        System.out.println("Secretária: ");
        s1.mostraDados();
        System.out.println("Bonificação: R$" + s1.calcBonificacao());
        s1.setSalario(s1.getSalario() + s1.calcBonificacao());
    }
}