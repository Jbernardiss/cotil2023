public class Main {
    public static void main(String[] args) {

        try{
            Quadrado q1 = new Quadrado(-10, 100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Quadrado q2 = new Quadrado(100, 100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            Retangulo r1 = new Retangulo(100, 100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Retangulo r2 = new Retangulo(1000, 100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            Retangulo r1 = new Retangulo(-100, 100);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}