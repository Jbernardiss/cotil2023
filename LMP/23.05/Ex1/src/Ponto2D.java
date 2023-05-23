public class Ponto2D extends  Ponto{
    public Ponto2D(double x, double y) {
        super(x, y);
    }

    @Override

    public String toString(){
        return("X: " + getX() + "\nY: " + getY());
    }
}
