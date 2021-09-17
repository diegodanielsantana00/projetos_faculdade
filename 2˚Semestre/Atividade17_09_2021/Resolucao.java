// Códigos desenvolvidos na aula do dia 14-09-2021
// Ficou como exercício de casa implementar os métodos "buscar" e "removerNumero"

import java.util.Scanner;

public class Resolucao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] listaNumeros;
        listaNumeros = new int[100];
        int op, num, cont = 0;
        boolean achou;
        do {
            exibirMenu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Informe o número a ser cadastrado: ");
                    num = in.nextInt();
                    cont = cadastrarNumero(listaNumeros, cont, num);
                    break;
                case 2:
                    exibirNumeros(listaNumeros, cont);
                    break;
                case 3:
                    System.out.print("Informe o número procurado: ");
                    num = in.nextInt();
                    achou = buscar(listaNumeros, cont, num);
                    if (achou == true) {
                        System.out.println("Número cadastrado.");
                    } else {
                        System.out.println("Número não cadastrado.");
                    }
                    break;
                case 4:
                    System.out.print("Informe o número a ser removido: ");
                    num = in.nextInt();
                    listaNumeros = removerNumero(listaNumeros, cont, num);
                    if (listaNumeros[cont-1] == 0) {
                        cont--;
                    }
                    break;
                case 0:
                    System.out.println("Fim de programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void exibirNumeros(int[] vet, int c) {
        int i;
        if (c == 0) {
            System.out.println("Lista de números vazia");
        } else {
            for (i = 0; i <= c - 1; i++) {
                System.out.print(vet[i] + " ");
            }
            System.out.println();
        }
    }

    public static int cadastrarNumero(int[] vet, int c, int n) {
        boolean achou;
        if (c == vet.length) {
            System.out.println("Vetor cheio! Inserção não realizada!");
        } else {
            achou = buscar(vet, c, n);
            if (achou == true) {
                System.out.println("Valor repetido! Inserção não efetuada!");
            } else {
                vet[c] = n;
                c = c + 1;
                System.out.println("Inserção efetuada!");
            }
        }
        return c;
    }

    public static void exibirMenu() {
        System.out.println("1 - Cadastrar um número");
        System.out.println("2 - Exibir números cadastrados");
        System.out.println("3 - Procurar um número");
        System.out.println("4 - Remover um número");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }

    public static boolean buscar(int[] listaNumeros, int cont, int num) {
        boolean validation = false;
        for (int i = 0; i < cont; i++) {
            if (listaNumeros[i] == num) {
                validation = true;
            }
        }
        return validation;
    }

    public static int[] removerNumero(int[] listaNumeros, int cont, int num) {
        boolean validation = false;
        int validationNumber = -1;
        int[] validationList = listaNumeros;
        
        for (int i = 0; i < cont; i++) {
            if (listaNumeros[i] == num) {
                validationNumber = i;
                validation = true;
            }
        }
        if (validation == false) {
            System.out.println("Número não encontrado");
        }else{
            validationList = new int[100];
            int l = 0;
            for (int i = 0; i < cont;i++) {
                if (i == validationNumber) {

                }else{
                    validationList[l] = listaNumeros[i];
                    l++;
                }
            }    
            System.out.println(cont);
            System.out.println("Número deletado com sucesso");
        }
        return validationList;
    }

}