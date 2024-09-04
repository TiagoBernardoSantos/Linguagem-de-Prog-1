public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private String resumo;

    public Livro(String titulo, String autor, int numeroDePaginas, String resumo) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.resumo = resumo;
    }

    public void abrir() {
        System.out.println("O livro " + titulo + " está aberto.");
    }

    public void lerPagina(int pagina) {
        System.out.println("Lendo página " + pagina + " de " + numeroDePaginas);
    }

    public void exibirResumo() {
        System.out.println("Resumo do livro: " + resumo);
    }
}