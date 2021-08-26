
import java.util.Scanner;

public class InverterNumero {
    private static String numeroInvertido;
    private static int numero, aprovacaoDeNumero = 0;;

    public static void main(String[] args) {
        while (aprovacaoDeNumero == 0) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para ser invertido:");
        numero = input.nextInt();
        if (numero < 1000){
            inverter(numero);
            System.out.println("Resultado do número invertido: " + numeroInvertido );
            aprovacaoDeNumero = 1;
        }else if (numero >= 1000){
            System.out.println("Número digitado é maior que 1000, Por favor digite um número menor que 1000");
        }
       }

    }


    public static void inverter(int numero){
        Integer numeroInterativo = new Integer(numero);
		String numeroConvertido = numeroInterativo.toString();
		numeroInvertido = "";
		
		for (int i=numeroConvertido.length(); i > 0; i--) {
			numeroInvertido += numeroConvertido.substring(i - 1, i);
		}
    } 
}