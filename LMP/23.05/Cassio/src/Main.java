import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diigte sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Sua idade: " +idade);
    }
}