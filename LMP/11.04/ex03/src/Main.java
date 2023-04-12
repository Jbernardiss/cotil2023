import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10.0, 10.0, 10);
        Cubo cubo = new Cubo(10, 10, 10);
        Esfera esfera = new Esfera(10, 10, 10, 10);
        Quadrado quadrado = new Quadrado(10, 10);
        Tetraedro tetraedro = new Tetraedro(10, 10, 10);
        Triangulo triangulo = new Triangulo(10, 10);

        ArrayList<Forma> list = new ArrayList<Forma>();

        list.add(circulo);
        list.add(cubo);
        list.add(esfera);
        list.add(quadrado);
        list.add(tetraedro);
        list.add(triangulo);

        for(Forma f: list){
            if(f instanceof Circulo){
                System.out.println("Area " + ((Circulo) f).obterArea() + "cm²");

            }
            if(f instanceof Triangulo){
                System.out.println("Area " + ((Triangulo) f).obterArea() + "cm²");
            }
            if(f instanceof Quadrado){
                System.out.println("Area " + ((Quadrado) f).obterArea() + "cm²");
            }

            if(f instanceof Cubo){
                System.out.println("Area: " + ((Cubo) f).obterArea() + "cm² Volume: " + ((Cubo) f).obterVolume() + "cm³");
            }
            if(f instanceof Esfera){
                System.out.println("Area: " + ((Esfera) f).obterArea() + "cm² Volume: " + ((Esfera) f).obterVolume() + "cm³");
            }
            if(f instanceof Tetraedro){
                System.out.println("Area: " + ((Tetraedro) f).obterArea() + "cm² Volume: " + ((Tetraedro) f).obterVolume() + "cm³");
            }
        }
    }
}