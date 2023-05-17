public class Car implements CarbonFootprint{
    private String combustivel;
    private double cilindradas;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Car(String combustivel, double cilindradas) {
        this.combustivel = combustivel;
        this.cilindradas = cilindradas;
    }

    @Override
    public int getCarbonFootprint() {
        return 100;
    }
}
