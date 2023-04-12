public class Triangulo extends FormaBidimensional{
    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double obterArea(){
        return (getAltura() * getLargura()) / 2;
    }
}
