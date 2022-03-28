import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

public class Lancamento {
    private Long id;
    private String descricao;
    private Date dataCriacao;
    private boolean fixo;
    private BigDecimal valorLancamento;

    private Categoria categoria;
    private boolean lancamentoDespesas;
    private LancamentoDespesasParcelado lancamentoDespesasParcelado;
    private boolean lancamentoReceita;
    private ItemLancamento itemLancamento;

    public Lancamento(BigDecimal valorLancamento, int idCategoria, String decricao, int parcelas) {
        this.dataCriacao = new Date();
        this.valorLancamento = valorLancamento;
        this.descricao = decricao;
        this.lancamentoReceita = idCategoria == 1 ? true : false;
        this.lancamentoDespesas = idCategoria == 2 ? true : false;
        this.id = new Random().nextLong();
        lancamentoDespesasParcelado = new LancamentoDespesasParcelado(parcelas, valorLancamento);
    }


    public String RetornarResumo() {
        String retorno = "";
        switch (categoria.getId()) {
            case 1:
                retorno = "id:" + this.id + " - Valor: " + valorLancamento + " - Descrição: " + this.descricao + " (+) ";
                break;
            case 2:
                retorno = "id:" + this.id + " - Valor: " + valorLancamento + " - Descrição: " + this.descricao + " (-) ";
                break; 
            case 3:
                retorno = "id:" + this.id + " - Valor: " + valorLancamento + " - Descrição: " + this.descricao + " - Parcelas: " + this.lancamentoDespesasParcelado.getParcelas() + " (-) ";
                break; 
        }

        return retorno;

    }

}
