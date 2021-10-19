import java.util.Scanner;

public class QuestãoUnica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String CPF;
        String validation;
        boolean result = false;
        boolean validacaoCPF = false;
        System.out.println("Digite um CPF: ");
        CPF = in.next();

        while (result == false) {
            validacaoCPF = validarCPF(CPF);
            if (validacaoCPF == true) {
                System.out.println("Seu CPF é valido ");
            } else {
                System.out.println("Seu CPF não é valido ");
            }
            System.out.println("Deseja colocar outro CPF ?");
            validation = in.next();
            if (validation.toLowerCase().equals("s")) {
                result = false;
            }else {
                result = true;  
            }
        }

    }

    public static boolean validarCPF(String CPF) {
        boolean valid = false;
        int somaCPFDigitos = 0;
        int resto = 0;
        int controller = 0;

        if (CPF.length() <= 10 || CPF.length() >= 12) {
        } else {
            if (!CPF.matches("[0-9]+")) {
            } else {
                controller = 10;
                for (int i = 0; i < CPF.length() - 2; i++) {
                    int n = Character.digit(CPF.charAt(i), 10);
                    somaCPFDigitos = somaCPFDigitos + (n * controller);
                    controller--;
                }
                resto = somaCPFDigitos % 11;
                if (resto > 2) {
                    resto = 11 - resto;
                    if (resto == Character.digit(CPF.charAt(9), 10)) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                } else {
                    if (Character.digit(CPF.charAt(9), 10) == 0) {
                        valid = true;
                    }
                }

                // segunda validacaoCPF
                if (valid == true) {
                    controller = 11;
                    somaCPFDigitos = 0;
                    for (int i = 0; i < CPF.length() - 1; i++) {
                        int n = Character.digit(CPF.charAt(i), 10);
                        somaCPFDigitos = somaCPFDigitos + (n * controller);
                        controller--;
                    }
                    resto = somaCPFDigitos % 11;

                    if (resto > 2) {
                        resto = 11 - resto;
                        if (resto == Character.digit(CPF.charAt(10), 10)) {
                            valid = true;
                        } else {
                            valid = false;
                        }
                    } else {
                        if (Character.digit(CPF.charAt(10), 10) == 0) {
                            valid = true;
                        }
                    }
                }
            }
        }

        return valid;
    }
}