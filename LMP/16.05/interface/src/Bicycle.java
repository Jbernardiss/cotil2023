public class Bicycle implements CarbonFootprint{


    private String marca;
    private int tamAro;

    public Bicycle(String marca, int tamAro) {
        this.marca = marca;
        this.tamAro = tamAro;
    }


    //getter and setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamAro() {
        return tamAro;
    }

    public void setTamAro(int tamAro) {
        this.tamAro = tamAro;
    }

    @Override
    public int getCarbonFootprint() {
        return 0;
    }
}
