public class valorNegativoException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Valor negativo não é aceito";
    }
}
