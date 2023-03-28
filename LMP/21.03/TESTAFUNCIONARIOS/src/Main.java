public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Robertowsky", 10000.00, "robertinho69", "123456#");
        Telefonista t1 = new Telefonista("Thais Carla", 2.00, 538);
        Secretaria s1 = new Secretaria("Rosana", 2000.00, 321);

        System.out.println("Gerente: ");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário: R$" + g1.getSalario());
        System.out.println("Usuário: " + g1.getNomeUsuario());
        System.out.println("Senha: " + g1.getSenha());
        System.out.println("Bonificação: R$" + g1.calcBonificacao());
        g1.setSalario(g1.calcBonificacao());

        System.out.println();

        System.out.println("Telefonista: ");
        System.out.println("Nome: " + t1.getNome());
        System.out.println("Salário: R$" + t1.getSalario());
        System.out.println("Código Estação: " + t1.getCodEstacao());
        System.out.println("Bonificação: R$" + t1.calcBonificacao());
        t1.setSalario(t1.calcBonificacao());

        System.out.println();

        System.out.println("Secretária: ");
        System.out.println("Nome: " + s1.getNome());
        System.out.println("Salário: R$" + s1.getSalario());
        System.out.println("Número real: " + s1.getNumRamal());
        System.out.println("Bonificação: R$" + s1.calcBonificacao());
        s1.setSalario(s1.calcBonificacao());
    }
}