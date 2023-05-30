
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

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
        String cpf;
        String cnh;
        String endereco;
        String stringBusca;
        String simOuNao;
        int opcao;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastro de Cliente");
            System.out.println("[2] Buscar Cliente");
            System.out.println("[3] Deletar Clientes");


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
                        System.out.println(e.getMessage());
                    } catch (NullPointerException e) {
                        System.out.println("Valor nulo não permitido!");
                    }
                    break;
                }
            } else if(opcao == 2) { // Buscar Cliente

                System.out.print("Nome para busca: ");
                stringBusca = scanner.nextLine();

                Pessoa p = buscarPessoa(clientes, stringBusca);
                if(p == null) {
                    System.out.println("Não há pessoas com esse nome!");
                } else {
                    System.out.println(p.getNome());
                }

            } else if(opcao == 3) { //Deletar Clientes

                System.out.print("Digite o nome para exclusão: ");
                stringBusca = scanner.nextLine();

                Pessoa p = buscarPessoa(clientes, stringBusca);

                if(p == null) {
                    System.out.println("Não há pessoas com esse nome!");
                } else {
                    ((Cliente) p).exibir();

                    while(true) {
                        System.out.print("Deseja realmente excluir este cliente?[s/n]: ");
                        simOuNao = scanner.nextLine().toLowerCase();

                        if(simOuNao.equals("s")) {
                            System.out.println("Cliente excluído");
                            clientes.remove(p);
                            break;
                        } else if(simOuNao.equals("n")){
                            System.out.println("Cliente não excluído");
                            break;
                        } else {
                            System.out.println("Opção invalida");
                            continue;
                        }
                    }
                }
            }
        }
    }
}