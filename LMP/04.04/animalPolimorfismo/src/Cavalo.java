public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("yeeehaaaa");
    }

    public void correr() {
        System.out.println("correndo mt rapido");
    }
}
