import java.util.Scanner;

public class Questão5_03092021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 50;
        String name[] = new String[n];
        double firstMedia[] = new double[n];
        double secondMedia[] = new double[n];
        double mediaAlu[] = new double[n];
        double mediaGeral = 0;
        // Entrada de Dados do mês // e Print do Resultado
        System.out.printf("---------------- Entradas de Alunos\n");
        mediaAlu = dadosPreenchimento(n, firstMedia, secondMedia, name, mediaAlu, scanner);
        mediaGeral = mediaClass(mediaAlu, n);
        getAlunosMedia(mediaAlu, mediaGeral, n);
        maiorValor(mediaAlu, n);
    

    }

    public static double[] dadosPreenchimento(int n, double[] firstMedia, double[] secondMedia, String[] name,
            double[] mediaAlu, Scanner scanner) {
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("Me fale o nome do Aluno:\n");
            name[i] = scanner.next();
            System.out.printf("Me fale a primeira nota do aluno " + name[i] + ":\n");
            firstMedia[i] = scanner.nextDouble();
            System.out.printf("Me fale a segunda nota do aluno " + name[i] + ":\n");
            secondMedia[i] = scanner.nextDouble();
            mediaAlu[i] = media(firstMedia[i], secondMedia[i], name[i]);
        }
        return mediaAlu;
    }
    

    public static double media(double firstMedia, double secondMedia, String name) {
        double media = 0;
        media = (firstMedia * 2 + secondMedia * 3) / 5;
        System.out.printf("---------------------\n");
        System.out.printf("Media do do Aluno " + name + ": " + media + "\n");
        System.out.printf("---------------------\n");
        return media;
    }

    public static double mediaClass(double mediaAlu[], int n) {
        int i = 0;
        double mediaClassDef = 0;
        for (i = 0; i < n; i++) {
            mediaClassDef =  mediaClassDef + mediaAlu[i];
        }
        mediaClassDef = mediaClassDef / n;
        System.out.printf("---------------------\n");
        System.out.printf("Media da Turma: " + mediaClassDef + "\n");
        System.out.printf("---------------------\n");
        return mediaClassDef;
    }

    public static void getAlunosMedia(double[] alunos, double Media, int n) {
        int i = 0;
        double porcentagem = 0;
        for (i = 0; i < n; i++) {
            if (alunos[i] >= Media) {
                porcentagem++;
            }else {

            }
        }
        porcentagem = (porcentagem/n) * 100;
        System.out.printf("Porcentagem de alunos acima da media é de: " +  porcentagem);
    }

    public static void maiorValor(double[] alunos, int n) {
        double max = alunos[0];
        for (int i = 1; i < n; i++) {
           if (alunos[i] > max) 
               max = alunos[i];
        }
        System.out.printf("\nMaior media: " +  max);
    }

}