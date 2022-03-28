
public class ContaEspecial {
    double limiteDaConta;
    boolean contaEspecial;
    
    
    public ContaEspecial(){
        
    }
    
    public void SetarLimite(double limiteDaConta){
        this.limiteDaConta = limiteDaConta;
    }
    
    public double ObterLimite(double limiteDaConta){
        this.limiteDaConta = limiteDaConta;
        return this.limiteDaConta;
    }
}
