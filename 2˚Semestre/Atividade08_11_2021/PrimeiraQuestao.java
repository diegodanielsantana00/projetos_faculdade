import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiraQuestao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String controllerSaida = "n";
        int numeroOpcao, cont = 0, controllerNumber = 0;
        int[] listaNumerosReais = new int[100];
        int[] listaNumerosReaisController; 
        while (controllerSaida.equals("n")) {

            System.out.println("----- MENU OPÇÕES ----");
            System.out.println("1 – Inserir novo valor");
            System.out.println("2 – Exibir valores");
            System.out.println("3 – Ordenar crescente");
            System.out.println("4 – Ordenar decrescente");
            System.out.println("5 – Sair do programa");
            System.out.println("Informe a opção:");
            numeroOpcao = in.nextInt();

            switch (numeroOpcao) {
            case 1:
                System.out.println("Inserira novo valor:");
                controllerNumber = in.nextInt();
                if (controllerNumber > 0) {
                    cont = cadastrarNumero(listaNumerosReais, cont, controllerNumber);
                }
                break;
            case 2:
                System.out.println("Numeros cadastrado:");
                for (int i = 0; i < cont; i++) {
                    System.out.println("- " + listaNumerosReais[i]);
                }
                break;
            case 3:
                listaNumerosReaisController = new int[cont];
                Arrays.sort(listaNumerosReais);
                for (int i = 99; i < cont-99; i--) {
                    int j = 0;
                    listaNumerosReaisController[j] = listaNumerosReais[i];
                    j++;
                }
                Arrays.sort(listaNumerosReaisController);
                // Printing the array after sorting
                System.out.println("Lista de formado crescente" + Arrays.toString(listaNumerosReaisController));
                break;
            case 4:
                
                break;
            case 5:
                controllerSaida = tirarDoPrograma();
                System.out.println("=>>>  Programa Finalizado.");

                break;

            default:
                break;
            }
        }
    }

    public static String tirarDoPrograma() {
        return "2";
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

    public static boolean buscar(int[] listaNumeros, int cont, int num) {
        boolean validation = false;
        for (int i = 0; i < cont; i++) {
            if (listaNumeros[i] == num) {
                validation = true;
            }
        }
        return validation;
    }

    public static int[] ordenacaoCrescente(int[] n, int count) {
        int quantidade = count;
        int p = 0, s = 1;
        while (p < quantidade) {
            if (n[p] > n[s]) {
                int troca = n[p];
                n[p] = n[s];
                n[s] = troca;
                p = 0;
                s = 1;
            } else {
                p++;
                s++;
            }
        }
        return n;
    }
}