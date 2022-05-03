public class Tarefas implements Comparable <Tarefas>{

   private int prioridade;
   private String descricao;

   public Tarefas(String descricao, int prioridade) {
       this.descricao = descricao;
       this.prioridade = prioridade;
   }

   public int getPrioridade() {
        return prioridade;
   }
   
   
   public int compareTo (Tarefas c) {
       int retorno;
       retorno = this.descricao.compareTo(c.descricao);
       return retorno;        
   }
}
