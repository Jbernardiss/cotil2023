public class Circulo extends FormaBidimensional{
    private double raio = getAltura() / 2;

    public Circulo(double altura, double largura, double raio) {
        super(altura, largura);
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        return 3.14 * (raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
