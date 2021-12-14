import java.util.Scanner;


public class CadastroLivros {
    private Livro[] dadosLivros;
    private int quantidadeCadastrada;
    private boolean ordenado;

    public CadastroLivros(int tamanho) {
        dadosLivros = new Livro[tamanho];
    }
    
    //Exibir todos livros
    public void exibirLivros(){
        if (quantidadeCadastrada != 0) {
            for (int i = 0; i < quantidadeCadastrada; i++) {
                    System.out.println("------------------");
                    System.out.println("ISBN: " + dadosLivros[i].getISBN());
                    System.out.println("Titulo: " + dadosLivros[i].getTitulo());
                    System.out.println("Preço: " + dadosLivros[i].getPreco());
                    System.out.println("Estoque: " + dadosLivros[i].getEstoque());
                    System.out.println("------------------");
            }
        }else{
            System.out.println("Lista esta vazia");
        }
    }

    //Odernar pelo ISBN
    public void bubblesort() {
        int i, fim, pos;
        Livro chave;
        boolean troca;
        fim = this.quantidadeCadastrada - 2;
        pos = 0;
        do {
            troca = false;
            for (i = 0; i <= fim; i++) {
                if (this.dadosLivros[i].compareTo(this.dadosLivros[i + 1]) > 0) {
                    chave = this.dadosLivros[i];
                    this.dadosLivros[i] = this.dadosLivros[i + 1];
                    this.dadosLivros[i + 1] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        } while (troca == true);
        this.ordenado = true;
    }

    public void alterarPreco(String ISBN, char tipo, double perc) {
        int pos;
        Livro p;
        double preco, diferenca;
        if (this.quantidadeCadastrada == 0) {
            System.out.println("Cadastro vazio!");
        } else {
            p = new Livro(ISBN);
            pos = this.buscarLivro(p);
            if (pos == -1) {
                System.out.println("Este Livro não está cadastrado");
            } else {
                preco = this.dadosLivros[pos].getPreco();
                System.out.println("Preço atual: " + preco);
                diferenca = preco * perc / 100;
                if (tipo == '1') {
                    preco = preco + diferenca;
                } else {
                    preco = preco - diferenca;
                }
                this.dadosLivros[pos].setPreco(preco);
                System.out.println("Alteracao realizada com sucesso!");
                System.out.println("Novo preço: " + preco);
            }
        }
    }

    public int buscarLivro (Livro procurado) {
        int retorno;
        if (this.ordenado == true) {
            retorno = this.buscaBinaria (procurado);
        }
        else {
            retorno = this.buscaSimples (procurado);
        }
        return retorno;
    }

    private int buscaBinaria(Livro procurado) {
        int inicio = 0, meio, fim = this.quantidadeCadastrada - 1;
        boolean achou = false;
        do {
            meio = (inicio + fim) / 2;
            if (this.dadosLivros[meio].compareTo(procurado) == 0) {
                achou = true;
                break;
            } else if (procurado.compareTo(this.dadosLivros[meio]) < 0){
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);
        if (achou == true) {
            return meio;
        } else {
            return -1;          
        }
    }

    private int buscaSimples(Livro p) {
        int i;
        if (this.quantidadeCadastrada == 0) {
            return -1;
        } else {
            for (i = 0; i <= this.quantidadeCadastrada - 1; i++) {
                if (this.dadosLivros[i].compareTo(p) == 0) {
                    return i;
                }
            }
            return -1;
        }
    }

    public void cadastrarLivro(Livro p) {
        Scanner in = new Scanner(System.in);
        String titulo;
        double preco;
        int estoque, pos;

        if (this.quantidadeCadastrada == this.dadosLivros.length) {
            System.out.print("Cadastro cheio! ");
            System.out.println("Livro não pode ser cadastrado!");
        } else {
            pos = this.buscarLivro(p);
            if (pos == -1) {
                System.out.print("Informe o Titulo do Livro: ");
                titulo = in.nextLine();
                p.setTitulo(titulo);
                System.out.print("Informe o preço do livro: ");
                preco = in.nextDouble();
                in.nextLine();
                p.setPreco(preco);
                System.out.print("Informe o estoque do Livro: ");
                estoque = in.nextInt();
                in.nextLine();
                p.setEstoque(estoque);
                this.dadosLivros[this.quantidadeCadastrada] = p;
                this.quantidadeCadastrada++;
                this.ordenado = false;
                System.out.println("Livro cadastrado com sucesso!");
            } else {
                System.out.println("Já existe um livro com este ISBN no cadastro.");
            }
        }
    }


}