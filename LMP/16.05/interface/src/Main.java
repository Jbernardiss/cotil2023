import java.util.ArrayList

public class Main {
    public static void main(String[] args) {
        Car c2 = new Car("Fossil", 15);
        Car c3 = new Car("Foda", 1500);
        Building c4 = new Building(50, 10, true, true);
        Building c5 = new Building(100, 30, false, true);
        Bicycle c6 = new Bicycle("Nike", 24);
        Bicycle c7 = new Bicycle("Cristiano Ronaldo", 7);

        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
            lista.add(c2);
            lista.add(c3);
            lista.add(c4);
            lista.add(c5);
            lista.add(c6);
            lista.add(c7);

        for(CarbonFootprint p: lista){
            System.out.println(p.getCarbonFootprint());
        }
    }
}