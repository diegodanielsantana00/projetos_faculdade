public class LDE {
    private Node primeiro;
    private int qtd;
    private Node ultimo;

    public boolean isEmpty (){
        return this.primeiro == null && this.qtd == 0 && this.ultimo == null;
    }

    public void inserirInicio(Cliente c) {
        Node novo = new Node(c);

        if(this.isEmpty()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }else{
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        }
        System.out.println("Adicionado com sucesso");
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                auc = aux.getProx();
            }
        }
    }


    public void inserirFinal() {
        Node aux;
        if (this.isEmpty()){
            System.out.println("Lista vazia");
        }else{
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                auc = aux.getProx();
            }
        }
    }
}