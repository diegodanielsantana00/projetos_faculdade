public class LSEC {
    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    
    public boolean isEmpty () {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        }
        else {
            return false;
        }        
    }
    
    public void inserirInicio (int valor) {
        Node novo = new Node (valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);
        }
        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
            this.ultimo.setProx(this.primeiro);
        }
    }
    
    public void removerPrimeiro() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        }
        else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        }
        else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            this.ultimo.setProx(this.primeiro);
        }
    }
    
    public void exibirLista() {
        Node aux;     
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else {
            aux = this.primeiro;        
            do {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } while (aux != this.primeiro);
        }
    }  
}