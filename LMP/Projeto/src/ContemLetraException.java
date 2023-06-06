public class ContemLetraException extends RuntimeException{
    @Override
    public String getMessage(){
        return "Valores numéricos não podem conter letras";
    }

}
