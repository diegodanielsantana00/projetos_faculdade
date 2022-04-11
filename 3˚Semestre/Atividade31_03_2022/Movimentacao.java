import java.util.*;

public class Movimentacao extends ContaGeral{

    private double valorMovimentado;
    private String ordem;
    private String tipo;
    private Date dataMovimentado;

    public Movimentacao(String nome, String cpf) {
        super(nome,cpf);
    }

    public void setarMovimentacao(double valorMovimentado,  String ordem, String tipo, Date dataMovimentado){
        this.valorMovimentado = valorMovimentado;
        this.ordem = ordem;
        this.tipo = tipo;
        this.dataMovimentado = dataMovimentado;
    }

    public void RetornarResumo(){
        System.out.println(this.ordem + " " + this.valorMovimentado + " " + this.tipo + " " + this.dataMovimentado);
    }
}