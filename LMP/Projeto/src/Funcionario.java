public class Funcionario extends Pessoa implements IPessoa{


    private String ct;
    private double salario;

    public Funcionario(int idade, String nome, String cpf, String ct, double salario) {
        super(idade, nome, cpf);
        if(ct.contains("-")){
            throw new valorNegativoException();
        }
        else if(ct == null){
            throw new NullPointerException();
        }
        else if(salario < 0){
            throw new valorNegativoException();
        }else{
            this.ct = ct;
            this.salario = salario;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Carteira de Trabalho: " + ct);
        System.out.println("Salário: " + salario);
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
