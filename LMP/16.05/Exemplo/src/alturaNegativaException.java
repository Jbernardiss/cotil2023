public class alturaNegativaException extends RuntimeException{
    @Override

    public String getMessage(){
        return("Altura negativa não é permitida");
    }
}
