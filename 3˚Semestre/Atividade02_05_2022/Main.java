import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSEC lista = new LSEC();
        int op, num;
        do {
           exibeMenu();
           op = in.nextInt();
           switch (op) {
               case 1 : System.out.print("Informe o número inteiro: ");
                        num = in.nextInt();
                        lista.inserirInicio(num);
                        break;                   
               case 2: lista.removerPrimeiro();
                       break;   
               case 3: lista.exibirLista();
                       break;
               case 0: System.out.println("Fim de programa!!");
                       break;
               default: System.out.println("Opção inválida!!");
           }
            
        } while (op != 0);
    }
    
    public static void exibeMenu() {
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Exibir todos");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}