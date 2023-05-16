public class Aluno {
    private int ra;
    private String nome;
    private double altura;



    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra < 0) {
            throw new IllegalArgumentException("O RA não pode ser negativo.");
        } else {
            this.ra = ra;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            throw new IllegalArgumentException("O nome não deve ser nulo.");
        } else {
            this.nome = nome;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0){
            throw new IllegalArgumentException("Altura não pode ser negativa o bobão, animal, burrão");
        }else{
            this.altura = altura;
        }


    }
}
