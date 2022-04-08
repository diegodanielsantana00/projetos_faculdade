public class SaldoInsuficienteException extends Exception {
    private double saldo;
    private String nome;
    

    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }

    double getSaldo() {
        return this.saldo;
    }

    double getConta() {
        return this.saldo;
    }

}
