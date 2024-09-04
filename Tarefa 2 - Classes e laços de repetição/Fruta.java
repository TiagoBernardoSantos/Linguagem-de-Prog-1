public class Fruta {
    private String nome;
    private String epoca;
    private float peso;

    public Fruta(String nome, String epoca, float peso) {
        this.nome = nome;
        this.epoca = epoca;
        this.peso = peso;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Época: " + epoca + ", Peso: " + peso + "g");
    }

    public void atualizarPeso(float novoPeso) {
        this.peso = novoPeso;
        System.out.println("Peso atualizado para: " + peso + "g");
    }

    public void exibirEpocaDoAno() {
        System.out.println("A época de colheita de " + nome + " é " + epoca + ".");
    }
}