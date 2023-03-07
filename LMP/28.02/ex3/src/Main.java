public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(4, 1, 1643);
        pessoa.setNomePessoa("Newton");
        pessoa.calculaIdade();
        System.out.println("Nome: " + pessoa.getNomePessoa() + "\nNascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAnoDeNascimento() + "\nIdade atual " + pessoa.getIdade());
    }
}