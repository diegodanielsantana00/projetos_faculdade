public class Livro implements Comparable<Livro> {

    private String ISBN;
    private String titulo;
    private double preco;
    private int estoque;

    //Construtores
    public Livro(String ISBN) {
        this.ISBN = ISBN;
    }
    public Livro(String ISBN, String titulo, double preco, int estoque) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Métodos GET
    public String getISBN() {
        return this.ISBN;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getEstoque() {
        return this.estoque;
    }
   

    // Métodos SET
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    //ToString
    // public String toString(Livro pa) {
    //     return " X = " + pa.x + "\n Y = " + pa.y + "\n Z = " + pa.z + "\n";
    // }

    // public String toStringThisClasse() {
    //     return " X = " + this.x + "\n Y = " + this.y + "\n Z = " + this.z + "\n";
    // }

    // CompareTo

    public int compareTo (Livro outroLivro) {
        int result;
        result = this.ISBN.compareTo(outroLivro.ISBN);
        return result;
    }



}