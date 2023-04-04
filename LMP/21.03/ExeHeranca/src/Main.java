public class Main {
    public static void main(String[] args) {

        Pessoa p2 = new Aluno(1234, "Joelington", 1212);
        p2.mostraTipo();
        Pessoa p3 = new Professor(9087, "Edvaldo", 1000);
        p3.mostraTipo();
        Aluno al4 = new Bolsista(7896, "Siclano", 2222);
        al4.mostraTipo();
        Aluno al5 = new Aluno(555, "Beltrano", 4444);
        Pessoa p4 = (Pessoa) al5;
        p4.mostraTipo();
        // p4.calcMedia(); ERRADO! A classe pessoa não tem o método calcMedia

        if(al4 instanceof Pessoa) {
            System.out.println("Instancia");
        } else {
            System.out.println("Não instancia");
        }


        System.out.println("-------------------");

        Pessoa p1 = new Pessoa(1234, "João");
        // p1.setNome("João");
        // p1.setCpf(1234);
        p1.mostra();
        System.out.println("-------------------");

        Aluno al1 = new Aluno(6789, "Maria", 1111);
        //double mediaAluno = al1.calcMedia(3, 7);
        //System.out.println(mediaAluno);
        al1.mostra();
        System.out.println("-------------------");

        Professor prof1 = new Professor(9087, "Rosana", 1000.00);
        // prof1.setNome("Rosana");
        // prof1.setCpf(9087);
        // prof1.setSalario(1000.00);

        Bolsista b1 = new Bolsista(7896, "Newton", 2222, 100.00);
        //double mediaBolsista = b1.calcMedia(3, 7);
        //System.out.println(mediaBolsista);
        b1.mostra();
        System.out.println("-------------------");

    }
}