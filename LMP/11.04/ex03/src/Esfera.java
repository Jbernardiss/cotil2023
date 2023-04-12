public class Esfera extends FormaTridimensional{
    private double raio = getAltura() / 2;
    public Esfera(double altura, double largura, double alturaZ, double raio) {
        super(altura, largura, alturaZ);
        this.raio = raio;
    }

    @Override
    public double obterVolume(){
        return (3.14 * (raio * raio * raio)) / 4;
    }

    @Override
    public double obterArea(){
        return 3.14 * (raio*raio);
    }
}
