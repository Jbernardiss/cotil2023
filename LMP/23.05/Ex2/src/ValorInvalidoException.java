public class ValorInvalidoException extends RuntimeException{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ValorInvalidoException(double valor) {
        this.valor = valor;
    }

    @Override
    public String getMessage(){
        return "Valor igual ou inferior a zero, não foi possível realizar as transações! Valor utilizado: " + valor;
    }
}
