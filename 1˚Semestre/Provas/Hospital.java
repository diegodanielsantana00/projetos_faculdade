import java.util.Scanner;

public class Hospital {
    
    //Data de aniversario: 25/05/2002
    //Matricula: 2021107985
    //Nome: Diego Daniel Santana de Souza


    private static String autorizacao = "";
    private static int leitos = 4004, pacientesJaInternados= 0, altaDePacientes = 0, entradaDePacientes = 0, somaDasEntradas = 0, saidaDoLoop = 0;
    private static double mediaDasEntradas;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (saidaDoLoop == 0) {
        System.out.println("\nQuantos pacientes estão internados hoje ?: ");
        pacientesJaInternados = input.nextInt();
        leitos = leitos-pacientesJaInternados;
        if (pacientesJaInternados > 0 && pacientesJaInternados < 4004){
            leitos = leitos/2;
            for (int i = 0; i < 100; i++) {
            leitos = leitos*2;
            System.out.println("\nQuantos pacientes receberam alta ?: ");
            altaDePacientes = input.nextInt();
            pacientesJaInternados = pacientesJaInternados-altaDePacientes;
            leitos = leitos + altaDePacientes;
            System.out.println("\nQuantos pacientes deram entrada ?: ");
            entradaDePacientes = input.nextInt();
            somaDasEntradas += entradaDePacientes;
            leitos = leitos - entradaDePacientes;
            pacientesJaInternados = pacientesJaInternados+entradaDePacientes;
            if (pacientesJaInternados >= 4004){
            pacientesJaInternados = pacientesJaInternados-entradaDePacientes;
            System.out.println("Não temos mais cama disponivel");
            }else{
            leitos = leitos/2;
            System.out.println("Quartos disponiveis: " + leitos);
            System.out.println("Quantidade de Pacientes internados: " + pacientesJaInternados);
            }
         }
            mediaDasEntradas = somaDasEntradas/100;
            System.out.println("\nQuantidade de entradas:" + somaDasEntradas);
            System.out.println("\nMedia das entradas:" + mediaDasEntradas);
            System.out.println("\n\nDeseja fazer uma nova analise ?(S para sim e qualquer outra letra para não):");
            autorizacao = input.next();
            if(autorizacao.equalsIgnoreCase("s")){
                System.out.println("\n\n\n\n\n Reniciando....");
            }else{
                System.out.println("\nFIM");
                saidaDoLoop = 1;
            }
        }else{
        System.out.println("\nSeu número é menor que 0");
        }
    }
    }

}