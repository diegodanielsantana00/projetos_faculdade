public class Node {
    private Livro info;
    private Node prox;  
    public Node (Integer value) {
        this.info = value;
    }    
    public void setInfo (Integer value) {
        this.info = value;
    }   
    public Integer getInfo() {
        return this.info;
    }    
    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }    
    public Node getProx () {
        return this.prox;
    }   
}