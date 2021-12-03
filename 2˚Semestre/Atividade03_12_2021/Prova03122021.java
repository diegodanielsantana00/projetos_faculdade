import java.util.Scanner;

public class Prova03122021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Paralelepipedo paralelepipedoObj = new Paralelepipedo(0, 0, 0);
        Paralelepipedo paralelepipedoObj2 = new Paralelepipedo(0, 0, 0);
        char op;
        double controllerX, controllerY, controllerZ;
        do {
            exibeMenu();

            op = in.next().charAt(0);
            in.nextLine();
            switch (op) {
                case '1':
                    System.out.print("Informe o - x - do seu Paralelepipedo:\n");
                    controllerX = in.nextDouble();
                    System.out.print("Informe o - y - do seu Paralelepipedo:\n");
                    controllerY = in.nextDouble();
                    System.out.print("Informe o - z - do seu Paralelepipedo:\n");
                    controllerZ = in.nextDouble();
                    paralelepipedoObj.cadastroXYZ(controllerX, controllerY, controllerZ);
                    break;
                case '2':
                    paralelepipedoObj.exibirValores(paralelepipedoObj);
                    break;
                case '3':
                    paralelepipedoObj.exibirVolumeCalculado();
                    break;

                case '4':
                    paralelepipedoObj.exibirAreaTotal();
                    break;
                case '5':
                    System.out.print("Informe o - x - do seu Paralelepipedo");
                    controllerX = in.nextDouble();
                    paralelepipedoObj.setX(controllerX);
                    break;
                case '6':
                    System.out.print("Informe o - y - do seu Paralelepipedo");
                    controllerY = in.nextDouble();
                    paralelepipedoObj.setX(controllerY);
                    break;
                case '7':
                    System.out.print("Informe o - z - do seu Paralelepipedo");
                    controllerZ = in.nextDouble();
                    paralelepipedoObj.setX(controllerZ);
                    break;
                case '8':
                    System.out.print("Informe um valor para X \n");
                    controllerX = in.nextDouble();
                    System.out.print("Informe um valor para Y \n");
                    controllerY = in.nextDouble();
                    System.out.print("Informe um valor para Z \n");
                    controllerZ = in.nextDouble();
                    paralelepipedoObj2.cadastroXYZ(controllerX, controllerY, controllerZ);
                    paralelepipedoObj.compareTo(paralelepipedoObj2);
                    break;
                case '0':
                    System.out.println("Fim");

                default:
                    System.out.println("Valor não encontrado -- opção inválida!");
            }
        } while (op != '0');
    }

    public static void exibeMenu() {
        System.out.println("\nOpções");
        System.out.println("1 - Cadastrar Valores (x,y,z)");
        System.out.println("2 - Exibir Valores");
        System.out.println("3 - Calcular o volume");
        System.out.println("4 - Calcular a Area Total");
        System.out.println("5 - Alterar x");
        System.out.println("6 - Alterar y");
        System.out.println("7 - Alterar z");
        System.out.println("8 - Comparar paralelepipedo");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção: ");
    }
}