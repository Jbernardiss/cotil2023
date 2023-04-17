public class Main {
    public static void main(String[] args) {
        RegistroAcademico t1 = new RegistroAcademico("Carlinhos",5432, 30.0);
        RegistroAcademico t2 = new RegistroAcademico("Davi",2345, 90.0);
        RegistroAcademico t3 = new RegistroAcademico("Carlinhos",7890, 55.0);

        t1.mostradados();
        t2.mostradados();
        t3.mostradados();
        System.out.println("numero de matricula: "+RegistroAcademico.mostraMatricula());
    }
}