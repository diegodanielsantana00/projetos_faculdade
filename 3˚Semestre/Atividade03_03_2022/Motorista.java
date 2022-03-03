import java.util.Scanner;

public class Motorista {
    private String nomeMotorista;
    private double valorDia;
    private double kmDoDia;
    private double gasolinaRestante;
    private double pontoMotorista;
    private Corridas UltimaCorrida;

    public Motorista() {
        this.pontoMotorista = 0;
        this.gasolinaRestante = 20;
        this.valorDia = 10;
    }

    public double ExibirGasolina() {
        return this.gasolinaRestante;
    }

    public Corridas[] AceitarCorrida(Corridas[] corridas) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Qual numero da corrida?");
        int numeroCorridas = in.nextInt();

        if (corridas[numeroCorridas - 1].ValidarCadastro()) {
            if (corridas[numeroCorridas - 1].VerificarCombustivel(this.gasolinaRestante, this.pontoMotorista)) {
                System.out.println("---------------------");
                System.out.println("Você conseguiu completar a Carrida");
                System.out.println("Voce gastou " + corridas[numeroCorridas - 1].CombustivelTotal(this.pontoMotorista) + " l de gasolina");
                System.out.println("Voce ganhou " + corridas[numeroCorridas - 1].ExibirTotalCorrida() + " $ ");
                System.out.println("---------------------");
                this.pontoMotorista = corridas[numeroCorridas - 1].ExibirDestino();
                this.valorDia += corridas[numeroCorridas - 1].ExibirTotalCorrida();
                this.gasolinaRestante =  this.gasolinaRestante - corridas[numeroCorridas - 1].CombustivelTotal(this.pontoMotorista);
                
                for (int i = 0; i < corridas.length; i++) {
                    if (corridas[i] != null && corridas[i].ExibirNomePassageiro().equals(corridas[numeroCorridas - 1].ExibirNomePassageiro())) {
                        corridas[i] = new Corridas();
                        break;
                    }
                }
            } else {
                System.out.println("Você não tem combustivel suficiente para esta corrida, reabasteça !!");
            }
        } else {
            System.out.println("Corrida INVALIDA");
        }

        return corridas;

    }

    public void AbastecerCarro() {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Seu saldo: " + this.valorDia);
        System.out.println("Preço do combustivel: 1$/l");
        System.out.println("");
        System.out.println("Quantos litros você deseja colocar?");
        int quantidadeDeLitros = in.nextInt();

        if (quantidadeDeLitros <= this.valorDia) {
            this.gasolinaRestante = this.gasolinaRestante + quantidadeDeLitros;
        }else{
            System.out.println("");
            System.out.println("Dinheiro insuficiente");
        }
    }

    public double ExibirGanhos() {
        return this.valorDia;
    }

}