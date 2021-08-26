import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        int i;
        // Entrada de Dados no A
        for (i = 0; i < n; i++) {
            System.out.printf("Informe de A %2d de %d: ", (i + 1), n);
            A[i] = scanner.nextInt();
        }
        // Entrada de Dados no B
        for (i = 0; i < n; i++) {
            System.out.printf("Informe de B  %2do. de %d: ", (i + 1), n);
            B[i] = scanner.nextInt();
        }
        // Desenvolvimento 
        for (i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }
        // Saída
        for (i = 0; i < n; i++) {
            System.out.printf("Valor de C[" +i+ "] = " + C[i] + "\n");
        }
    }

}