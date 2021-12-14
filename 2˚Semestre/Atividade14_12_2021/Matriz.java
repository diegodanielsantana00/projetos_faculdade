import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int linha, coluna;
        int [][] matriz;
        System.out.print("Informe a quantidade de linhas: ");
        linha = in.nextInt();
        while (linha <= 0) {
            System.out.print("Por favor, informe uma qtd maior que zero: ");
            linha = in.nextInt();            
        }
        System.out.print("Informe a quantidade de colunas: ");
        coluna = in.nextInt();
        while (coluna <= 0) {
            System.out.print("Por favor, informe uma qtd maior que zero: ");
            coluna = in.nextInt();            
        }
        matriz = new int [linha][coluna];
        System.out.println("Digite os valores da matriz");
        preencher(matriz);
        System.out.println("Exibição da matriz");
        exibir(matriz);
        procurarMaiorNumero(matriz);
    }   
    
    public static void exibir (int[][] mat){
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }  
    }
    
    public static void preencher (int[][] mat){
        Scanner in = new Scanner (System.in);

        int i, j;
        for (i = 0; i <= mat.length - 1; i++) {
            for (j = 0; j <= mat[i].length - 1; j++) {
                System.out.print("Digite o valor da linha: " + i + " conluna: " + j + " = ");
                mat[i][j] = in.nextInt();
            }
        }
    }

    public static void procurarMaiorNumero (int[][] mat){
        Scanner in = new Scanner (System.in);
        String retorno = "";
        int referencia = 0;
        int controllerColuna = 0;
        int i = 0;
        for (int[] js : mat) {
            for (int j2 = 0; j2 < js.length; j2++) {
                i = js[j2];
                if (referencia < i) {
                    referencia = i;
                    retorno = "O maior numero da Matriz é " + js[j2] + " Presente na coluna: " + controllerColuna + " e na linha: " + j2;
                }
            }
            controllerColuna++;
        }

        System.out.println(retorno);
    }
    
}