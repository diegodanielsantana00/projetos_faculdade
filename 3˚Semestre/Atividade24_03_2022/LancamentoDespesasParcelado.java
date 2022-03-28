import java.math.BigDecimal;

public class LancamentoDespesasParcelado {
    private boolean lancamentoDespesasParcelado = false;
    private int parcelas;
    private BigDecimal valorParcela;

    public LancamentoDespesasParcelado(int parcelas, BigDecimal valorTotal){
        this.valorParcela = valorTotal;
        this.parcelas = parcelas;
        this.lancamentoDespesasParcelado = true;
    }

    public int getParcelas(){
        return this.parcelas;
    };


}
