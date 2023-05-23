
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String nome = null;
        Aluno al1 = new Aluno();

        try {
            System.out.println(nome.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("É cocada bobão!");
        } catch (Exception e) {
            System.out.println("Sla, erro");
        }

        //aluno
        try {
            al1.setRa(-1);
            al1.setNome(null);
        } catch (raNegativoException e) {
            System.out.println(e.getMessage());
        } catch(nomeNuloException e) {
            e.getMessage();
        }

        try {
            al1.setAltura(-90);
        }catch(alturaNegativaException e){
            System.out.println(e.getMessage());
        }
        System.out.println("************FIM************");
    }
}