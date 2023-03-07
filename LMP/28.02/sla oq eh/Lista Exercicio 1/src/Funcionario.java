public class Funcionario {

    private String nome, sobrenome;
    private float salario, salarioFinal;




    //metodos get e set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario<0) {
            salario = 0;
        }
        else {
        this.salario = salario;
        }
    }

    //Construtor

    public Funcionario(String n, String s, float m) {
        nome = n;
        sobrenome = s;
        salario = m;
    }



    /* Metodos
    mostrar nome - void
    mostrar salario - void
    mostrar salario 10% - float
     */

    public void mostrarNome(String n, String s) {
        System.out.println("Nome: "+n +s);
    }

    public void mostraSalario(float m){
        System.out.println("Salario: "+m);
    }

    public void Aumento(float m){

        salarioFinal = (float) (m * 1.10);
        System.out.println("Salario com o aumento: "+salarioFinal);
    }

























}

