import java.util.Scanner;

public class SegundaProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigoDoProduto;
        int validation;
        
        System.out.println("Digite o Código Do Produto: ");
        codigoDoProduto = in.next();

        validation = validarCodigoDoProduto(codigoDoProduto);

        if (validation == 1) {
            System.out.println("O código " + codigoDoProduto + " é válido");
        } else if (validation == 2){
            System.out.println("O código " + codigoDoProduto + " não é válido: quantidade inválida de caracteres.");
        } else if (validation == 3) {
            System.out.println("O código " + codigoDoProduto + " não é válido: formato incorreto.");
        }

    }

    public static int validarCodigoDoProduto(String codigoDoProduto) {
        int valid = 3;
        if (codigoDoProduto.length() <= 8 || codigoDoProduto.length() >= 10){
            valid = 2;
        }else{
            if (codigoDoProduto.substring(0,1).toLowerCase().equals("a")) {
                if (!codigoDoProduto.substring(0, 4).toUpperCase().matches("[A-Z]+")) {
                    valid = 3;
                }else{
                    if (codigoDoProduto.substring(4, 9).matches("[0-9]+")) {
                        valid = 1;
                    }
                }
            }else{
                valid = 3;
            }
        }
        return valid;
    }
}