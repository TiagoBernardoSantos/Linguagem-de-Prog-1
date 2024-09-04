public class Flor {
    private String nome;
    private String cor;
    private double altura;

    public Flor(String nome, String cor, double altura) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
    }

    public void florescer() {
        System.out.println("A flor " + nome + " está florescendo.");
    }

    public void murchar() {
        System.out.println("A flor " + nome + " está murchando.");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Cor: " + cor + ", Altura: " + altura + "cm");
    }
}