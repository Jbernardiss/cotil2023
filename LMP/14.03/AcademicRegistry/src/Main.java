public class Main {
    public static void main(String[] args) {
        AcademicRegistry ar1 = new AcademicRegistry("João", 2, 10);
        AcademicRegistry ar2 = new AcademicRegistry("Guh", 5, 23);

        System.out.println("Matriculations Number: " + AcademicRegistry.getMatriculationNumber());
    }
}