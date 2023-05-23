public class raNegativoException extends RuntimeException{

    @Override

    public String getMessage(){
        return ("RA negativo não é permitido");
    }
}
