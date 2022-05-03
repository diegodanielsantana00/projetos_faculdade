
public class LDE { // ORDENADA em ordem crescente
    private Node primeiro;
    private int qtd;
    private Node ultimo;

    public boolean isEmpty() {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public Node buscaMelhorada(Tarefas c) {
        Node aux;
        int retorno;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    return aux;
                } else if (retorno > 0) {
                    return null;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirOrdenado(Tarefas c) {
        Node novo = new Node(c);
        Node aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    return;
                } else if (retorno > 0) {
                    anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    System.out.println("Valor inserido com sucesso!!");
                    return;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void removerTarefa(Tarefas t) {
        Node aux, aux2;
        int retorno;
        if (this.isEmpty() == true) {
            System.out.println("Tarefa não localizada");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(t);
                if (retorno == 0) {                   
                    aux2 = aux.getAnt();
                    aux.getProx().setAnt(aux2);
                    aux2.setProx(aux.getProx());
                    while (aux != null) {
                        if (aux.getProx() == null) {
                            this.ultimo = aux;
                        }
                        aux.getProx();
                    }

                    
                    this.qtd--;
                } else if (retorno > 0) {
                    System.out.println("Tarefa não localizada");
                } else {
                    aux = aux.getProx();
                }
            }
            System.out.println("Tarefa não localizada");
        }
    }

    public void exibirPorPrioridade(int t) {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem tarefas cadastradas!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().getPrioridade() == t) {
                    System.out.println(aux.getInfo());
                }
                aux = aux.getProx();
            }
        }
    }

    

    public void executarTarefa() {
        if (this.isEmpty() == true) {
            System.out.println("Não existe tarefa !!");
        } else {
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnt(null);
            System.out.println("Tarefa de Prioridade EXECUTADA!!");
        }
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem tarefas cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

}