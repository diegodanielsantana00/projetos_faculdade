import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String controllerSaida = "n";
        int numeroOpcao;
        Equacao equacao = new Equacao();
        while (controllerSaida.equals("n")) {
                System.out.println("1 – Cadastro da equacao");
                System.out.println("2 – Exibir equação");
                System.out.println("3 – Calcular BHASKARA");
                numeroOpcao = in.nextInt();

                switch (numeroOpcao) {
                    case 1:
                        equacao.CadastrarEquacao();
                        break;
                    case 2:
                        System.out.println(equacao.ExibirEquacao());
                        break;
                    case 3:
                        equacao.CalcularEquacao(equacao);
                        break;
   

                    default:
                        break;
                }
        }
    }
}