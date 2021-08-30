import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 30;
        int soma = 0;
        int A[] = new int[n];

        int i;
        // Entrada de Dados no A
        for (i = 0; i < n; i++) {
            System.out.printf("Informe de A %2d de %d: ", (i + 1), n);
            A[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++) {
            soma += A[i];
        }
        
        // Saída
        System.out.printf("Soma de todos os números = " + soma);
        scanner.close();
        
    }

}