import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ContaGeral {

    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    
    ArrayList<Movimentacao> extrato = new ArrayList<Movimentacao>();

    Date dataDeAbertura;
    int numeroDaConta;
    double saldo;
    String nome;

    public ContaGeral() {
        this.saldo = 0;
        this.numeroDaConta = new Random().nextInt(9999999);
        this.dataDeAbertura = new Date();
    }

    public void inserirDadosConta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void MostrarDados() {
        System.out.println("--------- Conta -----------");
        System.out.println("Numero da Conta: " + this.numeroDaConta);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("");
        System.out.println("Taxa de saque: " + this.contaCorrente.getTaxaDeOperacao());
        System.out.println("Limite: " + this.contaCorrente.getLimite());

    }

    public void Depositar(double valor) {
        this.saldo = this.saldo + valor;
        Date dataController = new Date();
        Movimentacao aux = new Movimentacao();
        aux.setarMovimentacao(valor, "+", "Deposito", dataController);
        extrato.add(aux);
    }

    public void Sacar(double valor) {
        double controllerValor = this.saldo - valor;

        if (controllerValor <= this.contaCorrente.getLimite() + 1) {
            System.out.println("Não é possivel sacar o valor, pois esta abaixo do limite");
        } else {
            this.saldo = this.saldo - valor;
            Date dataController = new Date();
            Movimentacao aux = new Movimentacao();
            aux.setarMovimentacao(valor, "-", "Saque", dataController);
            extrato.add(aux);
            System.out.println("Um valor de R$" + valor + " foi sacado, saldo restante: " + this.saldo);
        }
    }

    public void MostrarSaldo() {
        System.out.println("Seu saldo é de: " + this.saldo);
    }

    public void MostrarExtrato() {
        for (int i = 0; i < extrato.size(); i++) {
            extrato.get(i).RetornarResumo();
        }
    }

    public String RetornarResumoConta() {
        return " Numero da conta " + this.numeroDaConta + " Data de Abertura: " + this.dataDeAbertura;
    }

    public void Receber(double valor, String descricao) {
        this.saldo = this.saldo + valor;
        Date dataController = new Date();
        Movimentacao aux = new Movimentacao();
        aux.setarMovimentacao(valor, "+", "Recebimento - " + descricao , dataController);
        extrato.add(aux);
    }

    public boolean Debitar(double valor, String descricao) {
        boolean result = false;
        result = (this.saldo - valor) >= 0;
        if (result) {
            this.saldo = this.saldo - valor;
        }
        return result;
    }


    public void Transferir(ContaGeral contaTransferencia, double valor) {
        // try {
        //     this.Debitar(valor, "Transferencia para " + contaTransferencia.getNome());
        //     contaTransferencia.Receber(valor, contaTransferencia.getNome());


        // } catch (SaldoInsuficienteException e) {
        //     System.out.println(e.getMessage());
        //     System.out.println("Saldo/Conta");
        //     System.out.println(e.getSaldo()+"/"+e.getConta());
            
        // } catch (ContaInexistenteException e) {
        //     System.out.println(e.getMessage());
        // } catch (Exception e) {
            
        // }finally {
        //     System.out.println("Transferencia Concluida");
        // }
    }

    
}
