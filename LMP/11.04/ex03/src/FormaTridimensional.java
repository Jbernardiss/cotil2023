public class FormaTridimensional extends Forma{
    private double alturaZ;

    public FormaTridimensional(double altura, double largura, double alturaZ) {
        super(altura, largura);
        this.alturaZ = alturaZ;
    }

    public double getAlturaZ() {
        return alturaZ;
    }

    public void setAlturaZ(double alturaZ) {
        this.alturaZ = alturaZ;
    }

    public double obterVolume(){
        return obterArea() * alturaZ;
    }

    public double obterArea(){
        return getAltura() * getLargura();
    }
}
