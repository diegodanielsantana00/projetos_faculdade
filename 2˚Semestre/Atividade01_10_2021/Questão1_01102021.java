
import java.util.Scanner;
public class Questão1_01102021 {
    public static int acharVogal(String frase) {
        int controller = 0;
        char letra;
        char[] vogais = {'a','e','i','o','u'};



        for (int i = 0; i <= frase.length() - 1; i++) {
            letra = frase.charAt(i);
            for (int j = 0; j < vogais.length - 1; j++) {
                if (letra == vogais[i]) {
                    controller++;
                }
            }
        }
        return controller;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidadeVogal;
        String frase;
            System.out.println("digite uma frase: ");
            frase = in.nextLine();
            quantidadeVogal = acharVogal(frase);


            System.out.println("Quantidades de vogais presente na frase: " + quantidadeVogal);
        
    }
}