import java.util.Scanner;

public class Corridas {
    private String nomeColaborador;
    private double precoCorrida;
    private double localizacao;
    private double destino;
    private double km;
    private double tempo;

    public Corridas() {
        this.nomeColaborador = "";
        this.precoCorrida = 0;
        this.localizacao = 0;
        this.destino = 0;
        this.km = 0.0;
        this.tempo = 0.0;
    }


    public String ExibirDetalheCorrida() {
        String nomeColaborador = this.nomeColaborador.length() >= 7 ?  this.nomeColaborador.substring(0, 7) : this.nomeColaborador;
        return " " + nomeColaborador + " | " + this.precoCorrida + " | " + this.km;
    }

    public boolean VerificarCombustivel(double combustivel, double pontoMotorista) {
        boolean retorno  = true;
        if (!(0 > (combustivel - this.km))) {
            combustivel = combustivel - this.km;
            retorno = true;
        }else{
            retorno = false;
        }
        double diferencaDoPontoMotorista = combustivel - Math.abs(localizacao - pontoMotorista);
        if (diferencaDoPontoMotorista > 0 && retorno) {
            retorno = true;
        }else{
            retorno = false;
        }

        return retorno ;
    }

    public double CombustivelTotal(double pontoMotorista) {
        return this.km + Math.abs(localizacao - pontoMotorista) ;
    }

    public double ExibirTotalCorrida() {
        return this.precoCorrida ;
    }

    public double ExibirDestino() {
        return this.destino ;
    }

    public String ExibirNomePassageiro() {
        return this.nomeColaborador ;
    }
    

    
    


    public void cadastrarCorrida() {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual o seu nome ?: ");
        this.nomeColaborador = in.next();
        in.nextLine();

        System.out.print("Qual a sua localização?: ");
        this.localizacao = in.nextDouble();
        in.nextLine();

        System.out.print("Qual a seu destino?: ");
        this.destino = in.nextDouble();
        in.nextLine();

        // #region Calculo da Viagem
        double taxaFixa = 5;
        this.km = Math.abs(localizacao - destino);
        double taxaPorKM = (2 * this.km);
        double calculoTotal = taxaFixa + (taxaPorKM);
        this.precoCorrida = calculoTotal;
        // #endregion

        // #region Detalhe da Corrida
        System.out.println("-------------------------");
        System.out.println("Detalhe da corrida");
        System.out.println("");
        System.out.println("Nome do passageiro: " + this.nomeColaborador);
        System.out.println("");
        System.out.println("Taxa Fixa: " + taxaFixa);
        System.out.println("Taxa KM: " + taxaPorKM);
        System.out.println("");
        System.out.println("Total da corrida: " + calculoTotal);
        System.out.println("-------------------------");
        // #endregion
    }

    public boolean ValidarCadastro() {
        return !(this.nomeColaborador.equals("") && this.precoCorrida == 0);
    }

}