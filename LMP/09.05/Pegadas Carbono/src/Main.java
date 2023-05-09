import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Building b1 = new House(12, true, 150, false);
        Building b2 = new School(14, false, 809, true);
        Car c1 = new Car("Gasolina", 9000);
        Car c2 = new Car("Diesel", 5000);
        Bycicle by1 = new Bycicle("Monark", 20);
        Bycicle by2 = new Bycicle("Caloi", 21);

        ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();

        list.add(b1);
        list.add(b2);
        list.add(by1);
        list.add(by2);
        list.add(c1);
        list.add(c2);

        for(CarbonFootprint j: list){
            System.out.println("---------------");
            if(j instanceof Car){
                Car c = (Car) j;
                System.out.println("Combustível: " + c.getCombustivel() + "\nCilindradas: " + c.getCilindradas() + "RPM\nEmissão de carbono: " + c.getCarbonFootprint());
            }else if(j instanceof Bycicle){
                Bycicle b = (Bycicle) j;
                System.out.println("Marca: " + b.getMarca() + "\nAro: " + b.getTamanhoArco() + "\nEmissão de carbono: " + b.getCarbonFootprint());
            }else {
                Building b = (Building) j;
                System.out.println("Trabalhadores: " + b.getNumeroPessoas() + "\nNumero de lampadas: " + b.getNumeroDeLampadas() + "\nEmissão de carbono: " + b.getCarbonFootprint());
            }
        }
    }
}