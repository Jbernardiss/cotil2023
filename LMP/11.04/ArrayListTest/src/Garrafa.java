public class Garrafa extends Produto {
    private double litres;

    public Garrafa(int id, String desc, double litres) {
        super(id, desc);
        this.litres = litres;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }

    public void fill() {
        System.out.println("Filling bottle...");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Capacity: " + litres + "L");
    }
}
