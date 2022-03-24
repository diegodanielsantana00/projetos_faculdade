
public class ContaImposta {
    boolean pagarImposto;
    double taxaimposto;
    
    
    public ContaImposta(){
        this.pagarImposto = true;
        this.taxaimposto = 0.1;
    }
    
    public double ObterTaxa(){
        return this.taxaimposto/100;
    }
  
    public boolean ObterPagarImposto(){
        return this.pagarImposto;
    }
}