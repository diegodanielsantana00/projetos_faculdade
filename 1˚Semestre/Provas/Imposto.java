
import java.util.Scanner;

public class Imposto {
    private static double valorDoItem, valorDoItemComImposto, imposto, taxaDeImposto;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("-Calculadora de imposto-");
        System.out.println("Digite o valor do seu produto");
        valorDoItem = input.nextInt();
        System.out.println("Qual a taxa de imposto da sua cidade?");
        taxaDeImposto = input.nextInt();
        if (taxaDeImposto <= 100){
        somaImposto();
        System.out.println("------------------------------");
        System.out.println("IMPOSTO ESTADUAL: " + taxaDeImposto*100 +"%");
        System.out.println("Valor do produto: " + valorDoItem);
        System.out.println("ICMS: " + imposto);
        System.out.println("Seu produto com imposto inserido: " + valorDoItemComImposto);
        }else{
            System.out.println("Seu valor não é maior que 100");
        }
    }


    public static void somaImposto(){
        taxaDeImposto = taxaDeImposto/100;
        imposto = valorDoItem*taxaDeImposto;
        valorDoItemComImposto = imposto + valorDoItem;
    } 
}