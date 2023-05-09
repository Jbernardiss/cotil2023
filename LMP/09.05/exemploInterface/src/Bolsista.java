public class Bolsista extends Aluno {

    @Override
    public double calcMedia(double n1, double n2) {
        return ((n1+n2)/2) + 1;
    }

    @Override
    public void chorar() {
        System.out.println("bolsista não chora");
    }
}
