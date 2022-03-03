import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String controllerSaida = "n", controllerTralho = "ON";
        int numeroOpcao, controllerNumber = 0;
        Corridas corridas[] = new Corridas[5];
        for (int index = 0; index < corridas.length; index++) {
            corridas[index] = new Corridas();
        }
        Motorista motorista = new Motorista();
        while (controllerSaida.equals("n")) {
            if (controllerTralho.equals("ON")) {
                System.out.println("|------- MENU OPÇÕES ------|   |------- Lista Corrida ------|");
                System.out.println("|1 – Aceitar Corrida       |   |  Nome   -   Valor   -   Km | ");
                System.out.println("|2 – Saldo do Dia          |   |1º " + corridas[0].ExibirDetalheCorrida());
                System.out.println("|3 – Abastecer o Carro     |   |2º " + corridas[1].ExibirDetalheCorrida());
                System.out.println("|4 – Cadastrar Corrida     |   |3º " + corridas[2].ExibirDetalheCorrida());
                System.out.println("|5 – Pausar as corridas    |   |4º " + corridas[3].ExibirDetalheCorrida());
                System.out.println("|6 – Status do motorista   |   |5º " + corridas[4].ExibirDetalheCorrida());
                System.out.println("----------------------------   ------------------------------");
                System.out.println("Informe a opção:");
                numeroOpcao = in.nextInt();

                switch (numeroOpcao) {
                    case 1:
                        corridas = motorista.AceitarCorrida(corridas);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("----------------- Sua Gasolina: " + motorista.ExibirGasolina());
                        System.out.println("----------------- Seus Ganhos: " + motorista.ExibirGanhos());
                        System.out.println("");
                        System.out.println("");
                        break;
                    case 3:
                        motorista.AbastecerCarro();
                        break;
                    case 4:
                        for (int i = 0; i < corridas.length; i++) {
                            if (!corridas[i].ValidarCadastro()) {
                                corridas[i].cadastrarCorrida();
                                break;
                            }
                        }
                        break;
                    case 5:
                        controllerTralho = "OFF";
                        System.out.println("Você pausou o seu trabalho, Volte Sempre");
                        break;

                    case 6:
                        System.out.println("");
                        System.out.println("");
                        System.out.println("----------------- Sua Gasolina: " + motorista.ExibirGasolina());
                        System.out.println("----------------- Seus Ganhos: " + motorista.ExibirGanhos());
                        System.out.println("");
                        System.out.println("");
                        break;

                    default:
                        break;
                }
            } else {
                System.out.println("Você está OFF para entrar novamente digite 'ON' ");
                controllerTralho = in.next();
                in.nextLine();
            }
        }
    }
}