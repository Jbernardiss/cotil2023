import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    static public void msgApertarTecla() {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println();
            System.out.print("Aperte Enter para continuar");
            scanner.nextLine();
            System.out.println();
        }catch(Exception e){
            System.out.println();
            System.out.println("Houve um erro ao clicar, tente novamente!");
            System.out.print("Aperte Enter para continuar");
            scanner.nextLine();
            System.out.println();
        }
    }

    static public void exibirMenu(ArrayList<String> listaOpcoes) {

        int i = 1;

        System.out.println("Escolha uma opção: ");

        for(String s : listaOpcoes) {
            System.out.println("[" + i + "] " + s);
            i++;
        }
    }

    static public void exibirMenu(String tituloMenu, ArrayList<String> listaOpcoes) {

        int i = 1;

        System.out.println("\n---------- " + tituloMenu + " ----------\n");
        System.out.println("Escolha uma opção: ");

        for(String s : listaOpcoes) {
            System.out.println("[" + i + "] " + s);
            i++;
        }
    }

    static public int inputEscolhaMenu() {

        int opcao;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("> ");
            opcao = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {

            System.out.println("Caractere Inválido");
            scanner.nextLine();
            msgApertarTecla();
            return -1;
        } catch (Exception e){
            System.out.println("Houve um erro ao inserir os dados!");
            msgApertarTecla();
            return -1;
        }

        return opcao;
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

    static public Carro carroMaisCaro(ArrayList<Carro> carros) {

        Carro carroMaisCaro = carros.get(0);

        for(Carro c : carros) {
            if(c.getPreco() > carroMaisCaro.getPreco()) {
                carroMaisCaro = c;
            }
        }

        return carroMaisCaro;
    }

    static public Carro carroMaisBarato(ArrayList<Carro> carros) {

        Carro carroMaisBarato = carros.get(0);

        for(Carro c : carros) {
            if(c.getPreco() < carroMaisBarato.getPreco()) {
                carroMaisBarato = c;
            }
        }

        return carroMaisBarato;
    }

    static public double precoMedio(ArrayList<Carro> carros) {
        double sum = 0;

        for(Carro c : carros) {
            sum += c.getPreco();
        }

        return sum / carros.size();
    }

    static public int precosAcimaDaMedia(ArrayList<Carro> carros) {
        double precoMedio = precoMedio(carros);
        int count = 0;

        for(Carro c : carros) {
            if(c.getPreco() > precoMedio) {
                count++;
            }
        }

        return count;
    }

    static public Pessoa buscarPessoa(ArrayList<Pessoa> pessoas, String busca) {

        int opcao, encontrou = 0;
        Pessoa result = null;
        ArrayList<Pessoa> pessoasPossiveis = new ArrayList<Pessoa>();
        ArrayList<String> nomesMenu = new ArrayList<String>();

        for(Pessoa p : pessoas) {
            if(p.getNome().toLowerCase().contains(busca.toLowerCase())) {
                pessoasPossiveis.add(p);
                nomesMenu.add(p.getNome());
                encontrou++;
            }
        }

        if(encontrou == 0) {
            return result;
        }

        while(true) {

            exibirMenu(nomesMenu);
            opcao = inputEscolhaMenu();

            if(opcao == -1) {
                continue;
            }

            try {
                result = pessoasPossiveis.get((opcao - 1));
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Opção Inválida");
                msgApertarTecla();
            }
        }

        return result;
    }

    static public Carro buscarCarro(ArrayList<Carro> carros, String stringBusca, int opcaoBusca) {

        int opcao, encontrou = 0;
        Carro result = null;
        ArrayList<Carro> carrosPossiveis = new ArrayList<Carro>();
        ArrayList<String> nomesMenu = new ArrayList<String>();

        if(opcaoBusca == 0) {
            for(Carro carro : carros) {
                if(carro.getDesc().toLowerCase().contains(stringBusca.toLowerCase())) {
                    carrosPossiveis.add(carro);
                    nomesMenu.add("ID: " + carro.getId() + " - " + carro.getMarca() + " " + carro.getModelo());
                    encontrou++;
                }
            }
        }
        else if(opcaoBusca == 1) {
            for(Carro carro : carros) {
                if(carro.getMarca().toLowerCase().contains(stringBusca.toLowerCase())) {
                    carrosPossiveis.add(carro);
                    nomesMenu.add("ID: " + carro.getId() + " - " + carro.getMarca() + " " + carro.getModelo());
                    encontrou++;
                }
            }
        }
        else if (opcaoBusca == 2) {
            for(Carro carro : carros) {
                if(carro.getModelo().toLowerCase().contains(stringBusca.toLowerCase())) {
                    carrosPossiveis.add(carro);
                    nomesMenu.add("ID: " + carro.getId() + " - " + carro.getMarca() + " " + carro.getModelo());
                    encontrou++;
                }
            }
        }
        else{
            System.out.println("Digite uma opção válida");
            msgApertarTecla();
            return null;
        }

        if(encontrou == 0) {
            return result;
        }

        while(true) {

            exibirMenu(nomesMenu);
            opcao = inputEscolhaMenu();

            if(opcao == -1) {
                continue;
            }

            try {
                result = carrosPossiveis.get(opcao - 1);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
                msgApertarTecla();
            }
        }

        return result;
    }

    static public Carro buscarCarro(ArrayList<Carro> carros, double preco) {

        int opcao, encontrou = 0;
        Carro result = null;
        ArrayList<Carro> carrosPossiveis = new ArrayList<Carro>();
        ArrayList<String> nomesMenu = new ArrayList<String>();

        for(Carro carro : carros) {
            if(carro.getPreco() == preco) {
                carrosPossiveis.add(carro);
                nomesMenu.add("ID: " + carro.getId() + " - " + carro.getMarca() + " " + carro.getModelo());
                encontrou++;
            }
        }

        if(encontrou == 0) {
            return result;
        }

        while(true) {

            exibirMenu(nomesMenu);
            opcao = inputEscolhaMenu();

            if(opcao == -1) {
                continue;
            }

            try {
                result = carrosPossiveis.get(opcao - 1);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Opção inválida");
                msgApertarTecla();
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();
        ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();
        ArrayList<Carro> carros = new ArrayList<Carro>();

        Carro carroMaisCaro, carroMaisBarato;

        String nome, cpf, cnh, endereco, tel, desc, stringBusca, simOuNao, marca, modelo;
        int idade, opcao, precosAcimaDaMedia;
        double salario, preco = 0, precoMedio;

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> menuInicial = new ArrayList<String>();
        menuInicial.add("Cadastro");
        menuInicial.add("Buscar");
        menuInicial.add("Deletar");
        menuInicial.add("Estatísticas dos Clientes");
        menuInicial.add("Estatísticas dos Carros");
        menuInicial.add("Sair");

        ArrayList<String> menuCadastro = new ArrayList<String>();
        menuCadastro.add("Cadastrar Cliente");
        menuCadastro.add("Cadastrar Funcionário");
        menuCadastro.add("Cadastrar Carro");
        menuCadastro.add("Retornar ao menu inicial");

        ArrayList<String> menuBuscar = new ArrayList<String>();
        menuBuscar.add("Buscar Cliente");
        menuBuscar.add("Buscar Funcionário");
        menuBuscar.add("Buscar Carro");
        menuBuscar.add("Retornar ao menu inicial");

        ArrayList<String> menuDeletar = new ArrayList<String>();
        menuDeletar.add("Deletar Cliente");
        menuDeletar.add("Deletar Funcionário");
        menuDeletar.add("Deletar Carro");
        menuDeletar.add("Retornar ao menu inicial");

        ArrayList<String> menuBuscaCarro = new ArrayList<>();
        menuBuscaCarro.add("Busca por descrição");
        menuBuscaCarro.add("Busca por preço");
        menuBuscaCarro.add("Busca por marca");
        menuBuscaCarro.add("Busca por modelo");
        menuBuscaCarro.add("Retornar ao menu anterior");

        while(true) {

            exibirMenu("Menu Inicial", menuInicial);
            opcao = inputEscolhaMenu();

            if(opcao == -1) { // failsafe
                continue;
            }
            else if(opcao == 1) { //menu Cadastro
                while (true) {
                    exibirMenu("Menu Cadastro", menuCadastro);
                    opcao = inputEscolhaMenu();

                    if (opcao == -1) {
                        continue;
                    }

                    else if (opcao == 1) { // Cadastrar Cliente

                        try {
                            System.out.print("Nome: ");
                            nome = scanner.nextLine();

                            System.out.print("Idade: ");
                            idade = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("CPF: ");
                            cpf = scanner.nextLine();

                            System.out.print("CNH: ");
                            cnh = scanner.nextLine();

                            System.out.print("Endereço: ");
                            endereco = scanner.nextLine();

                        } catch (InputMismatchException e) {
                            System.out.println("Há dados com tipos errados, insira eles novamente");
                            msgApertarTecla();
                            continue;
                        } catch (Exception e){
                            System.out.println("Houve um erro ao inserir os dados");
                            msgApertarTecla();
                            continue;
                        }

                        try {
                            clientes.add(new Cliente(idade, nome, cpf, cnh, endereco));
                        } catch (valorNegativoException e) {
                            System.out.println(e.getMessage() + ". Tente novamente.");
                            msgApertarTecla();
                            break;
                        } catch (NullPointerException e) {
                            System.out.println("Valor nulo não permitido!");
                            msgApertarTecla();
                            break;
                        } catch (ContemLetraException e) {
                            e.getMessage();
                            msgApertarTecla();
                            continue;
                        } catch (RuntimeException e) {
                            System.out.println("Houve um erro no cadastro do cliente, tente novamente!");
                            msgApertarTecla();
                            continue;
                        }

                        System.out.println("Cadastro realizado!");

                            msgApertarTecla();
                            break;
                    }

                    else if (opcao == 2) { // Cadastro Funcionário

                        try {
                            System.out.print("Nome: ");
                            nome = scanner.nextLine();

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
                            System.out.println("Há dados com tipos errados, insira eles novamente");
                            msgApertarTecla();
                            continue;
                        } catch(Exception e){
                            System.out.println("Houve um erro ao inserir os dados");
                            msgApertarTecla();
                            continue;
                        }

                        try {
                            funcionarios.add(new Funcionario(idade, nome, cpf, tel, salario));
                        } catch (valorNegativoException e) {
                            System.out.println(e.getMessage());
                            msgApertarTecla();
                            continue;
                        } catch (NullPointerException e) {
                            System.out.println("Valor nulo não permitido!");
                            msgApertarTecla();
                            continue;
                        } catch (ContemLetraException e) {
                            e.getMessage();
                            msgApertarTecla();
                            continue;
                        } catch (RuntimeException e) {
                            System.out.println("Houve um erro no cadastro do funcionário, tente novamente!");
                            msgApertarTecla();
                            continue;
                        }

                        System.out.println("Cadastro realizado!");

                        msgApertarTecla();

                        break;
                    }

                    else if (opcao == 3) { // Cadastro Carro

                        try {
                            System.out.print("Descrição: ");
                            desc = scanner.nextLine();

                            System.out.print("Preço: ");
                            preco = scanner.nextDouble();
                            scanner.nextLine();

                            System.out.print("Marca: ");
                            marca = scanner.nextLine();

                            System.out.print("Modelo: ");
                            modelo = scanner.nextLine();

                        } catch (InputMismatchException e) {
                            System.out.println("Há dados com tipos errados, insira eles novamente");
                            msgApertarTecla();
                            continue;
                        } catch(Exception e){
                            System.out.println("Houve um erro ao inserir os dados");
                            msgApertarTecla();
                            continue;
                        }

                        try {
                            carros.add(new Carro(desc, preco, marca, modelo));
                        }
                        catch(valorNegativoException e){
                            System.out.println("Valores negativos não são aceitos!");
                            msgApertarTecla();
                            continue;
                        }catch (Exception e){
                            System.out.println("Houve um erro ao cadastrar o carro, tente novamente!");
                            msgApertarTecla();
                            continue;
                        }

                        System.out.println("Cadastro Realizado!");
                        msgApertarTecla();
                    }

                    else if(opcao == 4) {
                        break;
                    }

                    else {
                        System.out.println("Opção inexistente");
                        msgApertarTecla();
                    }
                }
            }
            else if(opcao == 2) { // menu Busca
                while(true) {
                    exibirMenu("Menu Busca", menuBuscar);
                    opcao = inputEscolhaMenu();

                    if(opcao == -1) {
                        continue;
                    }

                    else if(opcao == 1) { // Buscar Cliente

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
                        }catch (Exception e){
                            System.out.println("Houve um erro ao tentar buscar");
                            msgApertarTecla();
                        }
                    }

                    else if(opcao == 2) { // Buscar Funcionário
                        System.out.print("Nome para busca: ");
                        stringBusca = scanner.nextLine();

                        try{
                            Pessoa p = buscarPessoa(funcionarios, stringBusca);
                            if(p == null) {
                                System.out.println("Não há pessoas com esse nome!");
                                msgApertarTecla();
                            } else {
                                ((Funcionario) p).exibir();
                                msgApertarTecla();
                            }
                        }catch(IndexOutOfBoundsException e){
                            System.out.println("Input inválido, tente novamente!");
                            msgApertarTecla();
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            System.out.println("Houve um erro ao tentar buscar");
                            msgApertarTecla();
                        }

                    }

                    else if(opcao ==3) { //Buscar Carro

                        Carro c;

                        while(true) {
                            exibirMenu("Buscar Carro", menuBuscaCarro);
                            opcao = inputEscolhaMenu();
                            try{
                                if(opcao == -1) {
                                    continue;
                                }
                                else if(opcao == 1) {
                                    System.out.print("Descrição para busca: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 0);

                                    if(c == null) {
                                        System.out.println("Não há carros com esta descrição!");
                                        msgApertarTecla();
                                    } else {
                                        c.exibir();
                                        msgApertarTecla();
                                    }
                                }
                                else if(opcao == 2) {
                                    System.out.print("Preço para busca: ");
                                    try {
                                        preco = scanner.nextDouble();
                                        scanner.nextLine();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Caracter Inválido");
                                        scanner.nextLine();
                                        msgApertarTecla();
                                        continue;
                                    }

                                    c = buscarCarro(carros, preco);

                                    if(c == null) {
                                        System.out.println("Não há carros com este preço!");
                                        msgApertarTecla();
                                    } else {
                                        c.exibir();
                                        msgApertarTecla();
                                    }
                                }
                                else if(opcao == 3) {
                                    System.out.print("Marca para busca: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 1);

                                    if(c == null) {
                                        System.out.println("Não há carros desta marca!");
                                        msgApertarTecla();
                                    } else {
                                        c.exibir();
                                        msgApertarTecla();
                                    }
                                }
                                else if (opcao == 4) {
                                    System.out.print("Modelo para busca: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 2);

                                    if(c == null) {
                                        System.out.println("Não há carros deste modelo!");
                                        msgApertarTecla();
                                    } else {
                                        c.exibir();
                                        msgApertarTecla();
                                    }
                                }
                                else if(opcao == 5) {
                                    break;
                                }
                                else {
                                    System.out.println("Opção inexistente");
                                    msgApertarTecla();
                                }
                            }catch (IndexOutOfBoundsException e){
                                System.out.println("Input inválido, tente novamente!");
                                msgApertarTecla();
                            }catch(Exception e){
                                System.out.println("Houve um erro ao realizar a busca, tente novamente!");
                                msgApertarTecla();
                            }

                        }
                    }

                    else if(opcao == 4) {
                        break;
                    }

                    else {
                        System.out.println("Opção inexistente");
                        msgApertarTecla();
                    }
                }
            }
            else if(opcao == 3) { // menu Deletar
                while(true) {
                    exibirMenu("Menu Deletar", menuDeletar);
                    opcao = inputEscolhaMenu();

                    if(opcao == -1) {
                        continue;
                    }
                    else if(opcao == 1) { //Deletar Clientes

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
                        }catch(Exception e){
                            System.out.println("Houve um erro ao tentar apagar o cliente, tente novamente");
                            msgApertarTecla();
                        }

                    }
                    else if (opcao == 2) { // Deletar Funcionário

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
                        }catch (Exception e){
                            System.out.println("Houve um erro ao tentar apagar o funcionário!");
                            msgApertarTecla();
                        }

                    }
                    else if (opcao == 3) { // Deletar Carro
                        Carro c;

                        while(true) {
                            exibirMenu("Deletar Carro", menuBuscaCarro);
                            opcao = inputEscolhaMenu();

                            try{
                                if(opcao == -1) {
                                    continue;
                                }
                                else if(opcao == 1) {
                                    System.out.print("Descrição do carro para deletar: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 0);

                                    if(c == null) {
                                        System.out.println("Não há carros com esta descrição!");
                                        msgApertarTecla();
                                    } else {
                                        while(true) {
                                            System.out.println();
                                            System.out.print("Deseja realmente excluir este carro?[s/n]: ");
                                            simOuNao = scanner.nextLine().toLowerCase();

                                            if(simOuNao.equals("s")) {
                                                System.out.println("Carro excluído");
                                                carros.remove(c);
                                                break;
                                            } else if(simOuNao.equals("n")){
                                                System.out.println("Carro não excluído");
                                                break;
                                            } else {
                                                System.out.println("Opção invalida");
                                                continue;
                                            }
                                        }
                                    }
                                }
                                else if(opcao == 2) {
                                    System.out.print("Preço do carro para deletar: ");
                                    try {
                                        preco = scanner.nextDouble();
                                        scanner.nextLine();
                                    } catch (InputMismatchException e) {
                                        System.out.println("Caracter Inválido");
                                        scanner.nextLine();
                                        msgApertarTecla();
                                        continue;
                                    }

                                    c = buscarCarro(carros, preco);

                                    if(c == null) {
                                        System.out.println("Não há carros com este preço!");
                                        msgApertarTecla();
                                    } else {
                                        while(true) {
                                            System.out.println();
                                            System.out.print("Deseja realmente excluir este carro?[s/n]: ");
                                            simOuNao = scanner.nextLine().toLowerCase();

                                            if(simOuNao.equals("s")) {
                                                System.out.println("Carro excluído");
                                                carros.remove(c);
                                                break;
                                            } else if(simOuNao.equals("n")){
                                                System.out.println("Carro não excluído");
                                                break;
                                            } else {
                                                System.out.println("Opção invalida");
                                                continue;
                                            }
                                        }
                                    }
                                }
                                else if(opcao == 3) {
                                    System.out.print("Marca do carro para deletar: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 1);

                                    if(c == null) {
                                        System.out.println("Não há carros desta marca!");
                                        msgApertarTecla();
                                    } else {
                                        while(true) {
                                            System.out.println();
                                            System.out.print("Deseja realmente excluir este carro?[s/n]: ");
                                            simOuNao = scanner.nextLine().toLowerCase();

                                            if(simOuNao.equals("s")) {
                                                System.out.println("Carro excluído");
                                                carros.remove(c);
                                                break;
                                            } else if(simOuNao.equals("n")){
                                                System.out.println("Carro não excluído");
                                                break;
                                            } else {
                                                System.out.println("Opção invalida");
                                                continue;
                                            }
                                        }
                                    }
                                }
                                else if (opcao == 4) {
                                    System.out.print("Modelo do carro para deletar: ");
                                    stringBusca = scanner.nextLine();

                                    c = buscarCarro(carros, stringBusca, 2);

                                    if(c == null) {
                                        System.out.println("Não há carros deste modelo!");
                                        msgApertarTecla();
                                    } else {
                                        while(true) {
                                            System.out.println();
                                            System.out.print("Deseja realmente excluir este carro?[s/n]: ");
                                            simOuNao = scanner.nextLine().toLowerCase();

                                            if(simOuNao.equals("s")) {
                                                System.out.println("Carro excluído");
                                                carros.remove(c);
                                                break;
                                            } else if(simOuNao.equals("n")){
                                                System.out.println("Carro não excluído");
                                                break;
                                            } else {
                                                System.out.println("Opção invalida");
                                                continue;
                                            }
                                        }
                                    }
                                }
                                else if(opcao == 5) {
                                    break;
                                }
                                else {
                                    System.out.println("Opção inexistente");
                                    msgApertarTecla();
                                }
                            }catch (Exception e){
                                System.out.println(e.getMessage());
                                System.out.println("Houve um erro ao tentar apagar o carro, tente novamente");
                                msgApertarTecla();
                            }
                        }
                    }
                    else if(opcao == 4) {
                        break;
                    }
                }
            }
            else if(opcao == 4) { // Stat cliente

                try{
                    System.out.println();
                    if(clientes.size() > 0) {
                        System.out.println("Cliente mais velho: " + nomeMaiorIdade(clientes).getNome() + ", " + nomeMaiorIdade(clientes).getIdade() + " anos");
                        System.out.println("Cliente mais novo: " + nomeMenorIdade(clientes).getNome() + ", " + nomeMenorIdade(clientes).getIdade() + " anos");
                        System.out.println("Quantidade de clientes maiores de 60 anos: " + quantidadeMaiorSessenta(clientes));
                        System.out.println("Quantidade de clientes menores de 18 anos: "  + quantidadeMenordezoito(clientes));
                        System.out.println("Idade média: " + calcularIdadeMedia(clientes) + " anos");

                        msgApertarTecla();
                    } else {
                        System.out.println("Não há clientes cadastrados no sistema!");
                        msgApertarTecla();
                    }
                }catch (Exception e){
                    System.out.println("Erro ao informar estatísticas dos cliente, tente novamente");
                    msgApertarTecla();
                }



            }
            else if(opcao == 5) { // Stat carro

                try{
                    System.out.println();
                    if(carros.size() > 0) {
                        carroMaisCaro = carroMaisCaro(carros);
                        carroMaisBarato = carroMaisBarato(carros);
                        precoMedio = precoMedio(carros);
                        precosAcimaDaMedia = precosAcimaDaMedia(carros);

                        System.out.println("Carro mais caro: " + carroMaisCaro.getMarca() + " " + carroMaisCaro.getModelo() + " - R$" + carroMaisCaro.getPreco());
                        System.out.println("Carro mais barato: " + carroMaisBarato.getMarca() + " " + carroMaisBarato.getModelo() + " - R$" + carroMaisBarato.getPreco());
                        System.out.println("Preço médio: R$" + precoMedio);
                        System.out.println("Quantidade de carros com preço acima da média: " + precosAcimaDaMedia);
                        msgApertarTecla();
                    } else {
                        System.out.println("Não há carros no estoque!");
                        msgApertarTecla();
                    }
                }catch (Exception e){
                    System.out.println("Erro ao exibir estatísticas dos carros, tente novamente");
                    msgApertarTecla();
                }
            }
            else if(opcao == 6) {
                break;
            }
            else {
                System.out.print("Opção inválida");
                msgApertarTecla();
            }
        }
    }
}