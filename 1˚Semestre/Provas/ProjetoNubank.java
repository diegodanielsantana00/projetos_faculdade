
import java.util.Scanner;

public class ProjetoNubank {

    public static void matriculaImpar(float fatura){
        int dia;
        int data_limite = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da sua fatura: ");
        fatura = input.nextFloat();
        System.out.println("Digite o dia do pagamento: ");
        dia = input.nextInt();
        //
        if(dia < data_limite){
            fatura -= fatura * 0.05;
            System.out.println("O valor final da fatura com desconto de 5% é: " + fatura);
            System.out.println("Programa descontinuado");
        } else if(dia == data_limite){
            System.out.println("A sua fatura não tem desconto, o valor dela é: " + fatura);
            System.out.println("Programa descontinuado");
        } else if(dia > data_limite){
            int dia_excedido = dia - data_limite;
            fatura += fatura * (0.02 + 0.01) * dia_excedido;
            System.out.println("O valor da sua fatura com acréscimo de 2% + 1% por dia atrasado é: " + fatura);
            System.out.println("Programa descontinuado");
        }
    
}

    public static void main(String[] args) {
        int qtdFaturas, dia;
        int dia_excedido = 0;
        int data_limite = 5;
        float fatura = 0;
        float matricula;
        String confirmacaoDeSaida = "S";

        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite seu primeiro nome: ");
        String nome = input.next();
        System.out.println("Digite sua matricula: ");
        matricula = input.nextFloat();
        if(matricula%2 == 0){
            float faturaFinal = 0;
            int quantidadeDeFaturas;
            System.out.println("---- Seu número de matricula é par --- \n" + "Quantas faturas você deseja efetuar ?");
            quantidadeDeFaturas = input.nextInt();
            qtdFaturas = quantidadeDeFaturas;

            while (quantidadeDeFaturas > 0){
                System.out.println("Qual o valor da sua próxima fatura ?");
                fatura = input.nextFloat();

                System.out.println("Digite o dia do pagamento: ");
                dia = input.nextInt();

                if(dia < data_limite){
                    fatura -= fatura * 0.05;
                    faturaFinal = fatura;

                } else if(dia == data_limite){
                    faturaFinal = fatura;

                } else if(dia > data_limite){
                    dia_excedido = dia - data_limite;
                    fatura += fatura * (0.02 + 0.01) * dia_excedido;
                    faturaFinal = fatura;
                } 

                faturaFinal += fatura;
                quantidadeDeFaturas--;
            }


            System.out.println("\n\nO dia de vencimento da fatura é o dia 5");
            System.out.println("As condições de pagamento são: Até o dia 4, 5% de desconto");
            System.out.println("No dia 5, 2% de desconto e após isso é 2% adicionado a fatura + 1% a cada dia passado.");
            System.out.println("\nValor pago das faturas : " + faturaFinal);

            if(qtdFaturas > 1000){
                System.out.println("Meta ótima alcançada");

            }else if((qtdFaturas >= 500) && (qtdFaturas <= 999)){
                System.out.println("Meta intermediária alcançada");

            }else if((qtdFaturas >= 101) && (qtdFaturas <= 499)){
                System.out.println("Abaixo da meta");

            }else if(qtdFaturas < 100){
                System.out.println("Programa descontinuado");
            }

            char letras_alfabeto[] = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
            };
            char primeira_letra = nome.charAt(0);
            
            //Looping que passa pelo array das letras do alfabeto
            for(int i=0; i<=25; i++){
                //Testa se o nome do usuário começa com A-M
                if(i<=12){
                    if(primeira_letra == letras_alfabeto[i]){
                        fatura = faturaFinal/qtdFaturas;
                        System.out.println("Divisão da fatura final com a quantidade de faturas = " + fatura);
                        return;
                    }
                    input.close();
                }else{
                    System.out.println("Dias que passaram =" + dia_excedido);
                    return;
                } 
            }   

        } else {
            System.out.println("--- Seu número de matrícula e impar ---");
            System.out.println("O dia de vencimento da fatura é 5");
            System.out.println("As condições de pagamento são: Até o dia 4, 5% de desconto");
            System.out.println("No dia 5, 2% de desconto e após isso é 2% adicionado a fatura + 1% a cada dia passado.");

            System.out.println("Digite o valor da sua fatura: ");
            fatura = input.nextFloat();
            System.out.println("Digite o dia do pagamento: ");
            dia = input.nextInt();

            if(dia < data_limite){
                fatura -= fatura * 0.05;
                System.out.println("O valor final da fatura com desconto de 5% é: " + fatura);
            } else if(dia == data_limite){
                System.out.println("A sua fatura não tem desconto, o valor dela é: " + fatura);
            } else if(dia > data_limite){
                dia_excedido = dia - data_limite;
                fatura += fatura * (0.02 + 0.01) * dia_excedido;
                System.out.println("O valor da sua fatura com acréscimo de 2% + 1% por dia atrasado é: " + fatura);
            }

            System.out.println("\n\nVocê deseja adicionar mais uma fatura?\n(S) Para sim \n(Outras teclas) Para não");
            confirmacaoDeSaida = input.next();

            if (confirmacaoDeSaida.equalsIgnoreCase("s")) {
                matriculaImpar(fatura);
            }else{
                System.out.println("Programa descontinuado");
            }

            char letras_alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                                  'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            char primeira_letra = nome.charAt(0);
            //Looping que passa pelo array das letras do alfabeto
            for(int i=0; i<=25; i++){
                //Testa se o nome do usuário começa com A-M
                if(i<=12){
                    if(primeira_letra == letras_alfabeto[i]){
                        fatura = fatura/2;
                        System.out.println("Divisão da fatura final com a quantidade de faturas = " + fatura);
                        return;
                    }
                    input.close();
                }else{
                        System.out.println("Dias que passaram =" + dia_excedido);
                        return;
                } 
            }

        }

        input.close();
    }
}