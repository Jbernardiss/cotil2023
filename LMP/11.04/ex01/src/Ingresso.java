public class Ingresso {
    private double reais;

    public Ingresso(double reais){
        this.reais = reais;
    }
    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }

    public void imprimeValor(){
        System.out.println("O valr so ingresso é: R$" + reais);
    }
}
