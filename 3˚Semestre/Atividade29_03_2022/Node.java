public class Node {
    private Node ant;
    private Cliente info;
    private Node prox;

    public Node(Cliente c) {
        this.info = c;
    }

    public setAnt(Node novoAnt) {
        this.ant = novoAnt;
    }
    public void setProx(Node prox) {
        this.prox = prox;
    }
    public setInfo(Cliente novoInfo) {
        this.info = novoInfo;
    }


    public Node getAnt() {
        return this.ant;
    }
    public Node getProx() {
        return this.prox;
    }
    public Cliente getInfo() {
        return this.info;
    }
}
