

public class Categoria {
    private Long id;
    private int idCategoria;
    private String nome;
    private String complemento;

    public Categoria(String nome, String complemento, int idCategoria) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.complemento = complemento;
    }

    public int getId() {
        return this.idCategoria;
    }
}
