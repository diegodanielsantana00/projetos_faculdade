import java.util.Scanner;

public class Questão6_03092021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 9;
        int controllerVotes = 0;;
        String controllerEnd;
        int[] votos = new int[number];
        String[] candidatos = new String[number];

        candidatos[0] = "Branco";
        candidatos[1] = "João";
        candidatos[2] = "Maria";
        candidatos[3] = "Pedro";
        candidatos[4] = "Luís";
        candidatos[5] = "Ana";
        candidatos[6] = "Luiza";
        candidatos[7] = "Silvia";
        candidatos[8] = "André";

        votos[0] = 0;
        votos[1] = 0;
        votos[2] = 0;
        votos[3] = 0;
        votos[4] = 0;
        votos[5] = 0;
        votos[6] = 0;
        votos[7] = 0;
        votos[8] = 0;

        for (int i = 0; i >= 0; i++) {
            System.out.printf("----------- VOTAÇAO - Digite um número\n");
            for (int controller = 0; controller < number; controller++) {
                System.out.printf(controller + "- Voto em " + candidatos[controller] + "\n");
            }
            System.out.printf("Digite um número:\n");
            controllerVotes = scanner.nextInt();
            if (controllerVotes <= number-1 && controllerVotes >= 0) {
                votos[controllerVotes] = votos[controllerVotes] + 1;
                System.out.printf("Existe outro leitor para votar ? ('S' ou 's' para sim, 'N' ou 'n' para não)\n");
                controllerEnd = scanner.next();
                if(controllerEnd.toLowerCase().equals("n")){
                    i = -2;
                }

            }else{
                System.out.printf("TENTE NOVAMENTE - NÚMERO INVALIDO\n");
            }
        }
        controllerVotes = 0;
        for (int controller = 0; controller < number; controller++) {      
            controllerVotes = controllerVotes + votos[controller];
            System.out.printf(controllerVotes + " SOMEI MAIS " + votos[controller] + "\n");
        }
    
        for (int controller = 0; controller < number; controller++) {
            double c = controllerVotes; 
            double porcentagem = (votos[controller]/c)*100;      
            System.out.printf("O candidato " + candidatos[controller] + " teve " + votos[controller] + " votos e ficou com a porcentagem de " + porcentagem + "\n");
        }

    

    }
    

}