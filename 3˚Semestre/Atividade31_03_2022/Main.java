import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String controllerCriarConta = "1", controllerSaida = "n";
        int numeroOpcao, numeroConta = 0;
        ArrayList<ContaGeral> contas = new ArrayList<ContaGeral>();

        while (controllerSaida.equals("n")) {
            if (controllerCriarConta.equals("1")) {
                System.out.println("Contas Disponiveis: " + contas.size());
                for (int i = 0; i < contas.size(); i++) {
                    System.out.println(i + " - " + contas.get(i).RetornarResumoConta());
                }
                System.out.println("Selecione uma conta ou crie uma nova digitando 'Abrir' " + contas.size());
                String nomeTemporary = in.next();
                switch (nomeTemporary) {
                    case "Abrir":
                        controllerCriarConta = "2";                        
                }
                if (controllerCriarConta.equals("1")) {
                    numeroConta = Integer.parseInt(nomeTemporary);
                    controllerCriarConta = "3";
                }
            }

            if (controllerCriarConta.equals("2")) {
                numeroConta = contas.size()+1;
                System.out.println("Digite seu nome: ");
                String nomeTemporary = in.next();
                System.out.println("Digite seu CPF: ");
                String cpf = in.next();
                ContaGeral contaGeral = new ContaCorrente(nomeTemporary, cpf);
                ContaGeral contaPoupanca = new ContaPoupanca(nomeTemporary, cpf);
                contas.add(contaGeral);
                contas.add(contaPoupanca);
                controllerCriarConta = "3";
            }

            if (controllerCriarConta.equals("3")) {
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
                        System.out.println("Insira seu nome: ");
                        String nomeTemporary = in.next();
                        // contas.get(numeroConta).inserirDadosConta(nomeTemporary);
                        break;
                    case 2:
                        contas.get(numeroConta).MostrarDados();
                        break;
                    case 3:
                        System.out.println("Insira o valor que você quer depositar: ");
                        double valueTemporary = in.nextDouble();
                        contas.get(numeroConta).Depositar(valueTemporary);
                        break;
                    case 4:
                        System.out.println("Insira o valor que você quer sacar: ");
                        double valueSaqueTemporary = in.nextDouble();
                        contas.get(numeroConta).Depositar(valueSaqueTemporary);
                        break;
                    case 5:
                        contas.get(numeroConta).MostrarSaldo();
                        break;
                    case 6:
                        contas.get(numeroConta).MostrarExtrato();
                        break;
                    case 7:
                        break;

                    default:
                        break;
                }

            }
        }
    }
}