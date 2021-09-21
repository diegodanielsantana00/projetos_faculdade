import java.util.Scanner;


public class Prova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeAplicativos = 113;
        int primeiroAno[] = new int[numeroDeAplicativos];
        int segundoAno[] = new int[numeroDeAplicativos];
        int somaDosMeses[] = new int[2];


        // Entrada de Dados do mês // e Print do Resultado
        System.out.printf("---------------- Entradas de Download por mês por aplicativo\n");

        dadosPreenchimento(scanner, numeroDeAplicativos, primeiroAno, "2019");
        dadosPreenchimento(scanner, numeroDeAplicativos, segundoAno, "2020");
        somaDosMeses[0] = somaMeses(primeiroAno, "2019", somaDosMeses[0], numeroDeAplicativos);
        somaDosMeses[1] = somaMeses(segundoAno, "2020", somaDosMeses[1], numeroDeAplicativos);
        comparar(primeiroAno, segundoAno, numeroDeAplicativos, somaDosMeses);

        

        
        
    }

    public static void dadosPreenchimento(Scanner scanner, int mes, int[] vetor, String ano) {
        for (int i = 0; i < mes; i++) {
            int base = i+1;
            System.out.printf("Quantos download teve no " + base + "º Aplicativo no ano " + ano+ " :\n");
            vetor[i] = scanner.nextInt();
            
        }
    }

    public static int somaMeses(int[] vetor, String ano, int soma, int numeroDeAplicativos) {
        
        for(int i = 0; i < numeroDeAplicativos; i++){
            soma = soma +  vetor[i]; 
        }

     System.out.printf("A soma do ano " + ano + " deu: " + soma + "\n");

     return soma;
    }

    public static void comparar(int[] vetor2019, int[] vetor2020, int numeroDeAplicativos, int[] soma) {
        
        System.out.printf("Iniciando Comparações---------\n");

        for(int i = 0; i < numeroDeAplicativos; i++){
            int base = i+1;
             if (vetor2019[i] == vetor2020[i]) {
                System.out.printf("O aplicativo N" + base + "º em 2019(" + vetor2019[i] + ") obteve a quantidade igual em 2020(" + vetor2020[i] + ").\n");
             } else if (vetor2019[i] > vetor2020[i]){
                System.out.printf("O aplicativo N" + base + "º em 2019(" + vetor2019[i] + ") obteve mais dowload que 2020(" + vetor2020[i] + ").\n");
             } else {
                System.out.printf("O aplicativo N" + base + "º em 2019(" + vetor2019[i] + ")) obteve menos dowload que 2020(" + vetor2020[i] + ").O ano de 2020(" + vetor2020[i] + ") foi Melhor\n");
             }
        }

        System.out.printf("---------------------------\n");
        if (soma[0] == soma[1]) {
            System.out.printf("O ano de 2019(" + soma[0] + ") obteve a quantidade igual no ano de 2020(" + soma[1] + ").\n");
        }else if(soma[0] > soma[1]) {
            System.out.printf("O ano de 2019(" + soma[0] + ")  obteve a quantidade maior que no ano de 2020(" + soma[1] + ").\n");
        }else {
            System.out.printf("O ano de 2019(" + soma[0] + ")  obteve a quantidade menor que no ano de 2020(" + soma[1] + "). O ano de 2020(" + soma[1] + ") foi maior\n");
        }

    }
    

}