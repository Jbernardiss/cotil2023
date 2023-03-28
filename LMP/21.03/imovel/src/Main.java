public class Main {
    public static void main(String[] args) {
        Novo in = new Novo(1234, "Rua do bobo, 0", 13000.00, 1500);
        Usado iu = new Usado(5678, "Baker Street", 100000.00, 10000);

        System.out.println("Imóvel Novo: ");
        System.out.println("Preço Adicional: R$" + in.getPrecoAdicional());
        System.out.println("Preço Total: R$" + in.getPreco());

        System.out.println("Imóvel Usado: ");
        System.out.println("Desconto: R$" + iu.getDesconto());
        System.out.println("Preço Total: R$" + iu.getPreco());


    }
}