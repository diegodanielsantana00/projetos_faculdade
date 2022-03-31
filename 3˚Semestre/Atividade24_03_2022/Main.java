import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String controllerSaida = "n";
        int numeroOpcao;

        while (controllerSaida.equals("n")) {
                System.out.println("|------- MENU OPÇÕES ------|");
                System.out.println("|1 – Inserir dados:        |");
                System.out.println("|2 – Mostrar dados:        |");
                System.out.println("|3 – Depositar valor:      |");
                System.out.println("|4 – Sacar Valor:          |");
                System.out.println("|5 – Mostrar Saldo:        |");
                System.out.println("|6 – Consultar Extrato:    |");
                System.out.println("|7 – Troca de Conta:       |");
                System.out.println("Informe a opção:");
                numeroOpcao = in.nextInt();

                switch (numeroOpcao) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;

                    default:
                        break;
                }
        }
    }
}