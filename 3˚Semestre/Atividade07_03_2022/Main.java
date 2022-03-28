// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String controllerSaida = "n";
//         double distance = 5;
//         int numeroOpcao;
//         Circulo circulo = new Circulo();
//         while (controllerSaida.equals("n")) {
//             System.out.println("");
//             System.out.println("Seu circulo de Raio = " + circulo.RetornoRaio());
//             for (int row = 0; row <= 2 * circulo.RetornoRaio(); row++) {
//                 for (int col = 0; col <= 2 * circulo.RetornoRaio(); col++) {
//                     distance = Math.sqrt((row - circulo.RetornoRaio()) * (row - circulo.RetornoRaio())
//                             + (col - circulo.RetornoRaio()) * (col - circulo.RetornoRaio()));
//                     if (distance > circulo.RetornoRaio() - 0.5 && distance < circulo.RetornoRaio() + 0.5)
//                         System.out.print("*");
//                     else
//                         System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("");
//             System.out.println("1 – Cadastrar novo Raio de circulo");
//             System.out.println("2 – Calcular Pontos");
//             System.out.print("\nEscolha uma opção: ");
//             numeroOpcao = in.nextInt();

//             switch (numeroOpcao) {
//                 case 1:
//                     circulo.CadastrarRaio();
//                     break;
//                 case 2:
//                     circulo.VerificarPontos();
//                     break;
//                 default:
//                     System.out.println("Informe Porfavor uma opção valida");
//                     break;
//             }
//         }
//     }
// }