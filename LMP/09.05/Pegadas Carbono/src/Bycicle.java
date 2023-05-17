public class Bycicle implements CarbonFootprint{
    private String marca;
    private int tamanhoArco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanhoArco() {
        return tamanhoArco;
    }

    public void setTamanhoArco(int tamanhoArco) {
        this.tamanhoArco = tamanhoArco;
    }

    public Bycicle(String marca, int tamanhoArco) {
        this.marca = marca;
        this.tamanhoArco = tamanhoArco;
    }

    @Override
    public int getCarbonFootprint() {
        return 0;
    }
}
