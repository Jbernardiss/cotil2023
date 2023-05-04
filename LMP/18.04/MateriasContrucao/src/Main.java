import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        ClientePF cpf1 = new ClientePF("Alcir", "Rua das Alegrias", 999999999, 525617621);
        ClientePF cpf2 = new ClientePF("Malaquias", "Rua das Palmeiras", 949671919, 561214629);
        ClientePF cpf3 = new ClientePF("Nair", "Rua dos Carros", 381981731, 1834081839);
        ClientePJ cnpj1 = new ClientePJ("Alcir Presentes", "Ruas das Narinas 1234", 190, 8673829);
        ClientePJ cnpj2 = new ClientePJ("Malaquias dos Carros", "Rua do Pedreiro 1872", 198, 183728918);
        ClientePJ cnpj3 = new ClientePJ("Alameda Telefones", "Rua Altair Nunes", 18367, 178436729);

        clientes.add(cpf1);
        clientes.add(cpf2);
        clientes.add(cpf3);
        clientes.add(cnpj1);
        clientes.add(cnpj2);
        clientes.add(cnpj3);

        // 1. eletrico, 2. hidráulico, 3.alvenaria

        Produto p1 = new Produto("Alvanex", 12345, 39.99, "L", 12, 3);
        Produto p2 = new Produto("Fio", 1632, 10, "M", 5, 1);
        Produto p3 = new Produto("Alicate De Fio", 85713, 69.99, "Unitário", 1, 1);
        Produto p4 = new Produto("Sabão em Pó", 57164, 87.98, "Kg", 9, 3);
        Produto p5 = new Produto("Bomba Hidráulica", 90476, 3090.00, "Unitário", 1, 2);


        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);


        for(Produto p: produtos){
            if(p.getTipo() == 1){
                System.out.println("-----");
                p.setPreco(p.getPreco() * 0.80);
                System.out.println(p.getDescricao() + " está com o preço de R$ " + p.getPreco());
            }
        }

        for(Cliente c: clientes){
            char p = c.getNome().charAt(0);
            if(p == 'A'){
                System.out.println("-----");
                System.out.println("Nome: " + c.getNome());
            }
        }

        for(Produto p: produtos){
            if((p.getTipo() == 3) && (p.getPreco() <= 100.00)){
                System.out.println("-----");
                System.out.println(p.getDescricao() + " Está abaixo de 100R$, com preço de R$" + p.getPreco());
            }
        }
    }

}