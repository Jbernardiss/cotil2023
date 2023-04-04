public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("uaaaa");
    }

    public void subirEmArvore() {
        System.out.println("Subindo na árvore");
    }
}
