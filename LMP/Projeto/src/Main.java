
import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static public void msgApertarTecla() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Aperte Enter para continuar");
        scanner.nextLine();
        System.out.println();
    }

    static public Pessoa nomeMaiorIdade(ArrayList<Pessoa> pessoas){
        int maiorIdade = pessoas.get(0).getIdade();
        Pessoa pessoa = pessoas.get(0);

        for(Pessoa p: pessoas){
            if(p.getIdade() > maiorIdade){
                maiorIdade = p.getIdade();
                pessoa = p;
            }
        }
        return pessoa;
    }

    static public Pessoa nomeMenorIdade(ArrayList<Pessoa> pessoas){
        int menorIdade = pessoas.get(0).getIdade();
        Pessoa pessoa = pessoas.get(0);

        for(Pessoa p: pessoas){
            if(p.getIdade() < menorIdade){
                menorIdade = p.getIdade();
                pessoa = p;
            }
        }
        return pessoa;
    }

    static public int quantidadeMaiorSessenta(ArrayList<Pessoa> pessoas){
        int qnt = 0;
        for(Pessoa p: pessoas){
            if(p.getIdade() >= 60){
                qnt++;
            }
        }
        return qnt;
    }

    static public int quantidadeMenordezoito(ArrayList<Pessoa> pessoas){
        int qnt = 0;
        for(Pessoa p: pessoas){
            if(p.getIdade() < 18){
                qnt++;
            }
        }
        return qnt;
    }

    static public double calcularIdadeMedia(ArrayList<Pessoa> pessoas){
        double qntPessoas = 0;
        double somaIdades = 0;

        for(Pessoa p: pessoas){
            somaIdades += p.getIdade();
            qntPessoas++;
        }
        return somaIdades / qntPessoas;
    }

    static public Pessoa buscarPessoa(ArrayList<Pessoa> Pessoas, String busca) {

        Scanner scanner = new Scanner(System.in);
        int opcao, encontrou = 0;
        ArrayList<Pessoa> pessoasPossiveis = new ArrayList<Pessoa>();

        for(Pessoa p : Pessoas) {
            if(p.getNome().toLowerCase().contains(busca.toLowerCase())) {
                pessoasPossiveis.add(p);
                encontrou++;
            }
        }

        if(encontrou == 0) {
            return null;
        }

        while(true) {
            try {
                for(Pessoa p : pessoasPossiveis) {
                    System.out.println("[" + (pessoasPossiveis.indexOf(p) + 1) + "]: " + p.getNome());
                }
                System.out.print("> ");
                opcao = (scanner.nextInt() - 1);
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input inválido, tente novamente");
                scanner.nextLine();
                continue;
            } catch(IndexOutOfBoundsException e){
                System.out.println("Input inválido, tente novamente");
                scanner.nextLine();
                continue;
            }
        }

        return pessoasPossiveis.get(opcao);
    }



    public static void main(String[] args) {

        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
        ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();
        ArrayList<Carro> carros = new ArrayList<Carro>();

        String nome;
        int idade;
        double salario;
        String cpf;
        String cnh;
        String endereco;
        String tel;
        String stringBusca;
        String simOuNao;
        int opcao;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastro de Cliente");
            System.out.println("[2] Buscar Cliente");
            System.out.println("[3] Deletar Clientes");
            System.out.println("[4] Cadastro de Funcionário");
            System.out.println("[5] Buscar Funcionário");
            System.out.println("[6] Deletar Funcionário");
            System.out.println("[7] Cadastrar Carro");
            System.out.println("[8] Buscar Carro");
            System.out.println("[9] Deletar Carro");
            System.out.println("[10] Estatisticas dos Clientes");
            System.out.println("[11] Estatísticas dos Carros");
            try {
                System.out.print("> ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Você escreveu q nem um retardado, faz dnv");
                scanner.nextLine();
                continue;
            }

            if(opcao == 1) { // Cadastrar Cliente
                while(true) {
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    try {
                        System.out.print("Idade: ");
                        idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("CPF: ");
                        cpf = scanner.nextLine();

                        System.out.print("CNH: ");
                        cnh = scanner.nextLine();

                    } catch (InputMismatchException e) {
                        System.out.println("Você escreveu q nem um retardado, faz dnv");
                        scanner.nextLine();
                        continue;
                    }

                    System.out.print("Endereço: ");
                    endereco = scanner.nextLine();

                    try {
                        clientes.add(new Cliente(idade, nome, cpf, cnh, endereco));

                    } catch(valorNegativoException e) {
                        System.out.println(e.getMessage() + ". Tente novamente.");
                        msgApertarTecla();
                        break;
                    } catch (NullPointerException e) {
                        System.out.println("Valor nulo não permitido!");
                        msgApertarTecla();
                        break;
                    }catch(ContemLetraException e){
                        e.getMessage();
                    }catch(RuntimeException e){
                        System.out.println("Houve um erro no cadastro do funcionário");
                    }

                    System.out.println("Cadastro realizado!");

                    msgApertarTecla();
                    break;
                }
            } else if(opcao == 2) { // Buscar Cliente

                System.out.print("Nome para busca: ");
                stringBusca = scanner.nextLine();

                try{
                    Pessoa p = buscarPessoa(clientes, stringBusca);
                    if(p == null) {
                        System.out.println("Não há pessoas com esse nome!");
                        msgApertarTecla();
                    } else {
                        ((Cliente) p).exibir();
                        msgApertarTecla();
                    }
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Input inválido, tente novamente");
                    msgApertarTecla();
                }



            } else if(opcao == 3) { //Deletar Clientes

                System.out.print("Digite o nome para exclusão: ");
                stringBusca = scanner.nextLine();

                try{
                    Pessoa p = buscarPessoa(clientes, stringBusca);

                    if(p == null) {
                        System.out.println("Não há pessoas com esse nome!");
                        msgApertarTecla();
                    } else {
                        ((Cliente) p).exibir();

                        while(true) {
                            System.out.println();
                            System.out.print("Deseja realmente excluir este cliente?[s/n]: ");
                            simOuNao = scanner.nextLine().toLowerCase();

                            if(simOuNao.equals("s")) {
                                System.out.println("Cliente excluído");
                                clientes.remove(p);

                                msgApertarTecla();

                                break;
                            } else if(simOuNao.equals("n")){
                                System.out.println("Cliente não excluído");

                                msgApertarTecla();

                                break;
                            } else {
                                System.out.println("Opção invalida");
                                continue;
                            }
                        }
                    }
                }catch(IndexOutOfBoundsException e){
                    System.out.println("Input inválido, tente novamente");
                    scanner.nextLine();
                }

            } else if (opcao == 4) { // Cadastro Funcionário
                while(true) {
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    try {
                        System.out.print("Idade: ");
                        idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("CPF: ");
                        cpf = scanner.nextLine();

                        System.out.print("Telefone: ");
                        tel = scanner.nextLine();

                        System.out.print("Salário: ");
                        salario = scanner.nextDouble();
                        scanner.nextLine();

                    } catch (InputMismatchException e) {
                        System.out.println("Você escreveu q nem um retardado, faz dnv");
                        scanner.nextLine();
                        continue;
                    }

                    try {
                        funcionarios.add(new Funcionario(idade, nome, cpf, tel, salario));
                    } catch(valorNegativoException e) {
                        System.out.println(e.getMessage());
                        msgApertarTecla();
                    } catch (NullPointerException e) {
                        System.out.println("Valor nulo não permitido!");
                        msgApertarTecla();
                        break;
                    } catch (ContemLetraException e){
                        e.getMessage();
                    } catch(RuntimeException e){
                        System.out.println("Houve um erro no cadastro do funcionário");
                    }

                    System.out.println("Cadastro realizado!");

                   msgApertarTecla();

                    break;
                }
            } else if(opcao == 5) { // Buscar Funcionário
                System.out.print("Nome para busca: ");
                stringBusca = scanner.nextLine();

                try{
                    Pessoa p = buscarPessoa(clientes, stringBusca);
                    if(p == null) {
                        System.out.println("Não há pessoas com esse nome!");
                        msgApertarTecla();
                    } else {
                        ((Cliente) p).exibir();
                        msgApertarTecla();
                    }
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Input inválido, tente novamente");
                    msgApertarTecla();
                }

            } else if (opcao == 6) { // Deletar Funcionário

                System.out.print("Digite o nome para exclusão: ");
                stringBusca = scanner.nextLine();
                try{
                    Pessoa p = buscarPessoa(funcionarios, stringBusca);

                    if(p == null) {
                        System.out.println("Não há pessoas com esse nome!");
                        msgApertarTecla();
                    } else {
                        ((Funcionario) p).exibir();

                        while(true) {
                            System.out.println();
                            System.out.print("Deseja realmente excluir este funcionário?[s/n]: ");
                            simOuNao = scanner.nextLine().toLowerCase();

                            if(simOuNao.equals("s")) {
                                System.out.println("Funcionário excluído");
                                funcionarios.remove(p);
                                break;
                            } else if(simOuNao.equals("n")){
                                System.out.println("Funcionário não excluído");
                                break;
                            } else {
                                System.out.println("Opção invalida");
                                continue;
                            }
                        }
                    }
                }catch(IndexOutOfBoundsException e){
                    System.out.println("Input inválido, tente novamente");
                    scanner.nextLine();
                }

            } else if (opcao == 7) { // Cadastrar Carro

            } else if(opcao == 8) { // Buscar Carro

            } else if(opcao == 9) { // Deletar Carro
                
            } else if(opcao == 10) { // Stat cliente

                System.out.println();
                System.out.println("Cliente mais velho: " + nomeMaiorIdade(clientes).getNome() + ", idade: " + nomeMaiorIdade(clientes).getIdade() + " anos");
                System.out.println("Cliente mais novo " + nomeMenorIdade(clientes).getNome() + " idade: " + nomeMenorIdade(clientes).getIdade() + " anos");
                System.out.println("Quantidade de clientes maiores de 60 anos: " + quantidadeMaiorSessenta(clientes));
                System.out.println("Quantidade de clientes menores de 18 anos: "  + quantidadeMenordezoito(clientes));
                System.out.println("Idade média: " + calcularIdadeMedia(clientes) + " anos");
            } else if(opcao == 11) { // Stat carro

            }
            else {
                System.out.print("nao tem essa opcao seu burro");
                scanner.nextLine();
                continue;
            }
        }
    }
}