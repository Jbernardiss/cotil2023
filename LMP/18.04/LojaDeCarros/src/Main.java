
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int nMotos = 0;
        int nCarros = 0;
        double menorPrecoCarro = 0;
        double menorPrecoMoto = 0;
        Moto motoMaisBarata = null;
        Carro carroMaisBarato = null;

        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        Moto m1 = new Moto("Honda PCX", 15_000.00, 2020);
        Moto m2 = new Moto("Kawasaki Ninja", 70_000.00, 2016);
        Carro c1 = new Carro("Mercedes AMG SLS", 1_000_000, 100000);
        Carro c2 = new Carro("Ferrari 458", 3_000_000, 60000);

        veiculos.add(m1);
        veiculos.add(m2);
        veiculos.add(c1);
        veiculos.add(c2);

        for(Veiculo v : veiculos) {
            if(v instanceof Moto) {
                Moto m = (Moto) v;
                m.printDados();
            } else if (v instanceof Carro) {
                Carro c = (Carro) v;
                c.printDados();
            }
            System.out.println("###############################");
        }

        System.out.println("\nPreço do estoque: " + Veiculo.getPrecoTotal());
        for(Veiculo v : veiculos) {
            if(v instanceof Moto) {
                nMotos++;
            } else if (v instanceof Carro) {
                nCarros++;
            }
        }
        System.out.println("Número de Motos: " + nMotos);
        System.out.println("Número de Carros: " + nCarros);

        for(Veiculo v : veiculos) {
            if(menorPrecoCarro != 0 && menorPrecoMoto != 0) {
                break;
            }
            if(v instanceof Moto) {
                menorPrecoMoto = v.getPreco();
            } else if (v instanceof Carro) {
                menorPrecoCarro = v.getPreco();
            }
        }
        for(Veiculo v : veiculos) {
            if(v instanceof Carro) {
                if(v.getPreco() <= menorPrecoCarro) {
                    menorPrecoCarro = v.getPreco();
                    carroMaisBarato = (Carro) v;
                }
            } else if (v instanceof Moto) {
                if(v.getPreco() <= menorPrecoMoto) {
                    menorPrecoMoto = v.getPreco();
                    motoMaisBarata = (Moto) v;
                }
            }
        }

        System.out.println("\nCarro mais barato:");
        carroMaisBarato.printDados();
        System.out.println("##############################");
        System.out.println("Moto mais barata");
        motoMaisBarata.printDados();
    }
}