import java.util.Scanner;


public class Questão1_03092021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        String name[] = new String[n];
        double firstMedia[] = new double[n];
        double secondMedia[] = new double[n];
        double mediaClass[] = new double[n];
        int i;
        // Entrada de Dados do mês // e Print do Resultado
        System.out.printf("---------------- Entradas de Alunos\n");
        dadosPreenchimento(n, firstMedia, secondMedia, name, mediaClass, scanner);
        
    }



    public static void dadosPreenchimento(int n, double[] firstMedia, double[] secondMedia, String[] name, double[] mediaClass, Scanner scanner) {
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("Me fale o nome do Aluno:\n");
            name[i] = scanner.next();
            System.out.printf("Me fale a primeira nota do aluno " + name[i] + ":\n");
            firstMedia[i] = scanner.nextDouble();
            System.out.printf("Me fale a segunda nota do aluno " + name[i] + ":\n");
            secondMedia[i] = scanner.nextDouble();
            mediaClass[i] = media(firstMedia[i], secondMedia[i], name[i]);
        }
    }

    public static double media(double firstMedia, double secondMedia, String name) {
        double media = 0;
            media = (firstMedia*2 + secondMedia*3)/5;
            System.out.printf("---------------------\n");
            System.out.printf("Media do do Aluno " + name + ": " + media + "\n");
            System.out.printf("---------------------\n");
            return media;
    }
    

}