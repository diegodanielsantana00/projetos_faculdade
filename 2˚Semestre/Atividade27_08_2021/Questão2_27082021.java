import java.util.Scanner;

public class Questão2_27082021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        int A[] = new int[n];
        int B[] = new int[n];
        int i;
        // Entrada de Dados no A
        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
            A[i] = scanner.nextInt();
        }
        // Desenvolvimento do B
        for (i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                B[i] = A[i] / 2;
            } else {
                B[i] = A[i] * 3;
            }
        }
        // Saída - resultado B
        for (i = 0; i < n; i++) {
            System.out.printf("A[" + i + "] = " + A[i] + " e B[" + i + "] = " + B[i] + "\n");
        }
    }

}