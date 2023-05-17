public class Ferrari implements ICarro, IItemLoja {

    @Override
    public void acelerar() {
        System.out.println("Ferrari acelerando 0 a 100 em 3 segundos");
    }

    @Override
    public void parar() {
        System.out.println("Você não precisa de freios");
    }

    @Override
    public void abrirPorta() {
        System.out.println("Ferrari abrindo porta");
    }

    @Override
    public double getValor() {

        return 8_000_000.00;
    }
}
