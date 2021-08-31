import java.util.Scanner;


public class Questão2_31082021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 12;
        String mesAno[] = new String[n];
        double vetGanhos[] = new double[n];
        double vetGastos[] = new double[n];
        double vetLucro[] = new double[n];
        double lucroTotal = 0;
        double gastoTotal = 0;
        double ganhosTotal = 0;

        int i;
        // Entrada de Dados do mês
        mesAno[0] = "Janeiro";
        mesAno[1] = "Fevereiro";
        mesAno[2] = "Março";
        mesAno[3] = "Abril";
        mesAno[4] = "Maio";
        mesAno[5] = "Junho";
        mesAno[6] = "Julho";
        mesAno[7] = "Agosto";
        mesAno[8] = "Setembro";
        mesAno[9] = "Outubro";
        mesAno[10] = "Novembro";
        mesAno[11] = "Dezembro";

        System.out.printf("---------------- Ganhos\n");
        // Desenvolvimento do vetGanhos
        dadosPreenchimento(vetGanhos, n, mesAno, scanner, "Ganhos");
        System.out.printf("---------------- Gastos\n");
        // Desenvolvimento do vetGastos
        dadosPreenchimento(vetGastos, n, mesAno, scanner, "Gastos");
        // Calcular lucro
        calcularLucro(vetGanhos,vetGastos, vetLucro, n, mesAno );
        //Soma das variaveis
        gastoTotal = soma(vetGastos, n, gastoTotal);
        ganhosTotal = soma(vetGanhos, n, ganhosTotal);
        lucroTotal = soma(vetLucro, n, lucroTotal);
        // Prints dos resultados
        System.out.printf("------------------------\n");
        exibirVetores(vetGanhos, "Ganhos", mesAno, n);
        System.out.printf("------------------------\n");
        exibirVetores(vetGastos, "Gastos", mesAno, n);
        System.out.printf("------------------------\n");
        exibirVetores(vetLucro, "Lucros", mesAno, n);
        System.out.printf("------------------------\n");
        // Print do total
        System.out.printf("Sua loja teve um Faturamento de " + ganhosTotal + ", um Gasto de " + gastoTotal + " e um Lucro de " + lucroTotal);
        System.out.printf("------------------------\n");


        scanner.close();
    }



    public static double[] dadosPreenchimento(double[] vetor, int n, String[] mesAno, Scanner scanner, String type) {
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("Me fale seus " + type + " no mes de " + mesAno[i] + ":\n");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static double[] calcularLucro(double[] vetGanhos, double[] vetGastos, double vetLucro[], int n, String[] mesAno) {
        int i = 0;
        for (i = 0; i < n; i++) {
            vetLucro[i] = vetGanhos[i] - vetGastos[i];
        }
        return vetLucro;
    }

    public static double[] exibirVetores(double[] vetor, String type, String[] mesAno, int n) {
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.printf(" Seus " + type + " no mes de " + mesAno[i] + ": " + vetor[i] + "\n");
        }
        return vetor;
    }
    public static double soma(double[] vetor, int n, double total) {
        int i = 0;
        for (i = 0; i < n; i++) {
            total = total + vetor[i];
        }
        return total;
    }

}