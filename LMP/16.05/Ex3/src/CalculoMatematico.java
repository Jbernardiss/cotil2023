public class CalculoMatematico {

    public int divisao(int num1, int num2) {
        try {
            return num1/num2;
        } catch (ArithmeticException e) {
            System.out.println("Não pode ocorrer divisão por 0");
            return 0;
        }
    }
}
