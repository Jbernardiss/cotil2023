public class Funcionario extends Pessoa implements IPessoa{


    private String tel;
    private double salario;

    public Funcionario(int idade, String nome, String cpf, String tel, double salario) {
        super(idade, nome, cpf);
        if(tel.startsWith("-")){
            throw new valorNegativoException();
        }
        else if(tel.matches("^[a-zA-Z]*$")){
            throw new ContemLetraException();
        }
        else if(tel == null){
            throw new NullPointerException();
        }
        else if(salario < 0){
            throw new valorNegativoException();
        }else{
            this.tel = tel;
            this.salario = salario;
        }
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + tel);
        System.out.println("Salário: " + salario);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
