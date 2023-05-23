public class Car implements CarbonFootprint{


    private String combustivel;
    private float cilindrada;

    public Car(String combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }


    //getter and setter

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int getCarbonFootprint() {
        return 1000;
    }
}
