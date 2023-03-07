public class Main {
    public static void main(String[] args) {

        Aluno Al1 = new Aluno();
        //Al1.nome = "Carlinhos";
        Al1.setNome("Carlinhos");
        //Al1.altura = 1.10;
        Al1.setAltura(1.10);
        //Al1.idade = 57;
        Al1.setIdade(57);
        //Al1.ra = 6969;
        Al1.setRa(6969);
        Al1.estudar();
        Al1.mostrarNome();
        //System.out.println("Idade:" + Al1.idade);
        System.out.println("Idade:" + Al1.getIdade());

        ////////////////////////////////////////////////////////////////////////

        Aluno Al2 = new Aluno();
        //Al2.nome = "Vinicius 13";
        Al2.setNome("Vinicius 13");
        //Al2.altura = 1.13;
        Al2.setAltura(1.13);
        //Al2.idade = 13;
        Al2.setIdade(13);
        //Al2.ra = 1313;
        Al2.setRa(1313);
        Al2.modificarIdade();
        Al2.mostrarNome();
        System.out.println("Idade:" + Al2.getIdade());

        ////////////////////////////////////////////////////////////////////////

        Disciplina N1 = new Disciplina();
        //N1.disciplina = "Crime";
        //N1.setDisciplina("Crime");
        //N1.codigo = 157;
        //N1.setCodigo(157);
        //N1.cargaHoraria = 10;
        //N1.setCargaHoraria(10);
        /*N1.modificarCargaHoraria();
        System.out.println("cargaHoraria:" + N1.getCargaHoraria());
        N1.mostrardisciplina();
        System.out.println("mostrardisciplina:" + N1.getDisciplina());*/

        /////////////////////////////////////////////////////////////////////////

        Disciplina N2 = new Disciplina(10,"Crime", 157);




    }
}