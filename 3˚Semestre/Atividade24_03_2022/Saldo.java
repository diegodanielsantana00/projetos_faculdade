
import java.util.Date;


public class Saldo {
    double saldo;
    Date data;
    
    public Saldo(double saldo, Date data){
        this.saldo = saldo;
        this.data = data;
    }
    
    public Date RetornarData(){
        return this.data;
    }
    
    public double RetornarSaldo(){
        return this.saldo;
    }
}
