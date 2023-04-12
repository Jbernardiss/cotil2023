public class Tetraedro extends FormaTridimensional{
    public Tetraedro(double altura, double largura, double alturaZ) {
        super(altura, largura, alturaZ);
    }

    @Override
    public double obterArea(){
        return (getAltura() * getLargura()) / 2;
    }

    @Override
    public double obterVolume(){
        return (obterArea() * getAlturaZ()) / 3;
    }
}
