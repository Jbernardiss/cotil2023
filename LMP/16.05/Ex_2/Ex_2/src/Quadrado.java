public class Quadrado implements AreaCalculavel{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public Quadrado(double altura, double largura) {
        if(altura <= 0 || largura <= 0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0");
        }else{
            this.altura = altura;
            this.largura = largura;
        }
    }

    public double calcularArea(){
        return altura * largura;
    }
}
