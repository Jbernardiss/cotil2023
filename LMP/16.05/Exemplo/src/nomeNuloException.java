public class nomeNuloException extends RuntimeException{

    @Override

    public String getMessage(){
        return("Nome nulo não é permitido");
    }
}
