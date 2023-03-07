import java.time.Year;

public class Pessoa {
    private int idade, dia, mes, anoDeNascimento;
    private String nomePessoa;
    public int year = Year.now().getValue();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        if(anoDeNascimento >= 1000 && anoDeNascimento < getYear()) {
            this.anoDeNascimento = anoDeNascimento;
        }
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getYear(){
        return year;
    }

    public void calculaIdade(){
        setIdade((year - getAnoDeNascimento()));
    }

    Pessoa(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        anoDeNascimento = ano;
    }

}
