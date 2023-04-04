public class Main {
    public static void main(String[] args) {

        Cachorro animal1 = new Cachorro("cachorro", 89);
        animal1.emitirSom();

        Cavalo animal2 = new Cavalo("cavalo", 14);
        animal2.emitirSom();

        Preguica animal3 = new Preguica("preguiça", 69);
        animal3.emitirSom();

        Animal animal4 = (Animal) animal1;

        System.out.println("Animal 1(cachorro):");
        if(animal1 instanceof Animal) {
            System.out.println("inst. de Animal");
        }
        if(animal1 instanceof Cachorro) {
            System.out.println("inst. de Cachorro");
        }
        System.out.println("---------------------");

        System.out.println("Animal 2(cavalo):");
        if(animal2 instanceof Animal) {
            System.out.println("inst. de Animal");
        }
        if(animal2 instanceof Cavalo) {
            System.out.println("inst. de Cavalo");
        }
        System.out.println("---------------------");

        System.out.println("Animal 3(preguica):");
        if(animal3 instanceof Animal) {
            System.out.println("inst. de Animal");
        }
        if(animal3 instanceof Preguica) {
            System.out.println("inst. de Preguiça");
        }
        System.out.println("---------------------");

        System.out.println("Animal 4(cachorro):");
        if(animal4 instanceof Animal) {
            System.out.println("inst. de Animal");
        }
        if(animal4 instanceof Cachorro) {
            System.out.println("inst. de Cachorro");
        }
        if(animal4 instanceof Cavalo) {
            System.out.println("inst. de Cavalo");
        }
        if(animal4 instanceof Preguica) {
            System.out.println("inst. de Preguiça");
        }
        System.out.println("---------------------");



    }
}