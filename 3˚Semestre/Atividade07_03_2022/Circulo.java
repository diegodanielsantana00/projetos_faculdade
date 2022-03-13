import java.util.Scanner;

public class Circulo {
    private double raio;

    public Circulo() {
        this.raio = 2;
        CalcularCircuferencia(this);
    }

    public double RetornoRaio() {
        return this.raio;
    }

    public void CadastrarRaio() {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o novo Raio: ");
        this.raio = in.nextDouble();

        System.out.println("Nova Circunferência: " + CalcularCircuferencia(this) + " ");
    }

    public void VerificarPontos() {
        double pontos[];
        pontos = new double[5];
        String retorno = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o 1 Ponto: ");
         pontos[0] = in.nextDouble();
        System.out.print("Informe o 2 Ponto: ");
         pontos[1] = in.nextDouble();
        System.out.print("Informe o 3 Ponto: ");
         pontos[2] = in.nextDouble();
        System.out.print("Informe o 4 Ponto: ");
         pontos[3] = in.nextDouble();
        System.out.print("Informe o 5 Ponto: ");
         pontos[4] = in.nextDouble();

         for (int i = 0; i < pontos.length; i++) {
            double circuferenciaTemp = 2 * Math.PI * pontos[i];
             if(circuferenciaTemp <= CalcularCircuferencia(this)){
                retorno += pontos[i] + ", ";
             }
         }

        System.out.println("Os pontos " + retorno + " Estão dentro da circuferencia ");
    }

    public double CalcularCircuferencia(Circulo circulo) {

        // #region Calculo Circuferencia
        double circuferencia = 2 * Math.PI * circulo.raio;
        // #endregion

        return circuferencia;
    }

}