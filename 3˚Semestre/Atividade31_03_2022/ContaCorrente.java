public class ContaCorrente extends ContaGeral{
  double taxaDeOperacao;
  double limite;
  double saldo;


  public ContaCorrente() {
    super();
  }

  public double getTaxaDeOperacao() {
    return this.taxaDeOperacao;
  }

  public void setTaxaDeOperacao(double taxaDeOperacao) {
    this.taxaDeOperacao = taxaDeOperacao;
  }

  public double getLimite() {
    return this.limite;
  }


}