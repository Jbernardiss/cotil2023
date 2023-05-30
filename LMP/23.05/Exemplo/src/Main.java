public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        try{
        a.setRa(-1);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Otario kkkkk");
    }
}