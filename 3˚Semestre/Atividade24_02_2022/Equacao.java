import java.util.Scanner;

public class Equacao {
    private double x2;
    private double x;
    private double c;

    // Exibir todos livros
    public Equacao() {

    }

    public void CadastrarEquacao() {
        Scanner in = new Scanner(System.in);

            System.out.print("Informe o x² da sua Equacao: ");
            this.x2 = in.nextDouble();
            in.nextLine();
            System.out.print("Informe o x da sua Equacao");
            this.x = in.nextDouble();
            in.nextLine();
            System.out.print("Informe o c da sua Equacao");
            this.c = in.nextInt();
            in.nextLine();
            System.out.println("Equação " + ExibirEquacao() + " cadastrada com sucesso!");
    }

    public String ExibirEquacao() {
        return this.x2 + "x² + " + this.x + "x + " + this.c + " = 0";
    }

    public double CalcularEquacao(Equacao equacao) {
        
        //#region Calculo delta
        double delta = (this.x*this.x) - 4*this.x2*this.c;
        //#endregion

        //#region Raizes
        double raiz1 = (-this.x + Math.sqrt(delta)) / (2*this.x2);
        double raiz2 = (-this.x - Math.sqrt(delta)) / (2*this.x2);
        //#endregion

        if (raiz1 >= 0) {
            System.out.println("Δ = " + delta);
            System.out.println("x' = " + raiz1);
            System.out.println("x''' = " + raiz2);
        } else {
            System.out.println("A Raiz não pode dar o resultado negativos");
        }

        return delta;
    }

}