
import java.util.ArrayList;
import java.util.Date;


public class ContaPoupanca extends ContaEspecial{
    int numeroDaConta;
    double saldo;
    String nome;
    ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();
    ArrayList<Saldo> saldosList = new ArrayList<Saldo>();
    ContaEspecial contaEspecial = new ContaEspecial();
    Boolean pagarImposto;
    ContaImposta contaImposta;


    public ContaPoupanca(double limiteDaConta,String nome) {
        this.nome = nome;
        this.contaEspecial.SetarLimite(limiteDaConta);
        this.pagarImposto = true;
        this.contaImposta = new ContaImposta();
    }
    
    public void Depositar(double valor){
        Saldo saldoTemporario = new Saldo(valor, new Date());
        this.saldosList.add(saldoTemporario);
        this.saldo = this.saldo + valor;
    }
    
    public double RetornarSaldo(){
        double saldoTemporario;
        saldoTemporario = this.saldo + CalcularPoupança();
        return saldoTemporario;
    }
    
    
    public void Sacar(double valor){
       double aux =  this.saldo - valor;
      if(contaImposta.ObterPagarImposto()){
         this.saldo = this.saldo - valor - (this.saldo*contaImposta.ObterTaxa());
      }else{
        if (aux > 0) {
            this.saldo = this.saldo - valor;
        }
      }
    }
    
    public double CalcularPoupança(){
        double rendimento = 0;
        Date diasAtuais = new Date();
        
        for (int i = 0; saldosList.size() < 10; i++) {
            int saldoMeses = saldosList.get(i).RetornarData().getMonth();
            rendimento = rendimento + ((saldosList.get(i).RetornarSaldo() * (2*saldoMeses))/100);
        }
        return rendimento;
    }

    public void ConsultarExtrato(){
        for (int i = 0; lancamentos.size() < 10; i++) {
            System.out.println(lancamentos.get(i).RetornarResumo());
        }
    }
}
