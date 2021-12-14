import java.util.Scanner;

public class Livraria implements Comparable<Livraria> {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroLivros livros = new CadastroLivros(100);

        char op, tipo;
        String ISBN;
        Livro p;
        double perc;

        do {
            exibeMenu();
            op = in.next().charAt(0);
            in.nextLine();
            switch (op) {
                case '1':
                    System.out.print("Informe o ISBN do Livro: ");
                    ISBN = in.nextLine();
                    p = new Livro(ISBN);
                    livros.cadastrarLivro(p);
                    break;
                case '2':
                livros.exibirLivros();
                    break;
                case '3':
                    System.out.print("Informe o ISBN do Livro: ");
                    ISBN = in.nextLine();
                    System.out.print("Informe o tipo da alteração.");
                    System.out.print("1 - Aumento ou 2 - desconto: ");
                    tipo = in.next().charAt(0);
                    in.nextLine();
                    System.out.print("Qual o percentual? ");
                    perc = in.nextDouble();
                    in.nextLine();
                    livros.alterarPreco(ISBN, tipo, perc);
                    break;
                case '4': livros.bubblesort();
                break;
                case '0':
                    System.out.println("Fim");
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != '0');
    }

    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um livro");
        System.out.println("2 - Exibir livros cadastrados");
        System.out.println("3 - Alterar preço de um livro");
        System.out.println("4 - Ordenar cadastro");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção: ");
    }

    @Override
    public int compareTo(Livraria o) {
        return 0;
    }

}