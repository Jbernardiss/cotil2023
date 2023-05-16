public class Circunferencia implements AreaCalculavel{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return 3.14 * raio * raio;
    }
}
